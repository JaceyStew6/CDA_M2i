package org.example.tp_spring_react.controller;

import org.example.tp_spring_react.dto.candidate.CandidateDtoGet;
import org.example.tp_spring_react.dto.candidate.CandidateDtoPost;
import org.example.tp_spring_react.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CandidateController {
    @Autowired
    private CandidateService service;

    @GetMapping("/candidates")
    public ResponseEntity<List<CandidateDtoGet>> getAllCandidates() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/candidates/{id}")
    public ResponseEntity<CandidateDtoGet> getCandidateById(@PathVariable("id") int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/candidates/add")
    public ResponseEntity<CandidateDtoGet> addCandidate(@Validated @RequestBody CandidateDtoPost candidateDtoPost) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(candidateDtoPost));
    }

    @PutMapping("/candidate/{id}")
    public ResponseEntity<CandidateDtoGet> updateCandidate(@PathVariable("id") int id, @Validated @RequestBody CandidateDtoPost candidateDtoPost) {
        return ResponseEntity.ok(service.update(id, candidateDtoPost));
    }

    @DeleteMapping("/candidate/{id}")
    public ResponseEntity<String> deleteCandidate(@PathVariable("id") int id) {
        service.delete(id);
        return ResponseEntity.ok("candidate with id :" + id + " is delete");
    }
}