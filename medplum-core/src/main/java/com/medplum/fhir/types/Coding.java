/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import java.time.Instant;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Coding extends FhirResource {
    public static final String RESOURCE_TYPE = "Coding";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_SYSTEM = "system";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_DISPLAY = "display";
    public static final String PROPERTY_USERSELECTED = "userSelected";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Coding(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(PROPERTY_ID);
    }

    /**
     * The identification of the code system that defines the meaning of the symbol in the code.
     */
    public String system() {
        return getString(PROPERTY_SYSTEM);
    }

    /**
     * The version of the code system which was used when choosing this code. Note that a well-maintained code system does not need the version reported, because the meaning of codes is consistent across versions. However this cannot consistently be assured, and when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged.
     */
    public String version() {
        return getString(PROPERTY_VERSION);
    }

    /**
     * A symbol in syntax defined by the system. The symbol may be a predefined code or an expression in a syntax defined by the coding system (e.g. post-coordination).
     */
    public String code() {
        return getString(PROPERTY_CODE);
    }

    /**
     * A representation of the meaning of the code in the system, following the rules of the system.
     */
    public String display() {
        return getString(PROPERTY_DISPLAY);
    }

    /**
     * Indicates that this coding was chosen by a user directly - e.g. off a pick list of available items (codes or displays).
     */
    public Boolean userSelected() {
        return data.getBoolean(PROPERTY_USERSELECTED);
    }

    public static class Builder {
        private final JsonObjectBuilder b;

        private Builder() {
            b = Json.createObjectBuilder();
        }

        private Builder(final JsonObject data) {
            b = Json.createObjectBuilder(data);
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder system(final String system) {
            b.add(PROPERTY_SYSTEM, system);
            return this;
        }

        public Builder version(final String version) {
            b.add(PROPERTY_VERSION, version);
            return this;
        }

        public Builder code(final String code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder display(final String display) {
            b.add(PROPERTY_DISPLAY, display);
            return this;
        }

        public Builder userSelected(final Boolean userSelected) {
            b.add(PROPERTY_USERSELECTED, userSelected);
            return this;
        }

        public Coding build() {
            return new Coding(b.build());
        }
    }
}