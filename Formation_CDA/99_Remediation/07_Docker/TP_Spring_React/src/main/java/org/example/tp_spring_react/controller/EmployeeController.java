package org.example.tp_spring_react.controller;

import org.example.tp_spring_react.dto.employee.EmployeeDtoGet;
import org.example.tp_spring_react.dto.employee.EmployeeDtoPost;
import org.example.tp_spring_react.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDtoGet>> getAllEmployees(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDtoGet> getEmployeeById(@PathVariable("id") int id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/employees/add")
    public ResponseEntity<EmployeeDtoGet> addEmployee(@Validated @RequestBody EmployeeDtoPost employeeDtoPost){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(employeeDtoPost));
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<EmployeeDtoGet> updateEmployee(@PathVariable("id") int id, @Validated @RequestBody EmployeeDtoPost employeeDtoPost){
        return ResponseEntity.ok(service.update(id, employeeDtoPost));
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<String> deleteCandidate(@PathVariable("id") int id){
        service.delete(id);
        return ResponseEntity.ok("candidate with id :" + id + " has been deleted");
    }
}
