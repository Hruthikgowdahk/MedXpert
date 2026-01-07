
package com.example.digitalprescriptionbackend.repository;

import com.example.digitalprescriptionbackend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByUhid(String uhid);
}
