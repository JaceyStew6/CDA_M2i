package com.example.Exercice03_Student.service;

import com.example.Exercice03_Student.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class StudentService {
    private final Map<UUID, Student> students;

    public StudentService(){
        students = new HashMap<>();


        Student student1 = Student.builder()
                .id(UUID.randomUUID())
                .name("Max Black")
                .age(29)
                .email("maxblck@nyc.com")
                .build();

        Student student2 = Student.builder()
                .id(UUID.randomUUID())
                .name("Caroline Channing")
                .age(30)
                .email("carobling@nyc.com")
                .build();

        Student student3 = Student.builder()
                .id(UUID.randomUUID())
                .name("Olympia Fonte")
                .age(29)
                .email("Olympie@inquisition.alt")
                .build();

        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);
    }

    public List<Student> getAllStudents(){
        return students.values().stream().toList();
    }

    public Student getStudentById(UUID id){
        return students.get(id);
    }

    public Student getStudentByName(String name){
        return students.values().stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
    }

    public void add(Student student){
        students.put(student.getId(), student);
    }
}
