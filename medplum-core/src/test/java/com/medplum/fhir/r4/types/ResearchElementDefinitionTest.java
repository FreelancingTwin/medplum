/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ResearchElementDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ResearchElementDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ResearchElementDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", ResearchElementDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ResearchElementDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ResearchElementDefinition.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ResearchElementDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ResearchElementDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ResearchElementDefinition.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", ResearchElementDefinition.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", ResearchElementDefinition.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", ResearchElementDefinition.create().title("x").build().title());
    }

    @Test
    public void testShortTitle() {
        assertEquals("x", ResearchElementDefinition.create().shortTitle("x").build().shortTitle());
    }

    @Test
    public void testSubtitle() {
        assertEquals("x", ResearchElementDefinition.create().subtitle("x").build().subtitle());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ResearchElementDefinition.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, ResearchElementDefinition.create().experimental(true).build().experimental());
    }

    @Test
    public void testSubjectCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ResearchElementDefinition.create().subjectCodeableConcept(value).build().subjectCodeableConcept());
    }

    @Test
    public void testSubjectReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ResearchElementDefinition.create().subjectReference(value).build().subjectReference());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ResearchElementDefinition.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", ResearchElementDefinition.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ResearchElementDefinition.create().description("x").build().description());
    }

    @Test
    public void testComment() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().comment(value).build().comment());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", ResearchElementDefinition.create().purpose("x").build().purpose());
    }

    @Test
    public void testUsage() {
        assertEquals("x", ResearchElementDefinition.create().usage("x").build().usage());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", ResearchElementDefinition.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, ResearchElementDefinition.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, ResearchElementDefinition.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ResearchElementDefinition.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testTopic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().topic(value).build().topic());
    }

    @Test
    public void testAuthor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().author(value).build().author());
    }

    @Test
    public void testEditor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().editor(value).build().editor());
    }

    @Test
    public void testReviewer() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().reviewer(value).build().reviewer());
    }

    @Test
    public void testEndorser() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().endorser(value).build().endorser());
    }

    @Test
    public void testRelatedArtifact() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().relatedArtifact(value).build().relatedArtifact());
    }

    @Test
    public void testLibrary() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().library(value).build().library());
    }

    @Test
    public void testType() {
        assertEquals("x", ResearchElementDefinition.create().type("x").build().type());
    }

    @Test
    public void testVariableType() {
        assertEquals("x", ResearchElementDefinition.create().variableType("x").build().variableType());
    }

    @Test
    public void testCharacteristic() {
        final java.util.List<ResearchElementDefinition.ResearchElementDefinitionCharacteristic> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.create().characteristic(value).build().characteristic());
    }
}