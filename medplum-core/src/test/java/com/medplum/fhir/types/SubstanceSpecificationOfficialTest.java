/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceSpecificationOfficialTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceSpecification.SubstanceSpecificationOfficial(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceSpecification.SubstanceSpecificationOfficial.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceSpecification.SubstanceSpecificationOfficial.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationOfficial.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationOfficial.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAuthority() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationOfficial.create().authority(value).build().authority());
    }

    @Test
    public void testStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationOfficial.create().status(value).build().status());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationOfficial.create().date(value).build().date());
    }
}