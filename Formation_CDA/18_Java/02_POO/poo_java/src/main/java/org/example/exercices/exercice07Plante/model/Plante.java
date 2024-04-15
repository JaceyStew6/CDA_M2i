package org.example.exercices.exercice07Plante.model;

public class Plante {

    private String nom;
    private double hauteur;
    private String couleurFeuille;

    public Plante(String nom, double hauteur, String couleurFeuille) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuille = couleurFeuille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuille() {
        return couleurFeuille;
    }

    public void setCouleurFeuille(String couleurFeuille) {
        this.couleurFeuille = couleurFeuille;
    }


    @Override
    public String toString() {
        return "Plante{" +
                "nom='" + nom + '\'' +
                ", hauteur=" + hauteur +
                ", couleurFeuille='" + couleurFeuille + '\'' +
                '}';
    }


}
