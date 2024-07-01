package com.example.tp_medical.service;

import com.example.tp_medical.model.Consultation;
import com.example.tp_medical.model.Patient;

import java.util.List;

public interface IPatientService {
    Patient createPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    void deletePatient(Long id);
    Patient updatePatient(Long id, Patient patient);
    List<Consultation> createConsultation(Long patientId, Consultation consultation);
}
