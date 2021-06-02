package com.medplum.server.fhir.r4;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.time.LocalDate;

import jakarta.json.Json;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;

import org.junit.Test;

import com.medplum.fhir.r4.FhirMediaType;
import com.medplum.fhir.r4.types.Bundle;
import com.medplum.fhir.r4.types.Patient;
import com.medplum.server.BaseTest;
import com.medplum.util.IdUtils;

public class DefaultEndpointTest extends BaseTest {

    @Test
    public void testMetadata() {
        final Response response = fhir().readMetadata();
        assertEquals(200, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testValidateCreateSuccess() {
        final Response response = fhir().validateCreate(Patient.create().build());
        assertEquals(200, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
        assertNull(response.getHeaderString(HttpHeaders.LOCATION));
        assertNull(response.getHeaderString(HttpHeaders.ETAG));
    }

    @Test
    public void testValidateCreateFailure() {
        final Response response = fhir().post(
                UriBuilder.fromUri(fhir().getBaseUrl()).path("Patient/$validate").build(),
                Json.createObjectBuilder().build());

        assertEquals(400, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testValidateUpdateSuccess() {
        final Response response = fhir().validateUpdate(Patient.create().id(IdUtils.generateId()).build());
        assertEquals(200, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
        assertNull(response.getHeaderString(HttpHeaders.LOCATION));
        assertNull(response.getHeaderString(HttpHeaders.ETAG));
    }

    @Test
    public void testValidateUpdateFailure() {
        final Response response = fhir().post(
                UriBuilder.fromUri(fhir().getBaseUrl()).path("Patient/{id}/$validate").build(IdUtils.generateId()),
                Json.createObjectBuilder().build());

        assertEquals(400, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testCreate() {
        final Response response = fhir().create(Patient.create().build());
        assertEquals(201, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
        assertNotNull(response.getHeaderString(HttpHeaders.LOCATION));
        assertNotNull(response.getHeaderString(HttpHeaders.ETAG));
    }

    @Test
    public void testCreateMissingProperty() {
        final Response response = fhir().post(UriBuilder.fromUri(fhir().getBaseUrl()).path("Patient").build(), Json.createObjectBuilder().build());
        assertEquals(400, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testReadNotFound() {
        final Response response = fhir().read("Patient", "does-not-exist");
        assertEquals(404, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testReadHistoryNotFound() {
        final Response response = fhir().readHistory("Patient", "does-not-exist");
        assertEquals(404, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testReadVersionNotFound() {
        final Response response = fhir().readVersion("Patient", "does-not-exist", "version-does-not-exist");
        assertEquals(404, response.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testRead() {
        final Response response1 = fhir().create(Patient.create().build());
        assertEquals(201, response1.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response1.getHeaderString(HttpHeaders.CONTENT_TYPE));
        assertNotNull(response1.getHeaderString(HttpHeaders.LOCATION));

        final String[] path = URI.create(response1.getHeaderString(HttpHeaders.LOCATION)).getPath().split("/");
        assertEquals(7, path.length);
        assertEquals("fhir", path[1]);
        assertEquals("R4", path[2]);
        assertEquals("Patient", path[3]);
        assertEquals("_history", path[5]);

        final String id = path[4];

        final Response response2 = fhir().read("Patient", id);
        assertEquals(200, response2.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response2.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    public void testReadUnauthorized() {
        final Response response1 = fhir().create(Patient.create().build());
        assertEquals(201, response1.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response1.getHeaderString(HttpHeaders.CONTENT_TYPE));
        assertNotNull(response1.getHeaderString(HttpHeaders.LOCATION));

        final String[] path = URI.create(response1.getHeaderString(HttpHeaders.LOCATION)).getPath().split("/");
        assertEquals(7, path.length);
        assertEquals("fhir", path[1]);
        assertEquals("R4", path[2]);
        assertEquals("Patient", path[3]);
        assertEquals("_history", path[5]);

        final String id = path[4];

        // Now try to get the resource without authorization
        final Response response2 = target("/fhir/R4/Patient/" + id)
                .request()
                .get();
        assertEquals(401, response2.getStatus());
    }

    @Test
    public void testReadHistory() {
        final Response response1 = fhir().create(Patient.create().build());
        assertEquals(201, response1.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response1.getHeaderString(HttpHeaders.CONTENT_TYPE));
        assertNotNull(response1.getHeaderString(HttpHeaders.LOCATION));

        final Patient patient1 = response1.readEntity(Patient.class);
        assertNotNull(patient1);

        final Response response2 = fhir().update(Patient.create(patient1).birthDate(LocalDate.of(1980, 1, 1)).build());
        assertEquals(200, response2.getStatus());

        final Patient patient2 = response2.readEntity(Patient.class);
        assertNotNull(patient2);
        assertEquals(patient1.id(), patient2.id());
        assertNotEquals(patient1.meta().versionId(), patient2.meta().versionId());

        final Response response3 = fhir().readHistory("Patient", patient1.id());
        assertEquals(200, response3.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response3.getHeaderString(HttpHeaders.CONTENT_TYPE));

        final Bundle history = response3.readEntity(Bundle.class);
        assertNotNull(history);
        assertEquals(2, history.entry().size());
    }

    @Test
    public void testVersion() {
        final Response response1 = fhir().create(Patient.create().build());
        assertEquals(201, response1.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response1.getHeaderString(HttpHeaders.CONTENT_TYPE));
        assertNotNull(response1.getHeaderString(HttpHeaders.LOCATION));

        final String[] path = URI.create(response1.getHeaderString(HttpHeaders.LOCATION)).getPath().split("/");
        assertEquals(7, path.length);
        assertEquals("fhir", path[1]);
        assertEquals("R4", path[2]);
        assertEquals("Patient", path[3]);
        assertEquals("_history", path[5]);

        final String id = path[4];
        final String vid = path[6];

        final Response response2 = fhir().readVersion("Patient", id, vid);
        assertEquals(200, response2.getStatus());
        assertEquals(FhirMediaType.APPLICATION_FHIR_JSON, response2.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }
}