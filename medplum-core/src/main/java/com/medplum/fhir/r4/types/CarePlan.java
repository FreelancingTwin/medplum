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
 * Describes the intention of how one or more practitioners intend to
 * deliver care for a particular patient, group or community for a period
 * of time, possibly limited to care for a specific condition or set of
 * conditions.
 */
public class CarePlan extends DomainResource {
    public static final String RESOURCE_TYPE = "CarePlan";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public CarePlan(final JsonObject data) {
        super(data);
    }

    /**
     * Business identifiers assigned to this care plan by the performer or
     * other systems which remain constant as the resource is updated and
     * propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire
     * or other definition that is adhered to in whole or in part by this
     * CarePlan.
     */
    public java.util.List<String> instantiatesCanonical() {
        return getList(String.class, FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL);
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline,
     * questionnaire or other definition that is adhered to in whole or in
     * part by this CarePlan.
     */
    public java.util.List<java.net.URI> instantiatesUri() {
        return getList(java.net.URI.class, FhirPropertyNames.PROPERTY_INSTANTIATES_URI);
    }

    /**
     * A care plan that is fulfilled in whole or in part by this care plan.
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_BASED_ON);
    }

    /**
     * Completed or terminated care plan whose function is taken by this new
     * care plan.
     */
    public java.util.List<Reference> replaces() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REPLACES);
    }

    /**
     * A larger care plan of which this particular care plan is a component
     * or step.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_PART_OF);
    }

    /**
     * Indicates whether the plan is currently being acted upon, represents
     * future intentions or is now a historical record.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Indicates the level of authority/intentionality associated with the
     * care plan and where the care plan fits into the workflow chain.
     */
    public String intent() {
        return getString(FhirPropertyNames.PROPERTY_INTENT);
    }

    /**
     * Identifies what &quot;kind&quot; of plan this is to support differentiation
     * between multiple co-existing plans; e.g. &quot;Home health&quot;, &quot;psychiatric&quot;,
     * &quot;asthma&quot;, &quot;disease management&quot;, &quot;wellness plan&quot;, etc.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * Human-friendly name for the care plan.
     */
    public String title() {
        return getString(FhirPropertyNames.PROPERTY_TITLE);
    }

    /**
     * A description of the scope and nature of the plan.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * Identifies the patient or group whose intended care is described by
     * the plan.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which this CarePlan was created or to which the
     * creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * Indicates when the plan did (or is intended to) come into effect and
     * end.
     */
    public Period period() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    /**
     * Represents when this particular CarePlan record was created in the
     * system, which is often a system-generated date.
     */
    public java.time.Instant created() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATED);
    }

    /**
     * When populated, the author is responsible for the care plan.  The care
     * plan is attributed to the author.
     */
    public Reference author() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_AUTHOR);
    }

    /**
     * Identifies the individual(s) or organization who provided the contents
     * of the care plan.
     */
    public java.util.List<Reference> contributor() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_CONTRIBUTOR);
    }

    /**
     * Identifies all people and organizations who are expected to be
     * involved in the care envisioned by this plan.
     */
    public java.util.List<Reference> careTeam() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_CARE_TEAM);
    }

    /**
     * Identifies the conditions/problems/concerns/diagnoses/etc. whose
     * management and/or mitigation are handled by this plan.
     */
    public java.util.List<Reference> addresses() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_ADDRESSES);
    }

    /**
     * Identifies portions of the patient's record that specifically
     * influenced the formation of the plan.  These might include
     * comorbidities, recent procedures, limitations, recent assessments,
     * etc.
     */
    public java.util.List<Reference> supportingInfo() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SUPPORTING_INFO);
    }

    /**
     * Describes the intended objective(s) of carrying out the care plan.
     */
    public java.util.List<Reference> goal() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_GOAL);
    }

    /**
     * Identifies a planned action to occur as part of the plan.  For
     * example, a medication to be used, lab tests to perform,
     * self-monitoring, education, etc.
     */
    public java.util.List<CarePlanActivity> activity() {
        return getList(CarePlanActivity.class, FhirPropertyNames.PROPERTY_ACTIVITY);
    }

    /**
     * General notes about the care plan not covered elsewhere.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    public static final class Builder extends DomainResource.Builder<CarePlan, CarePlan.Builder> {

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

        public Builder instantiatesCanonical(final java.util.List<String> instantiatesCanonical) {
            b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL, FhirObject.toStringArray(instantiatesCanonical));
            return this;
        }

        public Builder instantiatesUri(final java.util.List<java.net.URI> instantiatesUri) {
            b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_URI, FhirObject.toUriArray(instantiatesUri));
            return this;
        }

        public Builder basedOn(final java.util.List<Reference> basedOn) {
            b.add(FhirPropertyNames.PROPERTY_BASED_ON, FhirObject.toArray(basedOn));
            return this;
        }

        public Builder replaces(final java.util.List<Reference> replaces) {
            b.add(FhirPropertyNames.PROPERTY_REPLACES, FhirObject.toArray(replaces));
            return this;
        }

        public Builder partOf(final java.util.List<Reference> partOf) {
            b.add(FhirPropertyNames.PROPERTY_PART_OF, FhirObject.toArray(partOf));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder intent(final String intent) {
            b.add(FhirPropertyNames.PROPERTY_INTENT, intent);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder title(final String title) {
            b.add(FhirPropertyNames.PROPERTY_TITLE, title);
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(FhirPropertyNames.PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder period(final Period period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(FhirPropertyNames.PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder author(final Reference author) {
            b.add(FhirPropertyNames.PROPERTY_AUTHOR, author);
            return this;
        }

        public Builder contributor(final java.util.List<Reference> contributor) {
            b.add(FhirPropertyNames.PROPERTY_CONTRIBUTOR, FhirObject.toArray(contributor));
            return this;
        }

        public Builder careTeam(final java.util.List<Reference> careTeam) {
            b.add(FhirPropertyNames.PROPERTY_CARE_TEAM, FhirObject.toArray(careTeam));
            return this;
        }

        public Builder addresses(final java.util.List<Reference> addresses) {
            b.add(FhirPropertyNames.PROPERTY_ADDRESSES, FhirObject.toArray(addresses));
            return this;
        }

        public Builder supportingInfo(final java.util.List<Reference> supportingInfo) {
            b.add(FhirPropertyNames.PROPERTY_SUPPORTING_INFO, FhirObject.toArray(supportingInfo));
            return this;
        }

        public Builder goal(final java.util.List<Reference> goal) {
            b.add(FhirPropertyNames.PROPERTY_GOAL, FhirObject.toArray(goal));
            return this;
        }

        public Builder activity(final java.util.List<CarePlanActivity> activity) {
            b.add(FhirPropertyNames.PROPERTY_ACTIVITY, FhirObject.toArray(activity));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public CarePlan build() {
            return new CarePlan(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }

    /**
     * Describes the intention of how one or more practitioners intend to
     * deliver care for a particular patient, group or community for a period
     * of time, possibly limited to care for a specific condition or set of
     * conditions.
     */
    public static class CarePlanActivity extends FhirObject {
        public static final String RESOURCE_TYPE = "CarePlanActivity";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CarePlanActivity(final JsonObject data) {
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
         * Identifies the outcome at the point when the status of the activity is
         * assessed.  For example, the outcome of an education activity could be
         * patient understands (or not).
         */
        public java.util.List<CodeableConcept> outcomeCodeableConcept() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_OUTCOME_CODEABLE_CONCEPT);
        }

        /**
         * Details of the outcome or action resulting from the activity.  The
         * reference to an &quot;event&quot; resource, such as Procedure or Encounter or
         * Observation, is the result/outcome of the activity itself.  The
         * activity can be conveyed using CarePlan.activity.detail OR using the
         * CarePlan.activity.reference (a reference to a &ldquo;request&rdquo; resource).
         */
        public java.util.List<Reference> outcomeReference() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_OUTCOME_REFERENCE);
        }

        /**
         * Notes about the adherence/status/progress of the activity.
         */
        public java.util.List<Annotation> progress() {
            return getList(Annotation.class, FhirPropertyNames.PROPERTY_PROGRESS);
        }

        /**
         * The details of the proposed activity represented in a specific
         * resource.
         */
        public Reference reference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_REFERENCE);
        }

        /**
         * A simple summary of a planned activity suitable for a general care
         * plan system (e.g. form driven) that doesn't know about specific
         * resources such as procedure etc.
         */
        public CarePlanDetail detail() {
            return getObject(CarePlanDetail.class, FhirPropertyNames.PROPERTY_DETAIL);
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

            public Builder outcomeCodeableConcept(final java.util.List<CodeableConcept> outcomeCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_OUTCOME_CODEABLE_CONCEPT, FhirObject.toArray(outcomeCodeableConcept));
                return this;
            }

            public Builder outcomeReference(final java.util.List<Reference> outcomeReference) {
                b.add(FhirPropertyNames.PROPERTY_OUTCOME_REFERENCE, FhirObject.toArray(outcomeReference));
                return this;
            }

            public Builder progress(final java.util.List<Annotation> progress) {
                b.add(FhirPropertyNames.PROPERTY_PROGRESS, FhirObject.toArray(progress));
                return this;
            }

            public Builder reference(final Reference reference) {
                b.add(FhirPropertyNames.PROPERTY_REFERENCE, reference);
                return this;
            }

            public Builder detail(final CarePlanDetail detail) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL, detail);
                return this;
            }

            public CarePlanActivity build() {
                return new CarePlanActivity(b.build());
            }
        }
    }

    /**
     * Describes the intention of how one or more practitioners intend to
     * deliver care for a particular patient, group or community for a period
     * of time, possibly limited to care for a specific condition or set of
     * conditions.
     */
    public static class CarePlanDetail extends FhirObject {
        public static final String RESOURCE_TYPE = "CarePlanDetail";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CarePlanDetail(final JsonObject data) {
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
         * A description of the kind of resource the in-line definition of a care
         * plan activity is representing.  The CarePlan.activity.detail is an
         * in-line definition when a resource is not referenced using
         * CarePlan.activity.reference.  For example, a MedicationRequest, a
         * ServiceRequest, or a CommunicationRequest.
         */
        public String kind() {
            return getString(FhirPropertyNames.PROPERTY_KIND);
        }

        /**
         * The URL pointing to a FHIR-defined protocol, guideline, questionnaire
         * or other definition that is adhered to in whole or in part by this
         * CarePlan activity.
         */
        public java.util.List<String> instantiatesCanonical() {
            return getList(String.class, FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL);
        }

        /**
         * The URL pointing to an externally maintained protocol, guideline,
         * questionnaire or other definition that is adhered to in whole or in
         * part by this CarePlan activity.
         */
        public java.util.List<java.net.URI> instantiatesUri() {
            return getList(java.net.URI.class, FhirPropertyNames.PROPERTY_INSTANTIATES_URI);
        }

        /**
         * Detailed description of the type of planned activity; e.g. what lab
         * test, what procedure, what kind of encounter.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Provides the rationale that drove the inclusion of this particular
         * activity as part of the plan or the reason why the activity was
         * prohibited.
         */
        public java.util.List<CodeableConcept> reasonCode() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON_CODE);
        }

        /**
         * Indicates another resource, such as the health condition(s), whose
         * existence justifies this request and drove the inclusion of this
         * particular activity as part of the plan.
         */
        public java.util.List<Reference> reasonReference() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_REASON_REFERENCE);
        }

        /**
         * Internal reference that identifies the goals that this activity is
         * intended to contribute towards meeting.
         */
        public java.util.List<Reference> goal() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_GOAL);
        }

        /**
         * Identifies what progress is being made for the specific activity.
         */
        public String status() {
            return getString(FhirPropertyNames.PROPERTY_STATUS);
        }

        /**
         * Provides reason why the activity isn't yet started, is on hold, was
         * cancelled, etc.
         */
        public CodeableConcept statusReason() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_STATUS_REASON);
        }

        /**
         * If true, indicates that the described activity is one that must NOT be
         * engaged in when following the plan.  If false, or missing, indicates
         * that the described activity is one that should be engaged in when
         * following the plan.
         */
        public Boolean doNotPerform() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM);
        }

        /**
         * The period, timing or frequency upon which the described activity is
         * to occur.
         */
        public Timing scheduledTiming() {
            return getObject(Timing.class, FhirPropertyNames.PROPERTY_SCHEDULED_TIMING);
        }

        /**
         * The period, timing or frequency upon which the described activity is
         * to occur.
         */
        public Period scheduledPeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_SCHEDULED_PERIOD);
        }

        /**
         * The period, timing or frequency upon which the described activity is
         * to occur.
         */
        public String scheduledString() {
            return getString(FhirPropertyNames.PROPERTY_SCHEDULED_STRING);
        }

        /**
         * Identifies the facility where the activity will occur; e.g. home,
         * hospital, specific clinic, etc.
         */
        public Reference location() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
        }

        /**
         * Identifies who's expected to be involved in the activity.
         */
        public java.util.List<Reference> performer() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_PERFORMER);
        }

        /**
         * Identifies the food, drug or other product to be consumed or supplied
         * in the activity.
         */
        public CodeableConcept productCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PRODUCT_CODEABLE_CONCEPT);
        }

        /**
         * Identifies the food, drug or other product to be consumed or supplied
         * in the activity.
         */
        public Reference productReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_PRODUCT_REFERENCE);
        }

        /**
         * Identifies the quantity expected to be consumed in a given day.
         */
        public Quantity dailyAmount() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_DAILY_AMOUNT);
        }

        /**
         * Identifies the quantity expected to be supplied, administered or
         * consumed by the subject.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
        }

        /**
         * This provides a textual description of constraints on the intended
         * activity occurrence, including relation to other activities.  It may
         * also include objectives, pre-conditions and end-conditions.  Finally,
         * it may convey specifics about the activity such as body site, method,
         * route, etc.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
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

            public Builder kind(final String kind) {
                b.add(FhirPropertyNames.PROPERTY_KIND, kind);
                return this;
            }

            public Builder instantiatesCanonical(final java.util.List<String> instantiatesCanonical) {
                b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL, FhirObject.toStringArray(instantiatesCanonical));
                return this;
            }

            public Builder instantiatesUri(final java.util.List<java.net.URI> instantiatesUri) {
                b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_URI, FhirObject.toUriArray(instantiatesUri));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
                b.add(FhirPropertyNames.PROPERTY_REASON_CODE, FhirObject.toArray(reasonCode));
                return this;
            }

            public Builder reasonReference(final java.util.List<Reference> reasonReference) {
                b.add(FhirPropertyNames.PROPERTY_REASON_REFERENCE, FhirObject.toArray(reasonReference));
                return this;
            }

            public Builder goal(final java.util.List<Reference> goal) {
                b.add(FhirPropertyNames.PROPERTY_GOAL, FhirObject.toArray(goal));
                return this;
            }

            public Builder status(final String status) {
                b.add(FhirPropertyNames.PROPERTY_STATUS, status);
                return this;
            }

            public Builder statusReason(final CodeableConcept statusReason) {
                b.add(FhirPropertyNames.PROPERTY_STATUS_REASON, statusReason);
                return this;
            }

            public Builder doNotPerform(final Boolean doNotPerform) {
                b.add(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM, doNotPerform);
                return this;
            }

            public Builder scheduledTiming(final Timing scheduledTiming) {
                b.add(FhirPropertyNames.PROPERTY_SCHEDULED_TIMING, scheduledTiming);
                return this;
            }

            public Builder scheduledPeriod(final Period scheduledPeriod) {
                b.add(FhirPropertyNames.PROPERTY_SCHEDULED_PERIOD, scheduledPeriod);
                return this;
            }

            public Builder scheduledString(final String scheduledString) {
                b.add(FhirPropertyNames.PROPERTY_SCHEDULED_STRING, scheduledString);
                return this;
            }

            public Builder location(final Reference location) {
                b.add(FhirPropertyNames.PROPERTY_LOCATION, location);
                return this;
            }

            public Builder performer(final java.util.List<Reference> performer) {
                b.add(FhirPropertyNames.PROPERTY_PERFORMER, FhirObject.toArray(performer));
                return this;
            }

            public Builder productCodeableConcept(final CodeableConcept productCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_PRODUCT_CODEABLE_CONCEPT, productCodeableConcept);
                return this;
            }

            public Builder productReference(final Reference productReference) {
                b.add(FhirPropertyNames.PROPERTY_PRODUCT_REFERENCE, productReference);
                return this;
            }

            public Builder dailyAmount(final Quantity dailyAmount) {
                b.add(FhirPropertyNames.PROPERTY_DAILY_AMOUNT, dailyAmount);
                return this;
            }

            public Builder quantity(final Quantity quantity) {
                b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public CarePlanDetail build() {
                return new CarePlanDetail(b.build());
            }
        }
    }
}