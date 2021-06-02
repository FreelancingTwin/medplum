/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * For referring to data content defined in other formats.
 */
public class Attachment extends FhirObject {
    public static final String RESOURCE_TYPE = "Attachment";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Attachment(final JsonObject data) {
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
     * Identifies the type of the data in the attachment and allows a method
     * to be chosen to interpret or render the data. Includes mime type
     * parameters such as charset where appropriate.
     */
    public String contentType() {
        return getString(FhirPropertyNames.PROPERTY_CONTENT_TYPE);
    }

    /**
     * The human language of the content. The value can be any valid value
     * according to BCP 47.
     */
    public String language() {
        return getString(FhirPropertyNames.PROPERTY_LANGUAGE);
    }

    /**
     * The actual data of the attachment - a sequence of bytes, base64
     * encoded.
     */
    public String data() {
        return getString(FhirPropertyNames.PROPERTY_DATA);
    }

    /**
     * A location where the data can be accessed.
     */
    public java.net.URI url() {
        return getUri(FhirPropertyNames.PROPERTY_URL);
    }

    /**
     * The number of bytes of data that make up this attachment (before
     * base64 encoding, if that is done).
     */
    public Integer sizeValue() {
        return data.getInt(FhirPropertyNames.PROPERTY_SIZE);
    }

    /**
     * The calculated hash of the data using SHA-1. Represented using base64.
     */
    public String hash() {
        return getString(FhirPropertyNames.PROPERTY_HASH);
    }

    /**
     * A label or set of text to display in place of the data.
     */
    public String title() {
        return getString(FhirPropertyNames.PROPERTY_TITLE);
    }

    /**
     * The date that the attachment was first created.
     */
    public java.time.Instant creation() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATION);
    }

    public static final class Builder extends FhirObject.Builder<Attachment, Attachment.Builder> {

        private Builder() {
            super();
        }

        private Builder(final JsonObject data) {
            super(data);
        }

        public Builder id(final String id) {
            b.add(FhirPropertyNames.PROPERTY_ID, id);
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder contentType(final String contentType) {
            b.add(FhirPropertyNames.PROPERTY_CONTENT_TYPE, contentType);
            return this;
        }

        public Builder language(final String language) {
            b.add(FhirPropertyNames.PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder data(final String data) {
            b.add(FhirPropertyNames.PROPERTY_DATA, data);
            return this;
        }

        public Builder url(final java.net.URI url) {
            b.add(FhirPropertyNames.PROPERTY_URL, url.toString());
            return this;
        }

        public Builder sizeValue(final Integer sizeValue) {
            b.add(FhirPropertyNames.PROPERTY_SIZE, sizeValue);
            return this;
        }

        public Builder hash(final String hash) {
            b.add(FhirPropertyNames.PROPERTY_HASH, hash);
            return this;
        }

        public Builder title(final String title) {
            b.add(FhirPropertyNames.PROPERTY_TITLE, title);
            return this;
        }

        public Builder creation(final java.time.Instant creation) {
            b.add(FhirPropertyNames.PROPERTY_CREATION, creation.toString());
            return this;
        }

        public Attachment build() {
            return new Attachment(b.build());
        }
    }
}