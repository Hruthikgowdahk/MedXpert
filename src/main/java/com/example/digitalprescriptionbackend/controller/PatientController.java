package com.example.digitalprescriptionbackend.controller;

import com.example.digitalprescriptionbackend.dto.PatientDTO;
import com.example.digitalprescriptionbackend.service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@Tag(name = "Patient Management", description = "APIs for managing patient records")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    @Operation(summary = "Get all patients", description = "Retrieve a list of all patients")
    public List<PatientDTO> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{uhid}")
    @Operation(summary = "Get patient by UHID", description = "Retrieve a patient by their Unique Health ID")
    public PatientDTO getPatientByUhid(@PathVariable String uhid) {
        return patientService.getPatientByUhid(uhid);
    }

    @GetMapping("/aadhaar/{aadhaar}")
    @Operation(summary = "Get patient by Aadhaar", description = "Retrieve a patient by their Aadhaar number")
    public ResponseEntity<PatientDTO> getPatientByAadhaar(@PathVariable String aadhaar) {
        return patientService.getPatientByAadhaar(aadhaar)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new patient", description = "Create a new patient record")
    public PatientDTO createPatient(@RequestBody PatientDTO patientDTO) {
        return patientService.createPatient(patientDTO);
    }
}
