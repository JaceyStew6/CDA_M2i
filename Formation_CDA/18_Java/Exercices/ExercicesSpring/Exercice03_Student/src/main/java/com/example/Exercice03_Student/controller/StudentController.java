package com.example.Exercice03_Student.controller;

import com.example.Exercice03_Student.model.Student;
import com.example.Exercice03_Student.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String homePage(){
        return "homePage";
    }

    @GetMapping("/detail/{id}")
    public String detailPage(@PathVariable("id") UUID id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "detailPage";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "listPage";
    }

    @GetMapping("/search") // /search?studentName=Max%20Black
    public String showStudent(@RequestParam(name = "studentName", required = false) String name, Model model){
        Student student = studentService.getStudentByName(name);

        if (student != null){
            model.addAttribute("student", student);
            return "detailPage";
        }else {
            return "homePage";
        }
    }

    @GetMapping("/add")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "form/form";
    }

    @PostMapping("/add")
    public String submitStudent(@ModelAttribute("student") Student student){
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getEmail());
        student = Student.builder().name(student.getName()).age(student.getAge()).email(student.getEmail()).id(UUID.randomUUID()).build();
        studentService.add(student);
        return "redirect:/list";
    }







}
