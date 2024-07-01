package com.example.__exercice_cuisine.service;

import com.example.__exercice_cuisine.model.Category;
import com.example.__exercice_cuisine.model.Recipe;

import java.util.List;
import java.util.UUID;

public interface IRecipeService {
    Recipe create(Recipe entity, Category category);
    List<Recipe> getAll();
    void delete(UUID id);
    Recipe getById(UUID id);
    Recipe update(UUID id, Recipe entity, Category category);
}
