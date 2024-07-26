package org.example.tp_spring_react.dto.employee;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDtoGet {
    private int id;
    private String name;
    private int identificationNumber;
    private String address;
    private String phone;
    private String email;
    private LocalDate birthDate;
    private LocalDate contractStart;
    private LocalDate contractEnd;
    private String occupation;
    private boolean admin;
    private double salary;
    private String observation;
}
