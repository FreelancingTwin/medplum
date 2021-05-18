/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * This resource provides enrollment and plan details from the processing
 * of an EnrollmentRequest resource.
 */
public class EnrollmentResponse extends DomainResource {
    public static final String RESOURCE_TYPE = "EnrollmentResponse";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public EnrollmentResponse(final JsonObject data) {
        super(data);
    }

    /**
     * The Response business identifier.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The status of the resource instance.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Original request resource reference.
     */
    public Reference request() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUEST);
    }

    /**
     * Processing status: error, complete.
     */
    public String outcome() {
        return getString(FhirPropertyNames.PROPERTY_OUTCOME);
    }

    /**
     * A description of the status of the adjudication.
     */
    public String disposition() {
        return getString(FhirPropertyNames.PROPERTY_DISPOSITION);
    }

    /**
     * The date when the enclosed suite of services were performed or
     * completed.
     */
    public java.time.Instant created() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATED);
    }

    /**
     * The Insurer who produced this adjudicated response.
     */
    public Reference organization() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ORGANIZATION);
    }

    /**
     * The practitioner who is responsible for the services rendered to the
     * patient.
     */
    public Reference requestProvider() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUEST_PROVIDER);
    }

    public static final class Builder extends DomainResource.Builder<EnrollmentResponse, EnrollmentResponse.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder request(final Reference request) {
            b.add(FhirPropertyNames.PROPERTY_REQUEST, request);
            return this;
        }

        public Builder outcome(final String outcome) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME, outcome);
            return this;
        }

        public Builder disposition(final String disposition) {
            b.add(FhirPropertyNames.PROPERTY_DISPOSITION, disposition);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(FhirPropertyNames.PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder organization(final Reference organization) {
            b.add(FhirPropertyNames.PROPERTY_ORGANIZATION, organization);
            return this;
        }

        public Builder requestProvider(final Reference requestProvider) {
            b.add(FhirPropertyNames.PROPERTY_REQUEST_PROVIDER, requestProvider);
            return this;
        }

        public EnrollmentResponse build() {
            return new EnrollmentResponse(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }
}