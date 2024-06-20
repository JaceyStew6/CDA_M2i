package org.example.tphopital.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prescriptionId;

    private String medicineName;
    @Temporal(TemporalType.DATE)
    private LocalDate prescriptionDate;

    @ManyToOne
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;

    public Prescription() {
    }

    public Prescription(String medicineName, LocalDate prescriptionDate, Consultation consultation) {
        this.medicineName = medicineName;
        this.prescriptionDate = prescriptionDate;
        this.consultation = consultation;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public LocalDate getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(LocalDate prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
