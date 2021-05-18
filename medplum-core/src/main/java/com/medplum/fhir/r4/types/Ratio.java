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
 * A relationship of two Quantity values - expressed as a numerator and a
 * denominator.
 */
public class Ratio extends FhirObject {
    public static final String RESOURCE_TYPE = "Ratio";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Ratio(final JsonObject data) {
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
     * The value of the numerator.
     */
    public Quantity numerator() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_NUMERATOR);
    }

    /**
     * The value of the denominator.
     */
    public Quantity denominator() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_DENOMINATOR);
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

        public Builder numerator(final Quantity numerator) {
            b.add(FhirPropertyNames.PROPERTY_NUMERATOR, numerator);
            return this;
        }

        public Builder denominator(final Quantity denominator) {
            b.add(FhirPropertyNames.PROPERTY_DENOMINATOR, denominator);
            return this;
        }

        public Ratio build() {
            return new Ratio(b.build());
        }
    }
}