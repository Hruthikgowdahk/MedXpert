
package com.example.digitalprescriptionbackend.dto;

import lombok.Data;

@Data
public class PatientDTO {
    private String uhid;
    private String name;
    private String gender;
    private Integer age;
    private String aadhaar;
}
