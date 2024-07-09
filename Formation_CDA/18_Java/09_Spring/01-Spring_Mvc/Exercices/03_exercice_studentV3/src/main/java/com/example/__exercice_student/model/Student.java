package com.example.__exercice_student.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private Long id;
    @NotBlank
    @NotNull
    private String firstname;
    @NotNull
    @NotBlank
    private String lastname;
    @Min(16)
    @Max(50)
    private int age;
    @NotNull
    @NotBlank
    @Pattern(regexp = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$", message = "Invalid field")
    private String email;
}
