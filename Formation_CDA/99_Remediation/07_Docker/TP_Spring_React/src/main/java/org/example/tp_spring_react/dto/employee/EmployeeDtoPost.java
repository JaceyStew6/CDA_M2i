package org.example.tp_spring_react.dto.employee;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @Size(min = 10, max = 20)
    private String phone;
    //TODO ajouter regex pour vérification email
    private String email;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private String birthDate;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private String contractStart;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private String contractEnd;
    private String occupation;
    private String password;
    private boolean admin;
    private double salary;
    private String observation;
}