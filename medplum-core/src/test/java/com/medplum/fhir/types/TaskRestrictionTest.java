/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TaskRestrictionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Task.TaskRestriction(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Task.TaskRestriction.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Task.TaskRestriction.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Task.TaskRestriction.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Task.TaskRestriction.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testRepetitions() {
        assertEquals(1, Task.TaskRestriction.create().repetitions(1).build().repetitions());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Task.TaskRestriction.create().period(value).build().period());
    }

    @Test
    public void testRecipient() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Task.TaskRestriction.create().recipient(value).build().recipient());
    }
}