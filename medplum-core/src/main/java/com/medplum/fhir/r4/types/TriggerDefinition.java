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
 * A description of a triggering event. Triggering events can be named
 * events, data events, or periodic, as determined by the type element.
 */
public class TriggerDefinition extends FhirObject {
    public static final String RESOURCE_TYPE = "TriggerDefinition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public TriggerDefinition(final JsonObject data) {
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
     * The type of triggering event.
     */
    public String type() {
        return getString(FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * A formal name for the event. This may be an absolute URI that
     * identifies the event formally (e.g. from a trigger registry), or a
     * simple relative URI that identifies the event in a local context.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     */
    public Timing timingTiming() {
        return getObject(Timing.class, FhirPropertyNames.PROPERTY_TIMING_TIMING);
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     */
    public Reference timingReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_TIMING_REFERENCE);
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     */
    public String timingDate() {
        return getString(FhirPropertyNames.PROPERTY_TIMING_DATE);
    }

    /**
     * The timing of the event (if this is a periodic trigger).
     */
    public String timingDateTime() {
        return getString(FhirPropertyNames.PROPERTY_TIMING_DATE_TIME);
    }

    /**
     * The triggering data of the event (if this is a data trigger). If more
     * than one data is requirement is specified, then all the data
     * requirements must be true.
     */
    public java.util.List<DataRequirement> data() {
        return getList(DataRequirement.class, FhirPropertyNames.PROPERTY_DATA);
    }

    /**
     * A boolean-valued expression that is evaluated in the context of the
     * container of the trigger definition and returns whether or not the
     * trigger fires.
     */
    public Expression condition() {
        return getObject(Expression.class, FhirPropertyNames.PROPERTY_CONDITION);
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

        public Builder type(final String type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder timingTiming(final Timing timingTiming) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_TIMING, timingTiming);
            return this;
        }

        public Builder timingReference(final Reference timingReference) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_REFERENCE, timingReference);
            return this;
        }

        public Builder timingDate(final String timingDate) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_DATE, timingDate);
            return this;
        }

        public Builder timingDateTime(final String timingDateTime) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_DATE_TIME, timingDateTime);
            return this;
        }

        public Builder data(final java.util.List<DataRequirement> data) {
            b.add(FhirPropertyNames.PROPERTY_DATA, FhirObject.toArray(data));
            return this;
        }

        public Builder condition(final Expression condition) {
            b.add(FhirPropertyNames.PROPERTY_CONDITION, condition);
            return this;
        }

        public TriggerDefinition build() {
            return new TriggerDefinition(b.build());
        }
    }
}