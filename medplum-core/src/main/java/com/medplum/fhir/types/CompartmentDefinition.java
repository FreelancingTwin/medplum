/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class CompartmentDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "CompartmentDefinition";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_EXPERIMENTAL = "experimental";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_PUBLISHER = "publisher";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_USE_CONTEXT = "useContext";
    public static final String PROPERTY_PURPOSE = "purpose";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_SEARCH = "search";
    public static final String PROPERTY_RESOURCE = "resource";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public CompartmentDefinition(final JsonObject data) {
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
     * An absolute URI that is used to identify this compartment definition
     * when it is referenced in a specification, model, design or an
     * instance; also called its canonical identifier. This SHOULD be
     * globally unique and SHOULD be a literal address at which at which an
     * authoritative instance of this compartment definition is (or will be)
     * published. This URL can be the target of a canonical reference. It
     * SHALL remain the same when the compartment definition is stored on
     * different servers.
     */
    public String url() {
        return getString(PROPERTY_URL);
    }

    /**
     * The identifier that is used to identify this version of the
     * compartment definition when it is referenced in a specification,
     * model, design or instance. This is an arbitrary value managed by the
     * compartment definition author and is not expected to be globally
     * unique. For example, it might be a timestamp (e.g. yyyymmdd) if a
     * managed version is not available. There is also no expectation that
     * versions can be placed in a lexicographical sequence.
     */
    public String version() {
        return getString(PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the compartment definition. This
     * name should be usable as an identifier for the module by machine
     * processing applications such as code generation.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * The status of this compartment definition. Enables tracking the
     * life-cycle of the content.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this compartment definition is
     * authored for testing purposes (or education/evaluation/marketing) and
     * is not intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(PROPERTY_EXPERIMENTAL);
    }

    /**
     * The date  (and optionally time) when the compartment definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the compartment definition
     * changes.
     */
    public java.time.Instant date() {
        return java.time.Instant.parse(data.getString(PROPERTY_DATE));
    }

    /**
     * The name of the organization or individual that published the
     * compartment definition.
     */
    public String publisher() {
        return getString(PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, PROPERTY_CONTACT);
    }

    /**
     * A free text natural language description of the compartment definition
     * from a consumer's perspective.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate compartment definition
     * instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, PROPERTY_USE_CONTEXT);
    }

    /**
     * Explanation of why this compartment definition is needed and why it
     * has been designed as it has.
     */
    public String purpose() {
        return getString(PROPERTY_PURPOSE);
    }

    /**
     * Which compartment this definition describes.
     */
    public String code() {
        return getString(PROPERTY_CODE);
    }

    /**
     * Whether the search syntax is supported,.
     */
    public Boolean search() {
        return data.getBoolean(PROPERTY_SEARCH);
    }

    /**
     * Information about how a resource is related to the compartment.
     */
    public java.util.List<CompartmentDefinitionResource> resource() {
        return getList(CompartmentDefinitionResource.class, PROPERTY_RESOURCE);
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

        public Builder url(final String url) {
            b.add(PROPERTY_URL, url);
            return this;
        }

        public Builder version(final String version) {
            b.add(PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(PROPERTY_EXPERIMENTAL, experimental);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(PROPERTY_USE_CONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder purpose(final String purpose) {
            b.add(PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder code(final String code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder search(final Boolean search) {
            b.add(PROPERTY_SEARCH, search);
            return this;
        }

        public Builder resource(final java.util.List<CompartmentDefinitionResource> resource) {
            b.add(PROPERTY_RESOURCE, FhirObject.toArray(resource));
            return this;
        }

        public CompartmentDefinition build() {
            return new CompartmentDefinition(b.build());
        }
    }

    public static class CompartmentDefinitionResource extends FhirObject {
        public static final String RESOURCE_TYPE = "CompartmentDefinitionResource";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_PARAM = "param";
        public static final String PROPERTY_DOCUMENTATION = "documentation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompartmentDefinitionResource(final JsonObject data) {
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
         * The name of a resource supported by the server.
         */
        public String code() {
            return getString(PROPERTY_CODE);
        }

        /**
         * The name of a search parameter that represents the link to the
         * compartment. More than one may be listed because a resource may be
         * linked to a compartment in more than one way,.
         */
        public java.util.List<String> param() {
            return getList(String.class, PROPERTY_PARAM);
        }

        /**
         * Additional documentation about the resource and compartment.
         */
        public String documentation() {
            return getString(PROPERTY_DOCUMENTATION);
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

            public Builder param(final java.util.List<String> param) {
                b.add(PROPERTY_PARAM, FhirObject.toStringArray(param));
                return this;
            }

            public Builder documentation(final String documentation) {
                b.add(PROPERTY_DOCUMENTATION, documentation);
                return this;
            }

            public CompartmentDefinitionResource build() {
                return new CompartmentDefinitionResource(b.build());
            }
        }
    }
}