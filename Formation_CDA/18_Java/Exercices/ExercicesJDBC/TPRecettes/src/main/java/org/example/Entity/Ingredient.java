package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Ingredient {
    private int ingredient_id;
    private String ingredientName;

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredient_id=" + ingredient_id +
                ", ingredientName='" + ingredientName + '\'' +
                '}';
    }
}
