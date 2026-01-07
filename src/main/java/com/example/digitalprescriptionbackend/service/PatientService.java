
package com.example.digitalprescriptionbackend.service;

import com.example.digitalprescriptionbackend.dto.PatientDTO;
import com.example.digitalprescriptionbackend.model.Patient;
import com.example.digitalprescriptionbackend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public PatientDTO getPatientByUhid(String uhid) {
        return patientRepository.findByUhid(uhid)
                .map(this::convertToDto)
                .orElse(null); // Should throw exception
    }

    public Optional<PatientDTO> getPatientByAadhaar(String aadhaar) {
        return patientRepository.findByAadhaar(aadhaar)
                .map(this::convertToDto);
    }

    public PatientDTO createPatient(PatientDTO patientDTO) {
        if (patientRepository.findByAadhaar(patientDTO.getAadhaar()).isPresent()) {
            throw new IllegalStateException("Patient with this Aadhaar number already exists.");
        }
        Patient patient = convertToEntity(patientDTO);
        patient.setUhid(generateUhid());
        patient = patientRepository.save(patient);
        return convertToDto(patient);
    }

    private PatientDTO convertToDto(Patient patient) {
        if (patient == null) {
            return null;
        }
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setUhid(patient.getUhid());
        patientDTO.setName(patient.getName());
        patientDTO.setGender(patient.getGender());
        patientDTO.setAge(patient.getAge());
        patientDTO.setDateOfBirth(patient.getDateOfBirth());
        patientDTO.setBloodGroup(patient.getBloodGroup());
        patientDTO.setAadhaar(patient.getAadhaar());
        return patientDTO;
    }

    private Patient convertToEntity(PatientDTO patientDTO) {
        if (patientDTO == null) {
            return null;
        }
        Patient patient = new Patient();
        patient.setName(patientDTO.getName());
        patient.setGender(patientDTO.getGender());
        patient.setAge(patientDTO.getAge());
        patient.setDateOfBirth(patientDTO.getDateOfBirth());
        patient.setBloodGroup(patientDTO.getBloodGroup());
        patient.setAadhaar(patientDTO.getAadhaar());
        return patient;
    }

    private String generateUhid() {
        return String.valueOf(UUID.randomUUID()).replace("-", "");
    }
}
