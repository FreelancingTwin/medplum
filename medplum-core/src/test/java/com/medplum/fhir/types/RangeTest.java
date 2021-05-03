/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class RangeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Range(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Range.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Range.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Range.create().extension(value).build().extension());
    }

    @Test
    public void testLow() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, Range.create().low(value).build().low());
    }

    @Test
    public void testHigh() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, Range.create().high(value).build().high());
    }
}