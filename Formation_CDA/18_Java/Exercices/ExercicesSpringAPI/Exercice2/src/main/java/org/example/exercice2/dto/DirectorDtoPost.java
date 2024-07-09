package org.example.exercice2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DirectorDtoPost {
    private String lastname;
    private String firstname;
    private String birthdate;
    private String nationality;
}
