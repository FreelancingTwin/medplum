/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class StructureDefinitionSnapshotTest {

    @Test
    public void testConstructor() {
        assertNotNull(new StructureDefinition.StructureDefinitionSnapshot(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(StructureDefinition.StructureDefinitionSnapshot.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", StructureDefinition.StructureDefinitionSnapshot.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureDefinition.StructureDefinitionSnapshot.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureDefinition.StructureDefinitionSnapshot.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testElement() {
        final java.util.List<ElementDefinition> value = java.util.Collections.emptyList();
        assertEquals(value, StructureDefinition.StructureDefinitionSnapshot.create().element(value).build().element());
    }
}