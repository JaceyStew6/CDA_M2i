package com.example.recap_spring.model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dog {
    private Long id;
    @NotNull(message = "Merci de saisir le nom de votre chien !")
    @NotBlank
    private String name;

    @NotNull(message = "Merci de saisir l'age de votre chien !")
    @Min(value = 1, message = "Merci de saisir un age positif !")
    private int age;

    @NotBlank
    @NotNull(message = "Merci de saisir la race de votre chien !")
    private String breed;
}
