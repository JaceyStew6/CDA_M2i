package com.example.tp_medical.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateConsultation;
    @NotNull
    @NotBlank
    private String description;
}
