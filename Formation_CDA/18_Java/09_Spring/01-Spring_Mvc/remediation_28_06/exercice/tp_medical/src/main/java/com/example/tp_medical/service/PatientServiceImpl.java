package com.example.tp_medical.service;

import com.example.tp_medical.model.Consultation;
import com.example.tp_medical.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService {
    private List<Patient> patients = new ArrayList<>();
    private Long idPatient = 1L;
    private Long idConsultation = 1L;

    @Override
    public Patient createPatient(Patient patient) {
        patient.setId(idPatient++);
        patients.add(patient);
        return patient;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patients;
    }

    @Override
    public Patient getPatientById(Long id) {
        return patients.stream().filter(patient -> patient.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void deletePatient(Long id) {
        patients.removeIf(patient -> patient.getId().equals(id));
    }

    @Override
    public Patient updatePatient(Long id, Patient patient) {
        Patient patientExist = getPatientById(id);
        if (patientExist != null) {
            patientExist.setNom(patient.getNom());
            patientExist.setPrenom(patient.getPrenom());
            patientExist.setDateNaissance(patient.getDateNaissance());
        }
        return patientExist;
    }

    @Override
    public List<Consultation> createConsultation(Long patientId, Consultation consultation) {
        Patient patientExist = getPatientById(patientId);
        if (patientExist != null) {
            consultation.setId(idConsultation++);
            patientExist.getConsultations().add(consultation);
        }
        return patientExist.getConsultations();
    }
}
