package com.medplum.server.security;

import static com.medplum.fhir.IdUtils.*;

import java.util.Map;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;

import org.jose4j.json.JsonUtil;
import org.jose4j.jwk.JsonWebKeySet;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.lang.JoseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.medplum.fhir.JsonUtils;
import com.medplum.fhir.types.Bundle;
import com.medplum.fhir.types.Bundle.BundleEntry;
import com.medplum.fhir.types.JsonWebKey;
import com.medplum.fhir.types.OperationOutcome;
import com.medplum.server.fhir.repo.Repository;
import com.medplum.server.search.SearchRequest;
import com.medplum.server.search.SearchRequestParser;

public class JwkManager {
    private static final Logger LOG = LoggerFactory.getLogger(JwkManager.class);

    public static JsonWebKeySet initKeys(final Repository repo) throws JoseException {
        final SearchRequest searchRequest = SearchRequestParser.parse(JsonWebKey.RESOURCE_TYPE, "active", "true");
        final OperationOutcome searchOutcome = repo.search(SecurityUser.SYSTEM_USER, searchRequest);
        if (!searchOutcome.isOk()) {
            throw new IllegalStateException("Error reading keys: " + searchOutcome.issue().get(0).details().text());
        }

        final Bundle bundle = searchOutcome.resource(Bundle.class);
        final JsonArrayBuilder builder = Json.createArrayBuilder();
        int count = 0;

        for (final BundleEntry entry : bundle.entry()) {
            builder.add(entry.resource(JsonWebKey.class));
            count++;
        }

        if (count > 0) {
            LOG.info("Loaded {} key(s) from repository", count);
        } else {
            LOG.info("No keys found.  Creating a new key...");
            final RsaJsonWebKey jwk = RsaJwkGenerator.generateJwk(2048);
            jwk.setKeyId(generateId());

            final Map<String, Object> jwkParams = jwk.toParams(org.jose4j.jwk.JsonWebKey.OutputControlLevel.INCLUDE_PRIVATE);
            final String jwkStr = JsonUtil.toJson(jwkParams);
            final JsonObject jwkJsonObject = JsonUtils.readJsonString(jwkStr);

            final OperationOutcome createOutcome = repo.create(null, JsonWebKey.RESOURCE_TYPE, JsonWebKey.create(jwkJsonObject).active(true).build());
            if (!createOutcome.isOk()) {
                throw new IllegalStateException("Error creating keys: " + searchOutcome.issue().get(0).details().text());
            }

            builder.add(createOutcome.resource());
        }

        // Convert the array of keys to JSON
        // Then create the jose4j JsonWebKeySet from the JSON string
        return new JsonWebKeySet(Json.createObjectBuilder().add("keys", builder.build()).build().toString());
    }
}