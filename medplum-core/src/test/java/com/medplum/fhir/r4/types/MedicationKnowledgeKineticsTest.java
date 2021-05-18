/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationKnowledgeKineticsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationKnowledge.MedicationKnowledgeKinetics(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationKnowledge.MedicationKnowledgeKinetics.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeKinetics.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeKinetics.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeKinetics.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAreaUnderCurve() {
        final java.util.List<Quantity> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeKinetics.create().areaUnderCurve(value).build().areaUnderCurve());
    }

    @Test
    public void testLethalDose50() {
        final java.util.List<Quantity> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeKinetics.create().lethalDose50(value).build().lethalDose50());
    }

    @Test
    public void testHalfLifePeriod() {
        final Duration value = Duration.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeKinetics.create().halfLifePeriod(value).build().halfLifePeriod());
    }
}