
package com.example.digitalprescriptionbackend.dto;

import lombok.Data;

import java.util.List;

@Data
public class PrescriptionDTO {
    private String uhid;
    private List<MedicineDTO> medicines;
}
