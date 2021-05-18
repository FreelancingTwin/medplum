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
 * An association between a patient and an organization / healthcare
 * provider(s) during which time encounters may occur. The managing
 * organization assumes a level of responsibility for the patient during
 * this time.
 */
public class EpisodeOfCare extends DomainResource {
    public static final String RESOURCE_TYPE = "EpisodeOfCare";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public EpisodeOfCare(final JsonObject data) {
        super(data);
    }

    /**
     * The EpisodeOfCare may be known by different identifiers for different
     * contexts of use, such as when an external agency is tracking the
     * Episode for funding purposes.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * The history of statuses that the EpisodeOfCare has been through
     * (without requiring processing the history of the resource).
     */
    public java.util.List<EpisodeOfCareStatusHistory> statusHistory() {
        return getList(EpisodeOfCareStatusHistory.class, FhirPropertyNames.PROPERTY_STATUS_HISTORY);
    }

    /**
     * A classification of the type of episode of care; e.g. specialist
     * referral, disease management, type of funded care.
     */
    public java.util.List<CodeableConcept> type() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * The list of diagnosis relevant to this episode of care.
     */
    public java.util.List<EpisodeOfCareDiagnosis> diagnosis() {
        return getList(EpisodeOfCareDiagnosis.class, FhirPropertyNames.PROPERTY_DIAGNOSIS);
    }

    /**
     * The patient who is the focus of this episode of care.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * The organization that has assumed the specific responsibilities for
     * the specified duration.
     */
    public Reference managingOrganization() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_MANAGING_ORGANIZATION);
    }

    /**
     * The interval during which the managing organization assumes the
     * defined responsibility.
     */
    public Period period() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    /**
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming
     * referrals.
     */
    public java.util.List<Reference> referralRequest() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REFERRAL_REQUEST);
    }

    /**
     * The practitioner that is the care manager/care coordinator for this
     * patient.
     */
    public Reference careManager() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_CARE_MANAGER);
    }

    /**
     * The list of practitioners that may be facilitating this episode of
     * care for specific purposes.
     */
    public java.util.List<Reference> team() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_TEAM);
    }

    /**
     * The set of accounts that may be used for billing for this
     * EpisodeOfCare.
     */
    public java.util.List<Reference> account() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_ACCOUNT);
    }

    public static final class Builder extends DomainResource.Builder<EpisodeOfCare, EpisodeOfCare.Builder> {

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

        public Builder statusHistory(final java.util.List<EpisodeOfCareStatusHistory> statusHistory) {
            b.add(FhirPropertyNames.PROPERTY_STATUS_HISTORY, FhirObject.toArray(statusHistory));
            return this;
        }

        public Builder type(final java.util.List<CodeableConcept> type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, FhirObject.toArray(type));
            return this;
        }

        public Builder diagnosis(final java.util.List<EpisodeOfCareDiagnosis> diagnosis) {
            b.add(FhirPropertyNames.PROPERTY_DIAGNOSIS, FhirObject.toArray(diagnosis));
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder managingOrganization(final Reference managingOrganization) {
            b.add(FhirPropertyNames.PROPERTY_MANAGING_ORGANIZATION, managingOrganization);
            return this;
        }

        public Builder period(final Period period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public Builder referralRequest(final java.util.List<Reference> referralRequest) {
            b.add(FhirPropertyNames.PROPERTY_REFERRAL_REQUEST, FhirObject.toArray(referralRequest));
            return this;
        }

        public Builder careManager(final Reference careManager) {
            b.add(FhirPropertyNames.PROPERTY_CARE_MANAGER, careManager);
            return this;
        }

        public Builder team(final java.util.List<Reference> team) {
            b.add(FhirPropertyNames.PROPERTY_TEAM, FhirObject.toArray(team));
            return this;
        }

        public Builder account(final java.util.List<Reference> account) {
            b.add(FhirPropertyNames.PROPERTY_ACCOUNT, FhirObject.toArray(account));
            return this;
        }

        public EpisodeOfCare build() {
            return new EpisodeOfCare(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }

    /**
     * An association between a patient and an organization / healthcare
     * provider(s) during which time encounters may occur. The managing
     * organization assumes a level of responsibility for the patient during
     * this time.
     */
    public static class EpisodeOfCareDiagnosis extends FhirObject {
        public static final String RESOURCE_TYPE = "EpisodeOfCareDiagnosis";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public EpisodeOfCareDiagnosis(final JsonObject data) {
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
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * A list of conditions/problems/diagnoses that this episode of care is
         * intended to be providing care for.
         */
        public Reference condition() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_CONDITION);
        }

        /**
         * Role that this diagnosis has within the episode of care (e.g.
         * admission, billing, discharge &hellip;).
         */
        public CodeableConcept role() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ROLE);
        }

        /**
         * Ranking of the diagnosis (for each role type).
         */
        public Integer rank() {
            return data.getInt(FhirPropertyNames.PROPERTY_RANK);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder condition(final Reference condition) {
                b.add(FhirPropertyNames.PROPERTY_CONDITION, condition);
                return this;
            }

            public Builder role(final CodeableConcept role) {
                b.add(FhirPropertyNames.PROPERTY_ROLE, role);
                return this;
            }

            public Builder rank(final Integer rank) {
                b.add(FhirPropertyNames.PROPERTY_RANK, rank);
                return this;
            }

            public EpisodeOfCareDiagnosis build() {
                return new EpisodeOfCareDiagnosis(b.build());
            }
        }
    }

    /**
     * An association between a patient and an organization / healthcare
     * provider(s) during which time encounters may occur. The managing
     * organization assumes a level of responsibility for the patient during
     * this time.
     */
    public static class EpisodeOfCareStatusHistory extends FhirObject {
        public static final String RESOURCE_TYPE = "EpisodeOfCareStatusHistory";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public EpisodeOfCareStatusHistory(final JsonObject data) {
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
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * planned | waitlist | active | onhold | finished | cancelled.
         */
        public String status() {
            return getString(FhirPropertyNames.PROPERTY_STATUS);
        }

        /**
         * The period during this EpisodeOfCare that the specific status applied.
         */
        public Period period() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder status(final String status) {
                b.add(FhirPropertyNames.PROPERTY_STATUS, status);
                return this;
            }

            public Builder period(final Period period) {
                b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
                return this;
            }

            public EpisodeOfCareStatusHistory build() {
                return new EpisodeOfCareStatusHistory(b.build());
            }
        }
    }
}