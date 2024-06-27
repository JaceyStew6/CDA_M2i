package com.example.Exercice04_recipesManagementApp.service;

import com.example.Exercice04_recipesManagementApp.model.Category;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface CategoryService {
    Category createCategory(Category category);
    Category getCategoryById(UUID id);
    List<Category> getAllCategories();

    Category updateCategory(UUID id, Category updateCategory);
    void deleteCategory(UUID id);
}




