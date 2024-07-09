package org.example.tp_spring_react.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private int identificationNumber;
    private String address;
    private String phone;
    private String email;
    private LocalDate birthDate;
    private int rating;
    @Column(columnDefinition = "text")
    private String observation;
    private String skill;
    private String wantedJob;
    private LocalDate jobInterviewDate;
}