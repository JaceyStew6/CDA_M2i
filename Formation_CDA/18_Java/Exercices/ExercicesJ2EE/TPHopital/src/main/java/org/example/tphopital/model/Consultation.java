package org.example.tphopital.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int consultationId;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime consultationDate;

    private String doctorName;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany(mappedBy = "consultation")
    private List<Prescription> prescriptions;

    @OneToMany(mappedBy = "consultation")
    private List<CareSheet> careSheets;

    public Consultation() {
    }

    public Consultation(LocalDateTime consultationDate, String doctorName, Patient patient, List<Prescription> prescriptions, List<CareSheet> careSheets) {
        this.consultationDate = consultationDate;
        this.doctorName = doctorName;
        this.patient = patient;
        this.prescriptions = prescriptions;
        this.careSheets = careSheets;
    }

    public int getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(int consultationId) {
        this.consultationId = consultationId;
    }

    public LocalDateTime getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(LocalDateTime consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<CareSheet> getCareSheets() {
        return careSheets;
    }

    public void setCareSheets(List<CareSheet> careSheets) {
        this.careSheets = careSheets;
    }
}

