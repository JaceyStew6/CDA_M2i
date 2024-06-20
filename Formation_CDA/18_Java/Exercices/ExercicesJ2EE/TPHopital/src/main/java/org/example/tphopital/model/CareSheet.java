package org.example.tphopital.model;

import jakarta.persistence.*;

@Entity
public class CareSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int careSheetId;
    private String careType;
    private String careDuration;

    @ManyToOne
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;

    public CareSheet() {
    }

    public CareSheet(String careType, String careDuration, Consultation consultation) {
        this.careType = careType;
        this.careDuration = careDuration;
        this.consultation = consultation;
    }

    public int getCareSheetId() {
        return careSheetId;
    }

    public void setCareSheetId(int carSheetId) {
        this.careSheetId = carSheetId;
    }

    public String getCareType() {
        return careType;
    }

    public void setCareType(String careType) {
        this.careType = careType;
    }

    public String getCareDuration() {
        return careDuration;
    }

    public void setCareDuration(String careDuration) {
        this.careDuration = careDuration;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}

