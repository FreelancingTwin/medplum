/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

import { Reference } from './Reference';

/**
 * OAuth user.
 */
export interface User {

  /**
   * This is a User resource
   */
  readonly resourceType: 'User';

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  readonly id?: string;

  /**
   * User email.
   */
  readonly email?: string;

  /**
   * Encrypted hash of the user's password.
   */
  readonly passwordHash?: string;

  /**
   * Optional reference to the user's patient identity.
   */
  readonly patient?: Reference;

  /**
   * Optional reference to the user's practitioner identity.
   */
  readonly practitioner?: Reference;
}