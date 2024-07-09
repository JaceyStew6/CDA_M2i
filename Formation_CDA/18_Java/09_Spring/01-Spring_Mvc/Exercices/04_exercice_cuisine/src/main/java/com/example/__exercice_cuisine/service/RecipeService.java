package com.example.__exercice_cuisine.service;

import com.example.__exercice_cuisine.model.Category;
import com.example.__exercice_cuisine.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RecipeService implements IRecipeService{
    private List<Recipe> recettes = new ArrayList<>();


    @Override
    public Recipe create(Recipe entity, Category category) {
        entity.setId(UUID.randomUUID());
        entity.setCategory(category);
        recettes.add(entity);
        return entity;
    }

    @Override
    public List<Recipe> getAll() {
        return recettes;
    }

    @Override
    public void delete(UUID id) {
        recettes.removeIf(recette -> recette.getId().equals(id));
    }

    @Override
    public Recipe getById(UUID id) {
        return recettes.stream().filter(recette -> recette.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Recipe update(UUID id, Recipe entity, Category category) {
        Recipe recipeExist = getById(id);
        if (recipeExist != null) {
            recipeExist.setName(entity.getName());
            recipeExist.setIngredients(entity.getIngredients());
            recipeExist.setInstructions(entity.getInstructions());
            recipeExist.setCategory(category);
        }
        return recipeExist;
    }
}
