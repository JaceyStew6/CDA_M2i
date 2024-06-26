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


/*



    @PostMapping("/formulaire")
    public String addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result) {
        if(result.hasErrors()){
            return "form";
        } else {
            if (student.getId() != null) {
                studentService.updateStudent(student.getId(), student);
            } else {
                studentService.createStudent(student);
            }
        }
        return "redirect:/students";
    }

    @GetMapping("/students")
    public String showAllStudents(@RequestParam(name="search", required = false) String search, Model model) {
        if(search == null) {
            model.addAttribute("students", studentService.getAllStudents());
        } else {
            model.addAttribute("students", studentService.searchStudents(search));
        }
        return "list";
    }

    @GetMapping("/student/{id}")
    public String showStudent(@PathVariable("id") Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "detail";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("/update")
    public String formUpdate(@RequestParam("studentId") Long id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "form";
    }
}*/




