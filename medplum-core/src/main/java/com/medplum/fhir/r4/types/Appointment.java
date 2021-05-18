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
 * A booking of a healthcare event among patient(s), practitioner(s),
 * related person(s) and/or device(s) for a specific date/time. This may
 * result in one or more Encounter(s).
 */
public class Appointment extends DomainResource {
    public static final String RESOURCE_TYPE = "Appointment";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Appointment(final JsonObject data) {
        super(data);
    }

    /**
     * This records identifiers associated with this appointment concern that
     * are defined by business processes and/or used to refer to it when a
     * direct URL reference to the resource itself is not appropriate (e.g.
     * in CDA documents, or in written / printed documentation).
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The overall status of the Appointment. Each of the participants has
     * their own participation status which indicates their involvement in
     * the process, however this status indicates the shared status.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * The coded reason for the appointment being cancelled. This is often
     * used in reporting/billing/futher processing to determine if further
     * actions are required, or specific fees apply.
     */
    public CodeableConcept cancelationReason() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CANCELATION_REASON);
    }

    /**
     * A broad categorization of the service that is to be performed during
     * this appointment.
     */
    public java.util.List<CodeableConcept> serviceCategory() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SERVICE_CATEGORY);
    }

    /**
     * The specific service that is to be performed during this appointment.
     */
    public java.util.List<CodeableConcept> serviceType() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SERVICE_TYPE);
    }

    /**
     * The specialty of a practitioner that would be required to perform the
     * service requested in this appointment.
     */
    public java.util.List<CodeableConcept> specialty() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SPECIALTY);
    }

    /**
     * The style of appointment or patient that has been booked in the slot
     * (not service type).
     */
    public CodeableConcept appointmentType() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_APPOINTMENT_TYPE);
    }

    /**
     * The coded reason that this appointment is being scheduled. This is
     * more clinical than administrative.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON_CODE);
    }

    /**
     * Reason the appointment has been scheduled to take place, as specified
     * using information from another resource. When the patient arrives and
     * the encounter begins it may be used as the admission diagnosis. The
     * indication will typically be a Condition (with other resources
     * referenced in the evidence.detail), or a Procedure.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REASON_REFERENCE);
    }

    /**
     * The priority of the appointment. Can be used to make informed
     * decisions if needing to re-prioritize appointments. (The iCal Standard
     * specifies 0 as undefined, 1 as highest, 9 as lowest priority).
     */
    public Integer priority() {
        return data.getInt(FhirPropertyNames.PROPERTY_PRIORITY);
    }

    /**
     * The brief description of the appointment as would be shown on a
     * subject line in a meeting request, or appointment list. Detailed or
     * expanded information should be put in the comment field.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * Additional information to support the appointment provided when making
     * the appointment.
     */
    public java.util.List<Reference> supportingInformation() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION);
    }

    /**
     * Date/Time that the appointment is to take place.
     */
    public java.time.Instant start() {
        return getInstant(FhirPropertyNames.PROPERTY_START);
    }

    /**
     * Date/Time that the appointment is to conclude.
     */
    public java.time.Instant end() {
        return getInstant(FhirPropertyNames.PROPERTY_END);
    }

    /**
     * Number of minutes that the appointment is to take. This can be less
     * than the duration between the start and end times.  For example, where
     * the actual time of appointment is only an estimate or if a 30 minute
     * appointment is being requested, but any time would work.  Also, if
     * there is, for example, a planned 15 minute break in the middle of a
     * long appointment, the duration may be 15 minutes less than the
     * difference between the start and end.
     */
    public Integer minutesDuration() {
        return data.getInt(FhirPropertyNames.PROPERTY_MINUTES_DURATION);
    }

    /**
     * The slots from the participants' schedules that will be filled by the
     * appointment.
     */
    public java.util.List<Reference> slot() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SLOT);
    }

    /**
     * The date that this appointment was initially created. This could be
     * different to the meta.lastModified value on the initial entry, as this
     * could have been before the resource was created on the FHIR server,
     * and should remain unchanged over the lifespan of the appointment.
     */
    public java.time.Instant created() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATED);
    }

    /**
     * Additional comments about the appointment.
     */
    public String comment() {
        return getString(FhirPropertyNames.PROPERTY_COMMENT);
    }

    /**
     * While Appointment.comment contains information for internal use,
     * Appointment.patientInstructions is used to capture patient facing
     * information about the Appointment (e.g. please bring your referral or
     * fast from 8pm night before).
     */
    public String patientInstruction() {
        return getString(FhirPropertyNames.PROPERTY_PATIENT_INSTRUCTION);
    }

    /**
     * The service request this appointment is allocated to assess (e.g.
     * incoming referral or procedure request).
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_BASED_ON);
    }

    /**
     * List of participants involved in the appointment.
     */
    public java.util.List<AppointmentParticipant> participant() {
        return getList(AppointmentParticipant.class, FhirPropertyNames.PROPERTY_PARTICIPANT);
    }

    /**
     * A set of date ranges (potentially including times) that the
     * appointment is preferred to be scheduled within.
     *
     * The duration (usually in minutes) could also be provided to indicate
     * the length of the appointment to fill and populate the start/end times
     * for the actual allocated time. However, in other situations the
     * duration may be calculated by the scheduling system.
     */
    public java.util.List<Period> requestedPeriod() {
        return getList(Period.class, FhirPropertyNames.PROPERTY_REQUESTED_PERIOD);
    }

    public static final class Builder extends DomainResource.Builder<Appointment, Appointment.Builder> {

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

        public Builder cancelationReason(final CodeableConcept cancelationReason) {
            b.add(FhirPropertyNames.PROPERTY_CANCELATION_REASON, cancelationReason);
            return this;
        }

        public Builder serviceCategory(final java.util.List<CodeableConcept> serviceCategory) {
            b.add(FhirPropertyNames.PROPERTY_SERVICE_CATEGORY, FhirObject.toArray(serviceCategory));
            return this;
        }

        public Builder serviceType(final java.util.List<CodeableConcept> serviceType) {
            b.add(FhirPropertyNames.PROPERTY_SERVICE_TYPE, FhirObject.toArray(serviceType));
            return this;
        }

        public Builder specialty(final java.util.List<CodeableConcept> specialty) {
            b.add(FhirPropertyNames.PROPERTY_SPECIALTY, FhirObject.toArray(specialty));
            return this;
        }

        public Builder appointmentType(final CodeableConcept appointmentType) {
            b.add(FhirPropertyNames.PROPERTY_APPOINTMENT_TYPE, appointmentType);
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

        public Builder priority(final Integer priority) {
            b.add(FhirPropertyNames.PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder supportingInformation(final java.util.List<Reference> supportingInformation) {
            b.add(FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION, FhirObject.toArray(supportingInformation));
            return this;
        }

        public Builder start(final java.time.Instant start) {
            b.add(FhirPropertyNames.PROPERTY_START, start.toString());
            return this;
        }

        public Builder end(final java.time.Instant end) {
            b.add(FhirPropertyNames.PROPERTY_END, end.toString());
            return this;
        }

        public Builder minutesDuration(final Integer minutesDuration) {
            b.add(FhirPropertyNames.PROPERTY_MINUTES_DURATION, minutesDuration);
            return this;
        }

        public Builder slot(final java.util.List<Reference> slot) {
            b.add(FhirPropertyNames.PROPERTY_SLOT, FhirObject.toArray(slot));
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(FhirPropertyNames.PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder comment(final String comment) {
            b.add(FhirPropertyNames.PROPERTY_COMMENT, comment);
            return this;
        }

        public Builder patientInstruction(final String patientInstruction) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT_INSTRUCTION, patientInstruction);
            return this;
        }

        public Builder basedOn(final java.util.List<Reference> basedOn) {
            b.add(FhirPropertyNames.PROPERTY_BASED_ON, FhirObject.toArray(basedOn));
            return this;
        }

        public Builder participant(final java.util.List<AppointmentParticipant> participant) {
            b.add(FhirPropertyNames.PROPERTY_PARTICIPANT, FhirObject.toArray(participant));
            return this;
        }

        public Builder requestedPeriod(final java.util.List<Period> requestedPeriod) {
            b.add(FhirPropertyNames.PROPERTY_REQUESTED_PERIOD, FhirObject.toArray(requestedPeriod));
            return this;
        }

        public Appointment build() {
            return new Appointment(b.build());
        }

        protected Builder getBuilder() {
            return this;
        }
    }

    /**
     * A booking of a healthcare event among patient(s), practitioner(s),
     * related person(s) and/or device(s) for a specific date/time. This may
     * result in one or more Encounter(s).
     */
    public static class AppointmentParticipant extends FhirObject {
        public static final String RESOURCE_TYPE = "AppointmentParticipant";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AppointmentParticipant(final JsonObject data) {
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
         * Role of participant in the appointment.
         */
        public java.util.List<CodeableConcept> type() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * A Person, Location/HealthcareService or Device that is participating
         * in the appointment.
         */
        public Reference actor() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ACTOR);
        }

        /**
         * Whether this participant is required to be present at the meeting.
         * This covers a use-case where two doctors need to meet to discuss the
         * results for a specific patient, and the patient is not required to be
         * present.
         */
        public String required() {
            return getString(FhirPropertyNames.PROPERTY_REQUIRED);
        }

        /**
         * Participation status of the actor.
         */
        public String status() {
            return getString(FhirPropertyNames.PROPERTY_STATUS);
        }

        /**
         * Participation period of the actor.
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

            public Builder type(final java.util.List<CodeableConcept> type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, FhirObject.toArray(type));
                return this;
            }

            public Builder actor(final Reference actor) {
                b.add(FhirPropertyNames.PROPERTY_ACTOR, actor);
                return this;
            }

            public Builder required(final String required) {
                b.add(FhirPropertyNames.PROPERTY_REQUIRED, required);
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

            public AppointmentParticipant build() {
                return new AppointmentParticipant(b.build());
            }
        }
    }
}