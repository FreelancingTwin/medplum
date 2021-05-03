/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Meta extends FhirResource {
    public static final String RESOURCE_TYPE = "Meta";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_VERSION_ID = "versionId";
    public static final String PROPERTY_LAST_UPDATED = "lastUpdated";
    public static final String PROPERTY_SOURCE = "source";
    public static final String PROPERTY_PROFILE = "profile";
    public static final String PROPERTY_SECURITY = "security";
    public static final String PROPERTY_TAG = "tag";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Meta(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references).
     * This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(PROPERTY_ID);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the element. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

    /**
     * The version specific identifier, as it appears in the version portion
     * of the URL. This value changes when the resource is created, updated,
     * or deleted.
     */
    public String versionId() {
        return getString(PROPERTY_VERSION_ID);
    }

    /**
     * When the resource last changed - e.g. when the version changed.
     */
    public java.time.Instant lastUpdated() {
        return java.time.Instant.parse(data.getString(PROPERTY_LAST_UPDATED));
    }

    /**
     * A uri that identifies the source system of the resource. This provides
     * a minimal amount of [[[Provenance]]] information that can be used to
     * track or differentiate the source of information in the resource. The
     * source may identify another FHIR server, document, message, database,
     * etc.
     */
    public String source() {
        return getString(PROPERTY_SOURCE);
    }

    /**
     * A list of profiles (references to [[[StructureDefinition]]] resources)
     * that this resource claims to conform to. The URL is a reference to
     * [[[StructureDefinition.url]]].
     */
    public java.util.List<String> profile() {
        return getList(String.class, PROPERTY_PROFILE);
    }

    /**
     * Security labels applied to this resource. These tags connect specific
     * resources to the overall security policy and infrastructure.
     */
    public java.util.List<Coding> security() {
        return getList(Coding.class, PROPERTY_SECURITY);
    }

    /**
     * Tags applied to this resource. Tags are intended to be used to
     * identify and relate resources to process and workflow, and
     * applications are not required to consider the tags when interpreting
     * the meaning of a resource.
     */
    public java.util.List<Coding> tag() {
        return getList(Coding.class, PROPERTY_TAG);
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

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder versionId(final String versionId) {
            b.add(PROPERTY_VERSION_ID, versionId);
            return this;
        }

        public Builder lastUpdated(final java.time.Instant lastUpdated) {
            b.add(PROPERTY_LAST_UPDATED, lastUpdated.toString());
            return this;
        }

        public Builder source(final String source) {
            b.add(PROPERTY_SOURCE, source);
            return this;
        }

        public Builder profile(final java.util.List<String> profile) {
            b.add(PROPERTY_PROFILE, FhirObject.toStringArray(profile));
            return this;
        }

        public Builder security(final java.util.List<Coding> security) {
            b.add(PROPERTY_SECURITY, FhirObject.toArray(security));
            return this;
        }

        public Builder tag(final java.util.List<Coding> tag) {
            b.add(PROPERTY_TAG, FhirObject.toArray(tag));
            return this;
        }

        public Meta build() {
            return new Meta(b.build());
        }
    }
}