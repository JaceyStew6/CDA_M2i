package com.example.tp_medical.controller;

import com.example.tp_medical.model.Consultation;
import com.example.tp_medical.model.Patient;
import com.example.tp_medical.service.PatientServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {
    private final PatientServiceImpl patientService;

    public PatientController(PatientServiceImpl patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public String patientsList(Model model){
        model.addAttribute("patients",patientService.getAllPatients());
        return "patient-list";
    }

    @GetMapping("/addPatient")
    public String createPatientForm(Model model){
        model.addAttribute("patient", new Patient());
        return "add-patient";
    }

    @PostMapping("/patient/create")
    public String createPatient(@ModelAttribute("patient") Patient patient){
        if(patient.getId() != null) {
            patientService.updatePatient(patient.getId(), patient);
        } else  {
            patientService.createPatient(patient);
        }
        return "redirect:/patients";
    }

    @GetMapping("/patients/detail/{id}")
    public String patientDetail(@PathVariable("id") Long id, Model model) {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "patient-detail";
    }

    @GetMapping("/patient/{id}/consultationForm")
    public String addConsultation(@PathVariable("id") Long id, Model model){
        model.addAttribute("consultation", new Consultation());
        model.addAttribute("patientId", id);
        return "consultation-add";
    }

    @PostMapping("/patient/{patientId}/createConsultation")
    public String createConsultation(
            @PathVariable("patientId") Long id,
            @ModelAttribute("consultation") Consultation consultation) {
        patientService.createConsultation(id, consultation);
        return "redirect:/patients/detail/" + id;
    }

    @GetMapping("/patient/delete")
    public String deletePatient(@RequestParam("patientId") Long id) {
        patientService.deletePatient(id);
        return "redirect:/patients";
    }

    @GetMapping("/patient/update")
    public String formUpdatePatient(@RequestParam("patientId") Long id, Model model) {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "add-patient";
    }
}
