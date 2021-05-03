/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TerminologyCapabilitiesSoftwareTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TerminologyCapabilities.TerminologyCapabilitiesSoftware(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TerminologyCapabilities.TerminologyCapabilitiesSoftware.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().name("x").build().name());
    }

    @Test
    public void testVersion() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().version("x").build().version());
    }
}