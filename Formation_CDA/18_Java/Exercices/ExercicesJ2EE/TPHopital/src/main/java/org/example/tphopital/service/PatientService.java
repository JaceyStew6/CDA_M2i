package org.example.tphopital.service;

import org.example.tphopital.model.Consultation;
import org.example.tphopital.model.Patient;
import org.example.tphopital.repository.PatientRepository;

import java.time.LocalDate;
import java.util.List;

public class PatientService {
    private PatientRepository patientRepository = new PatientRepository();

    public Patient add(String lastName, String firstName, LocalDate birthDate){
        Patient patient = new Patient(lastName, firstName, birthDate);
        return patientRepository.add(patient);
    }

    public Patient findById(int id){
        return patientRepository.findById(id);
    }

    public boolean delete(int id){
        Patient patient = patientRepository.findById(id);
        return patientRepository.delete(patient);
    }

    public List<Patient> findAllPatients(){
        return patientRepository.findAllPatients();
    }
}
