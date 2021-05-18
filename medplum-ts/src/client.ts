// PKCE auth ased on:
// https://aws.amazon.com/blogs/security/how-to-add-authentication-single-page-web-application-with-amazon-cognito-oauth2-implementation/

import { encryptSHA256, getRandomString } from './crypto';
import { EventTarget } from './eventtarget';
import { Binary, Bundle, Reference, Resource, Subscription, User } from './fhir';
import { parseJWTPayload } from './jwt';
import { formatSearchQuery, SearchDefinition } from './search';
import { Storage } from './storage';
import { arrayBufferToBase64 } from './utils';

const DEFAULT_BASE_URL = 'https://api.medplum.com/';
const JSON_CONTENT_TYPE = 'application/json';
const FHIR_CONTENT_TYPE = 'application/fhir+json';
const PATCH_CONTENT_TYPE = 'application/json-patch+json';

export interface MedplumClientOptions {
  /**
   * The client ID.
   * Required.
   */
  clientId: string;

  /**
   * Base server URL.
   * Optional.  Default value is "https://api.medplum.com/".
   * Use this to point to a custom Medplum deployment.
   */
  baseUrl: string;

  /**
   * OAuth2 authorize URL.
   * Optional.  Default value is baseUrl + "/oauth2/authorize".
   * Use this if you want to use a separate OAuth server.
   */
  authorizeUrl?: string;

  /**
   * OAuth2 token URL.
   * Optional.  Default value is baseUrl + "/oauth2/token".
   * Use this if you want to use a separate OAuth server.
   */
  tokenUrl?: string;

  /**
   * OAuth2 logout URL.
   * Optional.  Default value is baseUrl + "/oauth2/logout".
   * Use this if you want to use a separate OAuth server.
   */
  logoutUrl?: string;
}

interface LoginRequest {
  clientId: string;
  email: string;
  password: string;
  role: string;
  scope: string;
}

interface LoginResponse {
  user: User;
  profile: any;
  accessToken: string;
  refreshToken: string;
}

interface TokenResponse {
  token_type: string;
  id_token: string;
  access_token: string;
  refresh_token: string;
  expires_in: number;
}

export class MedplumClient extends EventTarget {
  private readonly storage: Storage;
  private readonly baseUrl: string;
  private readonly clientId: string;
  private readonly authorizeUrl: string;
  private readonly tokenUrl: string;
  private readonly logoutUrl: string;
  private user?: User;
  private profile?: Resource;

  constructor(options: MedplumClientOptions) {
    super();

    if (options.baseUrl) {
      if (!options.baseUrl.startsWith('http')) {
        throw new Error('Base URL must start with http or https');
      }
      if (!options.baseUrl.endsWith('/')) {
        throw new Error('Base URL must end with a trailing slash');
      }
    }

    if (!options.clientId) {
      throw new Error('Client ID cannot be empty');
    }

    this.storage = new Storage();
    this.baseUrl = options.baseUrl || DEFAULT_BASE_URL;
    this.clientId = options.clientId;
    this.authorizeUrl = options.authorizeUrl || this.baseUrl + 'oauth2/authorize';
    this.tokenUrl = options.tokenUrl || this.baseUrl + 'oauth2/token';
    this.logoutUrl = options.logoutUrl || this.baseUrl + 'oauth2/logout';
  }

  /**
   * Clears all auth state including local storage and session storage.
   */
  clear(): void {
    sessionStorage.clear();
    this.storage.clear();
    this.user = undefined;
    this.profile = undefined;
    this.dispatchEvent(new Event('change'));
  }

  /**
   * Returns a display string for the resource.
   * @param resource The input resource.
   * @return Human friendly display string.
   */
  getDisplayString(resource: Resource): string {
    if (resource.resourceType === 'Patient' ||
      resource.resourceType === 'Practitioner') {
      const names = resource.name;
      if (names) {
        const name = names[0];
        const builder: string[] = [];
        if (name.prefix) {
          builder.push(...name.prefix);
        }
        if (name.given) {
          builder.push(...name.given);
        }
        if (name.family) {
          builder.push(name.family);
        }
        return builder.join(' ').trim();
      }
    }
    return JSON.stringify(resource);
  }

  createReference(resource: Resource): Reference {
    return {
      reference: resource.resourceType + '/' + resource.id,
      display: this.getDisplayString(resource)
    };
  }

  get(url: string, blob?: boolean): Promise<any> {
    return this.fetch('GET', url, undefined, undefined, blob);
  }

  post(url: string, body: any, contentType?: string): Promise<any> {
    return this.fetch('POST', url, contentType, body);
  }

  put(url: string, body: any, contentType?: string): Promise<any> {
    return this.fetch('PUT', url, contentType, body);
  }

  /**
   * Tries to sign in with email and password.
   * @param email
   * @param password
   * @param role
   * @param scope
   * @returns
   */
  signIn(
    email: string,
    password: string,
    role: string,
    scope: string): Promise<User> {

    const url = this.baseUrl + 'auth/login';

    const body: LoginRequest = {
      clientId: this.clientId,
      email,
      password,
      role,
      scope
    };

    return this.post(url, body)
      .then((response: LoginResponse) => {
        this.setAccessToken(response.accessToken);
        this.setRefreshToken(response.refreshToken);
        this.setUser(response.user);
        this.setProfile(response.profile);
        this.dispatchEvent(new Event('change'));
        return response.user;
      });
  }

  /**
   * Signs out locally.
   * Does not invalidate tokens with the server.
   */
  signOut(): Promise<void> {
    this.clear();
    return Promise.resolve();
  }

  /**
   * Tries to sign in the user.
   * Returns true if the user is signed in.
   * This may result in navigating away to the sign in page.
   */
  signInWithOAuthRedirect(): Promise<User> | undefined {
    const urlParams = new URLSearchParams(window.location.search);
    const code = urlParams.get('code');
    if (!code) {
      this.requestAuthorization();
      return undefined;
    } else {
      return this.processCode(code);
    }
  }

  /**
   * Tries to sign out the user.
   * See: https://docs.aws.amazon.com/cognito/latest/developerguide/logout-endpoint.html
   */
  signOutWithOAuthRedirect(): void {
    if (!this.logoutUrl) {
      throw new Error('Missing logout URL');
    }
    window.location.href = this.logoutUrl;
  }

  fhirUrl(...path: string[]): string {
    const builder = [this.baseUrl, 'fhir/R4'];
    for (let i = 0; i < path.length; i++) {
      builder.push('/', encodeURIComponent(path[i]));
    }
    return builder.join('');
  }

  search(search: SearchDefinition): Promise<Bundle> {
    return this.get(this.fhirUrl(search.resourceType) + formatSearchQuery(search));
  }

  read(resourceType: string, id: string): Promise<Resource> {
    return this.get(this.fhirUrl(resourceType, id));
  }

  readHistory(resourceType: string, id: string): Promise<Bundle> {
    return this.get(this.fhirUrl(resourceType, id, '_history'));
  }

  readPatientEverything(id: string): Promise<Bundle> {
    return this.get(this.fhirUrl('Patient', id, '$everything'));
  }

  readBlob(url: string): Promise<Blob> {
    return this.get(url, true);
  }

  readBinary(resourceType: string, id: string): Promise<Blob> {
    return this.readBlob(this.fhirUrl(resourceType, id));
  }

  create<T extends Resource>(resource: T): Promise<T> {
    if (!resource.resourceType) {
      throw new Error('Missing resourceType');
    }
    return this.post(this.fhirUrl(resource.resourceType), resource);
  }

  createBinary(data: any, contentType: string): Promise<Binary> {
    return this.post(this.fhirUrl('Binary'), data, contentType);
  }

  update<T extends Resource>(resource: T): Promise<T> {
    if (!resource.resourceType) {
      throw new Error('Missing resourceType');
    }
    if (!resource.id) {
      throw new Error('Missing id');
    }
    return this.put(this.fhirUrl(resource.resourceType, resource.id), resource);
  }

  patch(resourceType: string, id: string, operations: any): Promise<any> {
    return this.fetch('PATCH', this.fhirUrl(resourceType, id), PATCH_CONTENT_TYPE, operations);
  }

  graphql(gql: any): Promise<any> {
    return this.post(this.fhirUrl('$graphql'), gql, JSON_CONTENT_TYPE);
  }

  sse(criteria: string, handler: (e: Resource) => void): Promise<EventSource> {
    return this.create({
      resourceType: 'Subscription',
      status: 'active',
      criteria: criteria,
      channel: {
        type: 'sse'
      }
    }).then((sub: Subscription) => {
      const eventSource = new EventSource(this.baseUrl + 'sse?subscription=' + encodeURIComponent(sub.id as string), {
        withCredentials: true
      });

      eventSource.onmessage = (e: MessageEvent) => {
        handler(JSON.parse(e.data) as Resource);
      };

      return eventSource;
    });
  }

  getUser(): User | undefined {
    if (!this.user) {
      this.user = this.storage.getObject('user');
    }
    return this.user;
  }

  private setUser(user: User | undefined): void {
    this.storage.setObject('user', user);
    this.user = user;
  }

  getProfile(): Resource | undefined {
    if (!this.profile) {
      this.profile = this.storage.getObject('profile') as Resource | undefined;
    }
    return this.profile;
  }

  private setProfile(profile: Resource): void {
    this.storage.setObject('profile', profile);
    this.profile = profile;
  }

  private getAccessToken(): string | undefined {
    return this.storage.getString('accessToken');
  }

  private setAccessToken(accessToken: string | undefined): void {
    this.storage.setString('accessToken', accessToken);
  }

  private getRefreshToken(): string | undefined {
    return this.storage.getString('refreshToken');
  }

  private setRefreshToken(refreshToken: string | undefined): void {
    this.storage.setString('refreshToken', refreshToken);
  }

  /**
   * Makes an HTTP request.
   * @param {string} method
   * @param {string} url
   * @param {string=} contentType
   * @param {Object=} body
   * @param {boolean=} blob
   */
  private fetch(method: string, url: string, contentType?: string, body?: any, blob?: boolean): Promise<any> {
    if (!url.startsWith('http')) {
      url = this.baseUrl + url;
    }

    const options: any = {
      method: method,
      cache: 'no-cache',
      credentials: 'include',
      headers: {
        'Authorization': 'Bearer ' + this.getAccessToken(),
        'Content-Type': contentType || FHIR_CONTENT_TYPE
      }
    };

    if (body) {
      if (typeof body === 'string' || body instanceof File) {
        options.body = body;
      } else {
        options.body = JSON.stringify(body, keyReplacer);
      }
    }

    return new Promise((resolve, reject) => {
      fetch(url, options)
        .then(response => {
          if (response.status === 401) {
            // Refresh and try again
            return this.refresh().then(() => this.fetch(method, url, contentType, body, blob));
          }
          return blob ? response.blob() : response.json();
        })
        .then(obj => {
          if (obj.issue && obj.issue.length > 0) {
            const error = new Error(obj.issue[0].details.text);
            // error.severity = 'error';
            // error.operationOutcome = obj;
            reject(error);
          }
          resolve(obj);
        })
        .catch(error => {
          reject(error);
        })
    });
  }

  /**
   * Redirects the user to the login screen for authorization.
   * Clears all auth state including local storage and session storage.
   * See: https://openid.net/specs/openid-connect-core-1_0.html#AuthorizationEndpoint
   */
  private async requestAuthorization() {
    if (!this.authorizeUrl) {
      throw new Error('Missing authorize URL');
    }

    console.log('Requesting authorization...');

    this.clear();

    const pkceState = getRandomString();
    sessionStorage.setItem('pkceState', pkceState);

    const codeVerifier = getRandomString();
    sessionStorage.setItem('codeVerifier', codeVerifier);

    const arrayHash = await encryptSHA256(codeVerifier);
    const codeChallenge = arrayBufferToBase64(arrayHash);
    sessionStorage.setItem('codeChallenge', codeChallenge);

    const scope = 'launch/patient openid fhirUser offline_access user/*.*';

    window.location.href = this.authorizeUrl +
      '?response_type=code' +
      '&state=' + encodeURIComponent(pkceState) +
      '&client_id=' + encodeURIComponent(this.clientId) +
      '&redirect_uri=' + encodeURIComponent(getBaseUrl()) +
      '&scope=' + encodeURIComponent(scope) +
      '&code_challenge_method=S256' +
      '&code_challenge=' + encodeURIComponent(codeChallenge);
  }

  /**
   * Processes an OAuth authorization code.
   * See: https://openid.net/specs/openid-connect-core-1_0.html#TokenRequest
   * @param code The authorization code received by URL parameter.
   */
  private processCode(code: string): Promise<User> {
    console.log('Processing authorization code...');

    const pkceState = sessionStorage.getItem('pkceState');
    if (!pkceState) {
      this.clear();
      throw new Error('Invalid PCKE state');
    }

    const codeVerifier = sessionStorage.getItem('codeVerifier');
    if (!codeVerifier) {
      this.clear();
      throw new Error('Invalid PCKE code verifier');
    }

    return this.fetchTokens(
      'grant_type=authorization_code' +
      '&client_id=' + encodeURIComponent(this.clientId) +
      '&code_verifier=' + encodeURIComponent(codeVerifier) +
      '&redirect_uri=' + encodeURIComponent(getBaseUrl()) +
      '&code=' + encodeURIComponent(code));
  }

  /**
   * Tries to refresh the auth tokens.
   * See: https://openid.net/specs/openid-connect-core-1_0.html#RefreshTokens
   */
  private async refresh() {
    const refreshToken = this.getRefreshToken();
    if (!refreshToken) {
      this.clear();
      throw new Error('Invalid refresh token');
    }

    await this.fetchTokens(
      'grant_type=refresh_token' +
      '&client_id=' + encodeURIComponent(this.clientId) +
      '&refresh_token=' + encodeURIComponent(refreshToken));
  }

  /**
   * Makes a POST request to the tokens endpoint.
   * See: https://openid.net/specs/openid-connect-core-1_0.html#TokenEndpoint
   * @param formBody Token parameters in URL encoded format.
   */
  private async fetchTokens(formBody: string): Promise<User> {
    if (!this.tokenUrl) {
      throw new Error('Missing token URL');
    }

    return fetch(
      this.tokenUrl,
      {
        method: 'POST',
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        body: formBody
      })
      .then(response => response.json())
      .then(tokens => this.verifyTokens(tokens))
      .then(() => this.getUser() as User);
  }

  /**
   * Verifies the tokens received from the auth server.
   * Validates the JWT against the JWKS.
   * See: https://openid.net/specs/openid-connect-core-1_0.html#TokenEndpoint
   * @param tokens
   */
  private async verifyTokens(tokens: TokenResponse) {
    console.log('Verifying authorization token...');

    const token = tokens.access_token;

    // Verify token has not expired
    const tokenPayload = parseJWTPayload(token);
    if (Date.now() >= tokenPayload.exp * 1000) {
      this.clear();
      throw new Error('Token expired');
    }

    // Verify app_client_id
    if (tokenPayload.client_id !== this.clientId) {
      this.clear();
      throw new Error('Token was not issued for this audience');
    }

    this.setAccessToken(token);
    this.setRefreshToken(tokens.refresh_token);
  }
}

/**
 * Returns the base URL for the current page.
 */
function getBaseUrl() {
  return window.location.protocol + '//' + window.location.host + '/';
}

/**
 * Replaces any key/value pair of key "__key" with value undefined.
 * This function can be used as the 2nd argument to JSON.stringify to remove __key properties.
 * We add __key properties to array elements to improve React render performance.
 * @param {string} k Property key.
 * @param {*} v Property value.
 */
export function keyReplacer(k: string, v: string) {
  return k === '__key' ? undefined : v;
}