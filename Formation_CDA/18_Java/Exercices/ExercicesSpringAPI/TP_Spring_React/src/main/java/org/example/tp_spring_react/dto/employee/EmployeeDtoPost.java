package org.example.tp_spring_react.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDtoPost {
    private String name;
    private int identificationNumber;
    private String address;
    private String phone;
    private String email;
    private String birthDate;
    private String contractStart;
    private String contractEnd;
    private String occupation;
    private boolean admin;
    private double salary;
    private String observation;
}
