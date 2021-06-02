package com.medplum.server.fhir.r4;

import jakarta.inject.Inject;
import jakarta.json.JsonPatch;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.ws.rs.core.UriInfo;

import com.medplum.fhir.r4.FhirMediaType;
import com.medplum.fhir.r4.types.Bundle;
import com.medplum.fhir.r4.types.FhirResource;
import com.medplum.fhir.r4.types.OperationOutcome;
import com.medplum.server.fhir.r4.repo.Repository;
import com.medplum.server.fhir.r4.search.SearchParser;
import com.medplum.server.security.SecurityUser;

@Path("/fhir/R4")
@Produces(FhirMediaType.APPLICATION_FHIR_JSON)
public class DefaultEndpoint {

    @Inject
    private Repository repo;

    @Context
    private SecurityContext securityContext;

    @Context
    private UriInfo uriInfo;

    @PathParam("resourceType")
    private String resourceType;

    @PathParam("id")
    private String id;

    @PathParam("vid")
    private String vid;

    @POST
    @Consumes(FhirMediaType.APPLICATION_FHIR_JSON)
    public OperationOutcome createBatch(final Bundle data) {
        return repo.createBatch(getUser(), data);
    }

    @POST
    @Path("/{resourceType}/$validate")
    @Consumes(FhirMediaType.APPLICATION_FHIR_JSON)
    public OperationOutcome validateCreate(final FhirResource data) {
        return repo.validateCreate(getUser(), data);
    }

    @POST
    @Path("/{resourceType}")
    @Consumes(FhirMediaType.APPLICATION_FHIR_JSON)
    public OperationOutcome create(final FhirResource data) {
        return repo.create(getUser(), data);
    }

    @GET
    @Path("/{resourceType}")
    public OperationOutcome search() {
        return repo.search(getUser(), SearchParser.parse(uriInfo.getRequestUri()));
    }

    @GET
    @Path("/{resourceType}/{id}")
    public OperationOutcome read() {
        return repo.read(getUser(), resourceType, id);
    }

    @GET
    @Path("/{resourceType}/{id}/_history")
    public OperationOutcome readHistory() {
        return repo.readHistory(getUser(), resourceType, id);
    }

    @GET
    @Path("/{resourceType}/{id}/_history/{vid}")
    public OperationOutcome readVersion() {
        return repo.readVersion(getUser(), resourceType, id, vid);
    }

    @POST
    @Path("/{resourceType}/{id}/$validate")
    @Consumes(FhirMediaType.APPLICATION_FHIR_JSON)
    public OperationOutcome validateUpdate(final FhirResource data) {
        return repo.validateUpdate(getUser(), id, data);
    }

    @PUT
    @Path("/{resourceType}/{id}")
    @Consumes(FhirMediaType.APPLICATION_FHIR_JSON)
    public OperationOutcome update(final FhirResource data) {
        return repo.update(getUser(), id, data);
    }

    @PATCH
    @Path("/{resourceType}/{id}")
    @Consumes(FhirMediaType.APPLICATION_FHIR_JSON)
    public OperationOutcome patch(final JsonPatch patch) {
        return repo.patch(getUser(), resourceType, id, patch);
    }

    @DELETE
    @Path("/{resourceType}/{id}")
    public OperationOutcome delete() {
        return repo.delete(getUser(), resourceType, id);
    }

    private SecurityUser getUser() {
        return (SecurityUser) securityContext.getUserPrincipal();
    }
}