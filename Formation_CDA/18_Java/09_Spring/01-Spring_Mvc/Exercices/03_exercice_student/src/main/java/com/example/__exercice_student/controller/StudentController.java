package com.example.__exercice_student.controller;

import com.example.__exercice_student.model.Student;
import com.example.__exercice_student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private final StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/formulaire")
    public String formAddStudent(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/formulaire")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.createStudent(student);
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
}
