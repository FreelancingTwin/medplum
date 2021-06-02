/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitDetail1Test {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitDetail1(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitDetail1.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ExplanationOfBenefit.ExplanationOfBenefitDetail1 x = ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().build();
        final ExplanationOfBenefit.ExplanationOfBenefitDetail1 y = ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testProductOrService() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().productOrService(value).build().productOrService());
    }

    @Test
    public void testModifier() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().modifier(value).build().modifier());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().quantity(value).build().quantity());
    }

    @Test
    public void testUnitPrice() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().unitPrice(value).build().unitPrice());
    }

    @Test
    public void testFactor() {
        assertEquals(1.0, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().factor(1.0).build().factor());
    }

    @Test
    public void testNet() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().net(value).build().net());
    }

    @Test
    public void testNoteNumber() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().noteNumber(value).build().noteNumber());
    }

    @Test
    public void testAdjudication() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitAdjudication> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().adjudication(value).build().adjudication());
    }

    @Test
    public void testSubDetail() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitSubDetail1> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().subDetail(value).build().subDetail());
    }
}