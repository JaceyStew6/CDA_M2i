package org.example.tp_spring_react.dto.candidate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDtoPost {
    private String name;
    private int identificationNumber;
    private String address;
    @Size(min = 10, max = 20)
    private String phone;
    //TODO ajouter regex pour vérifier email
    private String email;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private LocalDate birthDate;
    @Min(1)
    @Max(10)
    private int rating;
    private String observation;
    private String skill;
    private String wantedJob;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private LocalDate jobInterviewDate;
}




/*
@Pattern(regexp = "([0-9]+(-[0-9]+)+)")
private String releaseDateStr;
private String description;
@Min(1)
private int duration;
@Min(0)
@Max(8)
private int filmType;
@Min(1)
private int directorId;*/
