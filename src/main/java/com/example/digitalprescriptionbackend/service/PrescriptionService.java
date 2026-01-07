
package com.example.digitalprescriptionbackend.service;

import com.example.digitalprescriptionbackend.dto.PrescriptionDTO;
import com.example.digitalprescriptionbackend.model.Prescription;
import com.example.digitalprescriptionbackend.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public List<PrescriptionDTO> getPrescriptionsByUhid(String uhid) {
        return prescriptionRepository.findByUhid(uhid).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public PrescriptionDTO createPrescription(PrescriptionDTO prescriptionDTO) {
        Prescription prescription = convertToEntity(prescriptionDTO);
        prescription = prescriptionRepository.save(prescription);
        return convertToDto(prescription);
    }

    public void deletePrescription(Long id) {
        prescriptionRepository.deleteById(id);
    }

    private PrescriptionDTO convertToDto(Prescription prescription) {
        // ... conversion logic ...
    }

    private Prescription convertToEntity(PrescriptionDTO prescriptionDTO) {
        // ... conversion logic ...
    }
}
