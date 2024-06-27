package com.example.Exercice04_recipesManagementApp.controller;

import com.example.Exercice04_recipesManagementApp.model.Category;
import com.example.Exercice04_recipesManagementApp.service.CategoryServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class CategoryController {
    private final CategoryServiceImpl categoryService;
    @Autowired
    public CategoryController(CategoryServiceImpl categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/form")
    public String formAddCategory(Model model){
        model.addAttribute("category", new Category());
        return "form";
    }

    @PostMapping("/form")
    public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result){
        if (result.hasErrors()){
            return "form";
        }else {
            if (category.getId() != null){
                categoryService.updateCategory(category.getId(), category);
            }else {
                categoryService.createCategory(category);
            }
        }
        return "redirect:/categories";
    }
    
    @GetMapping("/categories")
    public String showAllCategories(Model model){
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "list";
    }

    @GetMapping("/update")
    public String formUpdate(@RequestParam("categoryId")UUID id, Model model){
        Category category = categoryService.getCategoryById(id);
        model.addAttribute("category", category);
        return "form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("categoryId") UUID id){
        categoryService.deleteCategory(id);
        return "redirect:/categories";
    }













}
