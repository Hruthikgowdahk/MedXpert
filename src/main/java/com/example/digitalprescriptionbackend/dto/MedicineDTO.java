
package com.example.digitalprescriptionbackend.dto;

import lombok.Data;

import java.util.List;

@Data
public class MedicineDTO {
    private String name;
    private List<String> timing;
    private boolean beforeFood;
    private String dosage;
    private int days;
}
