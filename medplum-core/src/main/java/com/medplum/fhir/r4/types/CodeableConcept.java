/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A concept that may be defined by a formal reference to a terminology
 * or ontology or may be provided by text.
 */
public class CodeableConcept extends FhirObject {
    public static final String RESOURCE_TYPE = "CodeableConcept";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public CodeableConcept(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references).
     * This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(FhirPropertyNames.PROPERTY_ID);
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
        return getList(Extension.class, FhirPropertyNames.PROPERTY_EXTENSION);
    }

    /**
     * A reference to a code defined by a terminology system.
     */
    public java.util.List<Coding> coding() {
        return getList(Coding.class, FhirPropertyNames.PROPERTY_CODING);
    }

    /**
     * A human language representation of the concept as
     * seen/selected/uttered by the user who entered the data and/or which
     * represents the intended meaning of the user.
     */
    public String text() {
        return getString(FhirPropertyNames.PROPERTY_TEXT);
    }

    public static final class Builder {
        private final JsonObjectBuilder b;

        private Builder() {
            b = Json.createObjectBuilder();
        }

        private Builder(final JsonObject data) {
            b = Json.createObjectBuilder(data);
        }

        public Builder id(final String id) {
            b.add(FhirPropertyNames.PROPERTY_ID, id);
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder coding(final java.util.List<Coding> coding) {
            b.add(FhirPropertyNames.PROPERTY_CODING, FhirObject.toArray(coding));
            return this;
        }

        public Builder text(final String text) {
            b.add(FhirPropertyNames.PROPERTY_TEXT, text);
            return this;
        }

        public CodeableConcept build() {
            return new CodeableConcept(b.build());
        }
    }
}