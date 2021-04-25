/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductAuthorizationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductAuthorization(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductAuthorization.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", MedicinalProductAuthorization.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductAuthorization.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", MedicinalProductAuthorization.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicinalProductAuthorization.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductAuthorization.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductAuthorization.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductAuthorization.create().identifier(value).build().identifier());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().subject(value).build().subject());
    }

    @Test
    public void testCountry() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductAuthorization.create().country(value).build().country());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductAuthorization.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().status(value).build().status());
    }

    @Test
    public void testStatusDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, MedicinalProductAuthorization.create().statusDate(value).build().statusDate());
    }

    @Test
    public void testRestoreDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, MedicinalProductAuthorization.create().restoreDate(value).build().restoreDate());
    }

    @Test
    public void testValidityPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().validityPeriod(value).build().validityPeriod());
    }

    @Test
    public void testDataExclusivityPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().dataExclusivityPeriod(value).build().dataExclusivityPeriod());
    }

    @Test
    public void testDateOfFirstAuthorization() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, MedicinalProductAuthorization.create().dateOfFirstAuthorization(value).build().dateOfFirstAuthorization());
    }

    @Test
    public void testInternationalBirthDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, MedicinalProductAuthorization.create().internationalBirthDate(value).build().internationalBirthDate());
    }

    @Test
    public void testLegalBasis() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().legalBasis(value).build().legalBasis());
    }

    @Test
    public void testJurisdictionalAuthorization() {
        final java.util.List<MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorization> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductAuthorization.create().jurisdictionalAuthorization(value).build().jurisdictionalAuthorization());
    }

    @Test
    public void testHolder() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().holder(value).build().holder());
    }

    @Test
    public void testRegulator() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().regulator(value).build().regulator());
    }

    @Test
    public void testProcedure() {
        final MedicinalProductAuthorization.MedicinalProductAuthorizationProcedure value = MedicinalProductAuthorization.MedicinalProductAuthorizationProcedure.create().build();
        assertEquals(value, MedicinalProductAuthorization.create().procedure(value).build().procedure());
    }
}