/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class MedicinalProductPharmaceutical extends FhirResource {
    public static final String RESOURCE_TYPE = "MedicinalProductPharmaceutical";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_ADMINISTRABLE_DOSE_FORM = "administrableDoseForm";
    public static final String PROPERTY_UNIT_OF_PRESENTATION = "unitOfPresentation";
    public static final String PROPERTY_INGREDIENT = "ingredient";
    public static final String PROPERTY_DEVICE = "device";
    public static final String PROPERTY_CHARACTERISTICS = "characteristics";
    public static final String PROPERTY_ROUTE_OF_ADMINISTRATION = "routeOfAdministration";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductPharmaceutical(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public String implicitRules() {
        return getString(PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource and that modifies the
     * understanding of the element that contains it and/or the understanding
     * of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe
     * and manageable, there is a strict set of governance applied to the
     * definition and use of extensions. Though any implementer is allowed to
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension. Applications processing a
     * resource are required to check for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * An identifier for the pharmaceutical medicinal product.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The administrable dose form, after necessary reconstitution.
     */
    public CodeableConcept administrableDoseForm() {
        return getObject(CodeableConcept.class, PROPERTY_ADMINISTRABLE_DOSE_FORM);
    }

    /**
     * Todo.
     */
    public CodeableConcept unitOfPresentation() {
        return getObject(CodeableConcept.class, PROPERTY_UNIT_OF_PRESENTATION);
    }

    /**
     * Ingredient.
     */
    public java.util.List<Reference> ingredient() {
        return getList(Reference.class, PROPERTY_INGREDIENT);
    }

    /**
     * Accompanying device.
     */
    public java.util.List<Reference> device() {
        return getList(Reference.class, PROPERTY_DEVICE);
    }

    /**
     * Characteristics e.g. a products onset of action.
     */
    public java.util.List<MedicinalProductPharmaceuticalCharacteristics> characteristics() {
        return getList(MedicinalProductPharmaceuticalCharacteristics.class, PROPERTY_CHARACTERISTICS);
    }

    /**
     * The path by which the pharmaceutical product is taken into or makes
     * contact with the body.
     */
    public java.util.List<MedicinalProductPharmaceuticalRouteOfAdministration> routeOfAdministration() {
        return getList(MedicinalProductPharmaceuticalRouteOfAdministration.class, PROPERTY_ROUTE_OF_ADMINISTRATION);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCE_TYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final String implicitRules) {
            b.add(PROPERTY_IMPLICIT_RULES, implicitRules);
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder administrableDoseForm(final CodeableConcept administrableDoseForm) {
            b.add(PROPERTY_ADMINISTRABLE_DOSE_FORM, administrableDoseForm);
            return this;
        }

        public Builder unitOfPresentation(final CodeableConcept unitOfPresentation) {
            b.add(PROPERTY_UNIT_OF_PRESENTATION, unitOfPresentation);
            return this;
        }

        public Builder ingredient(final java.util.List<Reference> ingredient) {
            b.add(PROPERTY_INGREDIENT, FhirObject.toArray(ingredient));
            return this;
        }

        public Builder device(final java.util.List<Reference> device) {
            b.add(PROPERTY_DEVICE, FhirObject.toArray(device));
            return this;
        }

        public Builder characteristics(final java.util.List<MedicinalProductPharmaceuticalCharacteristics> characteristics) {
            b.add(PROPERTY_CHARACTERISTICS, FhirObject.toArray(characteristics));
            return this;
        }

        public Builder routeOfAdministration(final java.util.List<MedicinalProductPharmaceuticalRouteOfAdministration> routeOfAdministration) {
            b.add(PROPERTY_ROUTE_OF_ADMINISTRATION, FhirObject.toArray(routeOfAdministration));
            return this;
        }

        public MedicinalProductPharmaceutical build() {
            return new MedicinalProductPharmaceutical(b.build());
        }
    }

    public static class MedicinalProductPharmaceuticalCharacteristics extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalCharacteristics";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_STATUS = "status";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalCharacteristics(final JsonObject data) {
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
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * A coded characteristic.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * The status of characteristic e.g. assigned or pending.
         */
        public CodeableConcept status() {
            return getObject(CodeableConcept.class, PROPERTY_STATUS);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder status(final CodeableConcept status) {
                b.add(PROPERTY_STATUS, status);
                return this;
            }

            public MedicinalProductPharmaceuticalCharacteristics build() {
                return new MedicinalProductPharmaceuticalCharacteristics(b.build());
            }
        }
    }

    public static class MedicinalProductPharmaceuticalRouteOfAdministration extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalRouteOfAdministration";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_FIRST_DOSE = "firstDose";
        public static final String PROPERTY_MAX_SINGLE_DOSE = "maxSingleDose";
        public static final String PROPERTY_MAX_DOSE_PER_DAY = "maxDosePerDay";
        public static final String PROPERTY_MAX_DOSE_PER_TREATMENT_PERIOD = "maxDosePerTreatmentPeriod";
        public static final String PROPERTY_MAX_TREATMENT_PERIOD = "maxTreatmentPeriod";
        public static final String PROPERTY_TARGET_SPECIES = "targetSpecies";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalRouteOfAdministration(final JsonObject data) {
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
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Coded expression for the route.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * The first dose (dose quantity) administered in humans can be
         * specified, for a product under investigation, using a numerical value
         * and its unit of measurement.
         */
        public Quantity firstDose() {
            return getObject(Quantity.class, PROPERTY_FIRST_DOSE);
        }

        /**
         * The maximum single dose that can be administered as per the protocol
         * of a clinical trial can be specified using a numerical value and its
         * unit of measurement.
         */
        public Quantity maxSingleDose() {
            return getObject(Quantity.class, PROPERTY_MAX_SINGLE_DOSE);
        }

        /**
         * The maximum dose per day (maximum dose quantity to be administered in
         * any one 24-h period) that can be administered as per the protocol
         * referenced in the clinical trial authorisation.
         */
        public Quantity maxDosePerDay() {
            return getObject(Quantity.class, PROPERTY_MAX_DOSE_PER_DAY);
        }

        /**
         * The maximum dose per treatment period that can be administered as per
         * the protocol referenced in the clinical trial authorisation.
         */
        public Ratio maxDosePerTreatmentPeriod() {
            return getObject(Ratio.class, PROPERTY_MAX_DOSE_PER_TREATMENT_PERIOD);
        }

        /**
         * The maximum treatment period during which an Investigational Medicinal
         * Product can be administered as per the protocol referenced in the
         * clinical trial authorisation.
         */
        public Duration maxTreatmentPeriod() {
            return getObject(Duration.class, PROPERTY_MAX_TREATMENT_PERIOD);
        }

        /**
         * A species for which this route applies.
         */
        public java.util.List<MedicinalProductPharmaceuticalTargetSpecies> targetSpecies() {
            return getList(MedicinalProductPharmaceuticalTargetSpecies.class, PROPERTY_TARGET_SPECIES);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder firstDose(final Quantity firstDose) {
                b.add(PROPERTY_FIRST_DOSE, firstDose);
                return this;
            }

            public Builder maxSingleDose(final Quantity maxSingleDose) {
                b.add(PROPERTY_MAX_SINGLE_DOSE, maxSingleDose);
                return this;
            }

            public Builder maxDosePerDay(final Quantity maxDosePerDay) {
                b.add(PROPERTY_MAX_DOSE_PER_DAY, maxDosePerDay);
                return this;
            }

            public Builder maxDosePerTreatmentPeriod(final Ratio maxDosePerTreatmentPeriod) {
                b.add(PROPERTY_MAX_DOSE_PER_TREATMENT_PERIOD, maxDosePerTreatmentPeriod);
                return this;
            }

            public Builder maxTreatmentPeriod(final Duration maxTreatmentPeriod) {
                b.add(PROPERTY_MAX_TREATMENT_PERIOD, maxTreatmentPeriod);
                return this;
            }

            public Builder targetSpecies(final java.util.List<MedicinalProductPharmaceuticalTargetSpecies> targetSpecies) {
                b.add(PROPERTY_TARGET_SPECIES, FhirObject.toArray(targetSpecies));
                return this;
            }

            public MedicinalProductPharmaceuticalRouteOfAdministration build() {
                return new MedicinalProductPharmaceuticalRouteOfAdministration(b.build());
            }
        }
    }

    public static class MedicinalProductPharmaceuticalTargetSpecies extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalTargetSpecies";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_WITHDRAWAL_PERIOD = "withdrawalPeriod";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalTargetSpecies(final JsonObject data) {
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
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Coded expression for the species.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * A species specific time during which consumption of animal product is
         * not appropriate.
         */
        public java.util.List<MedicinalProductPharmaceuticalWithdrawalPeriod> withdrawalPeriod() {
            return getList(MedicinalProductPharmaceuticalWithdrawalPeriod.class, PROPERTY_WITHDRAWAL_PERIOD);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder withdrawalPeriod(final java.util.List<MedicinalProductPharmaceuticalWithdrawalPeriod> withdrawalPeriod) {
                b.add(PROPERTY_WITHDRAWAL_PERIOD, FhirObject.toArray(withdrawalPeriod));
                return this;
            }

            public MedicinalProductPharmaceuticalTargetSpecies build() {
                return new MedicinalProductPharmaceuticalTargetSpecies(b.build());
            }
        }
    }

    public static class MedicinalProductPharmaceuticalWithdrawalPeriod extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalWithdrawalPeriod";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TISSUE = "tissue";
        public static final String PROPERTY_VALUE = "value";
        public static final String PROPERTY_SUPPORTING_INFORMATION = "supportingInformation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalWithdrawalPeriod(final JsonObject data) {
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
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Coded expression for the type of tissue for which the withdrawal
         * period applues, e.g. meat, milk.
         */
        public CodeableConcept tissue() {
            return getObject(CodeableConcept.class, PROPERTY_TISSUE);
        }

        /**
         * A value for the time.
         */
        public Quantity value() {
            return getObject(Quantity.class, PROPERTY_VALUE);
        }

        /**
         * Extra information about the withdrawal period.
         */
        public String supportingInformation() {
            return getString(PROPERTY_SUPPORTING_INFORMATION);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder tissue(final CodeableConcept tissue) {
                b.add(PROPERTY_TISSUE, tissue);
                return this;
            }

            public Builder value(final Quantity value) {
                b.add(PROPERTY_VALUE, value);
                return this;
            }

            public Builder supportingInformation(final String supportingInformation) {
                b.add(PROPERTY_SUPPORTING_INFORMATION, supportingInformation);
                return this;
            }

            public MedicinalProductPharmaceuticalWithdrawalPeriod build() {
                return new MedicinalProductPharmaceuticalWithdrawalPeriod(b.build());
            }
        }
    }
}