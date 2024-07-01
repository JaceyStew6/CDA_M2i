package com.example.__exercice_cuisine.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    private UUID id;
    @NotBlank
    @NotNull
    private String name;

    @NotNull
    private List<String> ingredients;

    @NotBlank
    @NotNull
    private String instructions;

    private Category category;

    @NotBlank
    @NotNull
    private String categorieId;
}
