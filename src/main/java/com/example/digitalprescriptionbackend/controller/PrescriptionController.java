package com.example.digitalprescriptionbackend.controller;

import com.example.digitalprescriptionbackend.dto.PrescriptionDTO;
import com.example.digitalprescriptionbackend.service.PrescriptionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
@Tag(name = "Prescription Management", description = "APIs for managing prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @GetMapping("/{uhid}")
    @Operation(summary = "Get prescriptions by UHID", description = "Retrieve all prescriptions for a given patient UHID")
    public List<PrescriptionDTO> getPrescriptionsByUhid(@PathVariable String uhid) {
        return prescriptionService.getPrescriptionsByUhid(uhid);
    }

    @PostMapping
    @Operation(summary = "Create a new prescription", description = "Create a new prescription for a patient")
    public PrescriptionDTO createPrescription(@RequestBody PrescriptionDTO prescriptionDTO) {
        return prescriptionService.createPrescription(prescriptionDTO);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a prescription", description = "Delete a prescription by its ID")
    public ResponseEntity<Void> deletePrescription(@PathVariable Long id) {
        prescriptionService.deletePrescription(id);
        return ResponseEntity.noContent().build();
    }
}
