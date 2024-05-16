package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Recipe {
    private int recipe_id;
    private String recipeName;
    private String preparationTime;
    private String cookingTime;
    private String difficulty;

    private Ingredient ingredient;
    private Category category;



}
