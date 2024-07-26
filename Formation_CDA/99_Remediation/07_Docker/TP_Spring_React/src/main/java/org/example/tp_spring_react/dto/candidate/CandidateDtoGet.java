package org.example.tp_spring_react.dto.candidate;

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
public class CandidateDtoGet {
    private int id;
    private String name;
    private int identificationNumber;
    private String address;
    private String phone;
    private String email;
    private LocalDate birthDate;
    private int rating;
    private String observation;
    private String skill;
    private String wantedJob;
    private LocalDate jobInterviewDate;
}

