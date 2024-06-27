package com.example.Exercice04_recipesManagementApp.service;

import com.example.Exercice04_recipesManagementApp.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories = new ArrayList<>();
    @Override
    public Category createCategory(Category category) {
        category.setId(UUID.randomUUID());
        categories.add(category);
        return category;
    }

    @Override
    public Category getCategoryById(UUID id) {
        return categories.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Category updateCategory(UUID id, Category updateCategory) {
        Category categoryExist = getCategoryById(id);
        if (categoryExist != null){
            categoryExist.setName(updateCategory.getName());
            categoryExist.setDescription(updateCategory.getDescription());
        }
        return categoryExist;
    }

    @Override
    public void deleteCategory(UUID id) {
        categories.removeIf(category -> category.getId().equals(id));
    }
}
