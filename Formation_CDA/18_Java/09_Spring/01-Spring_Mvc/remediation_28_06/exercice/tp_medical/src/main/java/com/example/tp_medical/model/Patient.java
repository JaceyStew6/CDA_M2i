package com.example.tp_medical.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private Long id;
    @NotBlank
    @NotNull
    private String prenom;
    @NotBlank
    @NotNull
    private String nom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date dateNaissance;
    @NotNull
    private List<Consultation> consultations = new ArrayList<>();
}
