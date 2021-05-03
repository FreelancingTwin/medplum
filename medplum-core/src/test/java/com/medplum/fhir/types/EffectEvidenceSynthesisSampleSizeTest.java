/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EffectEvidenceSynthesisSampleSizeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create().description("x").build().description());
    }

    @Test
    public void testNumberOfStudies() {
        assertEquals(1, EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create().numberOfStudies(1).build().numberOfStudies());
    }

    @Test
    public void testNumberOfParticipants() {
        assertEquals(1, EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSize.create().numberOfParticipants(1).build().numberOfParticipants());
    }
}