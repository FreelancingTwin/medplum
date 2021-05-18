package com.medplum.server.services;

import java.util.List;

import com.medplum.fhir.r4.types.OperationOutcome;

public interface EmailService {

    OperationOutcome sendEmail(List<String> to, List<String> cc, String subject, String body);
}