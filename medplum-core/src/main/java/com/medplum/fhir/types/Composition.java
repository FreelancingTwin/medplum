/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Composition extends FhirResource {
    public static final String RESOURCE_TYPE = "Composition";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_ENCOUNTER = "encounter";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_AUTHOR = "author";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_CONFIDENTIALITY = "confidentiality";
    public static final String PROPERTY_ATTESTER = "attester";
    public static final String PROPERTY_CUSTODIAN = "custodian";
    public static final String PROPERTY_RELATES_TO = "relatesTo";
    public static final String PROPERTY_EVENT = "event";
    public static final String PROPERTY_SECTION = "section";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Composition(final JsonObject data) {
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
     * A version-independent identifier for the Composition. This identifier
     * stays constant as the composition is changed over time.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The workflow/clinical status of this composition. The status is a
     * marker for the clinical standing of the document.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Specifies the particular kind of composition (e.g. History and
     * Physical, Discharge Summary, Progress Note). This usually equates to
     * the purpose of making the composition.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * A categorization for the type of the composition - helps for indexing
     * and searching. This may be implied by or derived from the code
     * specified in the Composition Type.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * Who or what the composition is about. The composition can be about a
     * person, (patient or healthcare practitioner), a device (e.g. a
     * machine) or even a group of subjects (such as a document about a herd
     * of livestock, or a set of patients that share a common exposure).
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * Describes the clinical encounter or type of care this documentation is
     * associated with.
     */
    public Reference encounter() {
        return getObject(Reference.class, PROPERTY_ENCOUNTER);
    }

    /**
     * The composition editing time, when the composition was last logically
     * changed by the author.
     */
    public java.time.Instant date() {
        return java.time.Instant.parse(data.getString(PROPERTY_DATE));
    }

    /**
     * Identifies who is responsible for the information in the composition,
     * not necessarily who typed it in.
     */
    public java.util.List<Reference> author() {
        return getList(Reference.class, PROPERTY_AUTHOR);
    }

    /**
     * Official human-readable label for the composition.
     */
    public String title() {
        return getString(PROPERTY_TITLE);
    }

    /**
     * The code specifying the level of confidentiality of the Composition.
     */
    public String confidentiality() {
        return getString(PROPERTY_CONFIDENTIALITY);
    }

    /**
     * A participant who has attested to the accuracy of the
     * composition/document.
     */
    public java.util.List<CompositionAttester> attester() {
        return getList(CompositionAttester.class, PROPERTY_ATTESTER);
    }

    /**
     * Identifies the organization or group who is responsible for ongoing
     * maintenance of and access to the composition/document information.
     */
    public Reference custodian() {
        return getObject(Reference.class, PROPERTY_CUSTODIAN);
    }

    /**
     * Relationships that this composition has with other compositions or
     * documents that already exist.
     */
    public java.util.List<CompositionRelatesTo> relatesTo() {
        return getList(CompositionRelatesTo.class, PROPERTY_RELATES_TO);
    }

    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being
     * documented.
     */
    public java.util.List<CompositionEvent> event() {
        return getList(CompositionEvent.class, PROPERTY_EVENT);
    }

    /**
     * The root of the sections that make up the composition.
     */
    public java.util.List<CompositionSection> section() {
        return getList(CompositionSection.class, PROPERTY_SECTION);
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

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final Identifier identifier) {
            b.add(PROPERTY_IDENTIFIER, identifier);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder author(final java.util.List<Reference> author) {
            b.add(PROPERTY_AUTHOR, FhirObject.toArray(author));
            return this;
        }

        public Builder title(final String title) {
            b.add(PROPERTY_TITLE, title);
            return this;
        }

        public Builder confidentiality(final String confidentiality) {
            b.add(PROPERTY_CONFIDENTIALITY, confidentiality);
            return this;
        }

        public Builder attester(final java.util.List<CompositionAttester> attester) {
            b.add(PROPERTY_ATTESTER, FhirObject.toArray(attester));
            return this;
        }

        public Builder custodian(final Reference custodian) {
            b.add(PROPERTY_CUSTODIAN, custodian);
            return this;
        }

        public Builder relatesTo(final java.util.List<CompositionRelatesTo> relatesTo) {
            b.add(PROPERTY_RELATES_TO, FhirObject.toArray(relatesTo));
            return this;
        }

        public Builder event(final java.util.List<CompositionEvent> event) {
            b.add(PROPERTY_EVENT, FhirObject.toArray(event));
            return this;
        }

        public Builder section(final java.util.List<CompositionSection> section) {
            b.add(PROPERTY_SECTION, FhirObject.toArray(section));
            return this;
        }

        public Composition build() {
            return new Composition(b.build());
        }
    }

    public static class CompositionAttester extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionAttester";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_MODE = "mode";
        public static final String PROPERTY_TIME = "time";
        public static final String PROPERTY_PARTY = "party";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionAttester(final JsonObject data) {
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
         * The type of attestation the authenticator offers.
         */
        public String mode() {
            return getString(PROPERTY_MODE);
        }

        /**
         * When the composition was attested by the party.
         */
        public java.time.Instant time() {
            return java.time.Instant.parse(data.getString(PROPERTY_TIME));
        }

        /**
         * Who attested the composition in the specified way.
         */
        public Reference party() {
            return getObject(Reference.class, PROPERTY_PARTY);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder mode(final String mode) {
                b.add(PROPERTY_MODE, mode);
                return this;
            }

            public Builder time(final java.time.Instant time) {
                b.add(PROPERTY_TIME, time.toString());
                return this;
            }

            public Builder party(final Reference party) {
                b.add(PROPERTY_PARTY, party);
                return this;
            }

            public CompositionAttester build() {
                return new CompositionAttester(b.build());
            }
        }
    }

    public static class CompositionEvent extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionEvent";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_PERIOD = "period";
        public static final String PROPERTY_DETAIL = "detail";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionEvent(final JsonObject data) {
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
         * This list of codes represents the main clinical acts, such as a
         * colonoscopy or an appendectomy, being documented. In some cases, the
         * event is inherent in the typeCode, such as a &quot;History and Physical
         * Report&quot; in which the procedure being documented is necessarily a
         * &quot;History and Physical&quot; act.
         */
        public java.util.List<CodeableConcept> code() {
            return getList(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * The period of time covered by the documentation. There is no assertion
         * that the documentation is a complete representation for this period,
         * only that it documents events during this time.
         */
        public Period period() {
            return getObject(Period.class, PROPERTY_PERIOD);
        }

        /**
         * The description and/or reference of the event(s) being documented. For
         * example, this could be used to document such a colonoscopy or an
         * appendectomy.
         */
        public java.util.List<Reference> detail() {
            return getList(Reference.class, PROPERTY_DETAIL);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final java.util.List<CodeableConcept> code) {
                b.add(PROPERTY_CODE, FhirObject.toArray(code));
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public Builder detail(final java.util.List<Reference> detail) {
                b.add(PROPERTY_DETAIL, FhirObject.toArray(detail));
                return this;
            }

            public CompositionEvent build() {
                return new CompositionEvent(b.build());
            }
        }
    }

    public static class CompositionRelatesTo extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionRelatesTo";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_TARGET_IDENTIFIER = "targetIdentifier";
        public static final String PROPERTY_TARGET_REFERENCE = "targetReference";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionRelatesTo(final JsonObject data) {
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
         * The type of relationship that this composition has with anther
         * composition or document.
         */
        public String code() {
            return getString(PROPERTY_CODE);
        }

        /**
         * The target composition/document of this relationship.
         */
        public Identifier targetIdentifier() {
            return getObject(Identifier.class, PROPERTY_TARGET_IDENTIFIER);
        }

        /**
         * The target composition/document of this relationship.
         */
        public Reference targetReference() {
            return getObject(Reference.class, PROPERTY_TARGET_REFERENCE);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final String code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder targetIdentifier(final Identifier targetIdentifier) {
                b.add(PROPERTY_TARGET_IDENTIFIER, targetIdentifier);
                return this;
            }

            public Builder targetReference(final Reference targetReference) {
                b.add(PROPERTY_TARGET_REFERENCE, targetReference);
                return this;
            }

            public CompositionRelatesTo build() {
                return new CompositionRelatesTo(b.build());
            }
        }
    }

    public static class CompositionSection extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionSection";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TITLE = "title";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_AUTHOR = "author";
        public static final String PROPERTY_FOCUS = "focus";
        public static final String PROPERTY_TEXT = "text";
        public static final String PROPERTY_MODE = "mode";
        public static final String PROPERTY_ORDERED_BY = "orderedBy";
        public static final String PROPERTY_ENTRY = "entry";
        public static final String PROPERTY_EMPTY_REASON = "emptyReason";
        public static final String PROPERTY_SECTION = "section";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionSection(final JsonObject data) {
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
         * The label for this particular section.  This will be part of the
         * rendered content for the document, and is often used to build a table
         * of contents.
         */
        public String title() {
            return getString(PROPERTY_TITLE);
        }

        /**
         * A code identifying the kind of content contained within the section.
         * This must be consistent with the section title.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * Identifies who is responsible for the information in this section, not
         * necessarily who typed it in.
         */
        public java.util.List<Reference> author() {
            return getList(Reference.class, PROPERTY_AUTHOR);
        }

        /**
         * The actual focus of the section when it is not the subject of the
         * composition, but instead represents something or someone associated
         * with the subject such as (for a patient subject) a spouse, parent,
         * fetus, or donor. If not focus is specified, the focus is assumed to be
         * focus of the parent section, or, for a section in the Composition
         * itself, the subject of the composition. Sections with a focus SHALL
         * only include resources where the logical subject (patient, subject,
         * focus, etc.) matches the section focus, or the resources have no
         * logical subject (few resources).
         */
        public Reference focus() {
            return getObject(Reference.class, PROPERTY_FOCUS);
        }

        /**
         * A human-readable narrative that contains the attested content of the
         * section, used to represent the content of the resource to a human. The
         * narrative need not encode all the structured data, but is required to
         * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
         * just read the narrative.
         */
        public Narrative text() {
            return getObject(Narrative.class, PROPERTY_TEXT);
        }

        /**
         * How the entry list was prepared - whether it is a working list that is
         * suitable for being maintained on an ongoing basis, or if it represents
         * a snapshot of a list of items from another source, or whether it is a
         * prepared list where items may be marked as added, modified or deleted.
         */
        public String mode() {
            return getString(PROPERTY_MODE);
        }

        /**
         * Specifies the order applied to the items in the section entries.
         */
        public CodeableConcept orderedBy() {
            return getObject(CodeableConcept.class, PROPERTY_ORDERED_BY);
        }

        /**
         * A reference to the actual resource from which the narrative in the
         * section is derived.
         */
        public java.util.List<Reference> entry() {
            return getList(Reference.class, PROPERTY_ENTRY);
        }

        /**
         * If the section is empty, why the list is empty. An empty section
         * typically has some text explaining the empty reason.
         */
        public CodeableConcept emptyReason() {
            return getObject(CodeableConcept.class, PROPERTY_EMPTY_REASON);
        }

        /**
         * A nested sub-section within this section.
         */
        public java.util.List<CompositionSection> section() {
            return getList(CompositionSection.class, PROPERTY_SECTION);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder title(final String title) {
                b.add(PROPERTY_TITLE, title);
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder author(final java.util.List<Reference> author) {
                b.add(PROPERTY_AUTHOR, FhirObject.toArray(author));
                return this;
            }

            public Builder focus(final Reference focus) {
                b.add(PROPERTY_FOCUS, focus);
                return this;
            }

            public Builder text(final Narrative text) {
                b.add(PROPERTY_TEXT, text);
                return this;
            }

            public Builder mode(final String mode) {
                b.add(PROPERTY_MODE, mode);
                return this;
            }

            public Builder orderedBy(final CodeableConcept orderedBy) {
                b.add(PROPERTY_ORDERED_BY, orderedBy);
                return this;
            }

            public Builder entry(final java.util.List<Reference> entry) {
                b.add(PROPERTY_ENTRY, FhirObject.toArray(entry));
                return this;
            }

            public Builder emptyReason(final CodeableConcept emptyReason) {
                b.add(PROPERTY_EMPTY_REASON, emptyReason);
                return this;
            }

            public Builder section(final java.util.List<CompositionSection> section) {
                b.add(PROPERTY_SECTION, FhirObject.toArray(section));
                return this;
            }

            public CompositionSection build() {
                return new CompositionSection(b.build());
            }
        }
    }
}