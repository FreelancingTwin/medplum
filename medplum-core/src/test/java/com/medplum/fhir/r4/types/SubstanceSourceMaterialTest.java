/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceSourceMaterialTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceSourceMaterial(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceSourceMaterial.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceSourceMaterial.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, SubstanceSourceMaterial.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", SubstanceSourceMaterial.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSourceMaterialClass() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().sourceMaterialClass(value).build().sourceMaterialClass());
    }

    @Test
    public void testSourceMaterialType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().sourceMaterialType(value).build().sourceMaterialType());
    }

    @Test
    public void testSourceMaterialState() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().sourceMaterialState(value).build().sourceMaterialState());
    }

    @Test
    public void testOrganismId() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().organismId(value).build().organismId());
    }

    @Test
    public void testOrganismName() {
        assertEquals("x", SubstanceSourceMaterial.create().organismName("x").build().organismName());
    }

    @Test
    public void testParentSubstanceId() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().parentSubstanceId(value).build().parentSubstanceId());
    }

    @Test
    public void testParentSubstanceName() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().parentSubstanceName(value).build().parentSubstanceName());
    }

    @Test
    public void testCountryOfOrigin() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().countryOfOrigin(value).build().countryOfOrigin());
    }

    @Test
    public void testGeographicalLocation() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().geographicalLocation(value).build().geographicalLocation());
    }

    @Test
    public void testDevelopmentStage() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().developmentStage(value).build().developmentStage());
    }

    @Test
    public void testFractionDescription() {
        final java.util.List<SubstanceSourceMaterial.SubstanceSourceMaterialFractionDescription> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().fractionDescription(value).build().fractionDescription());
    }

    @Test
    public void testOrganism() {
        final SubstanceSourceMaterial.SubstanceSourceMaterialOrganism value = SubstanceSourceMaterial.SubstanceSourceMaterialOrganism.create().build();
        assertEquals(value, SubstanceSourceMaterial.create().organism(value).build().organism());
    }

    @Test
    public void testPartDescription() {
        final java.util.List<SubstanceSourceMaterial.SubstanceSourceMaterialPartDescription> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.create().partDescription(value).build().partDescription());
    }
}