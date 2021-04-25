/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ValueSetComposeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ValueSet.ValueSetCompose(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ValueSet.ValueSetCompose.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ValueSet.ValueSetCompose.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetCompose.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLockedDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ValueSet.ValueSetCompose.create().lockedDate(value).build().lockedDate());
    }

    @Test
    public void testInactive() {
        assertEquals(true, ValueSet.ValueSetCompose.create().inactive(true).build().inactive());
    }

    @Test
    public void testInclude() {
        final java.util.List<ValueSet.ValueSetInclude> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetCompose.create().include(value).build().include());
    }

    @Test
    public void testExclude() {
        final java.util.List<ValueSet.ValueSetInclude> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetCompose.create().exclude(value).build().exclude());
    }
}