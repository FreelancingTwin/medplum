/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ElementTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Element(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Element.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Element x = Element.create().build();
        final Element y = Element.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Element.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Element.create().extension(value).build().extension());
    }
}