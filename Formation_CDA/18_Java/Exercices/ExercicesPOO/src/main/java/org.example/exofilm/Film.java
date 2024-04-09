package org.example.exofilm;

import java.time.*;

public class Film {

    //Attributs des films
    private String titre;
    private String realisateur;
    private LocalDate anneeSortie;
    private String genre;

    public Film(String titre, String realisateur, int annee, int mois, int jour, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneeSortie = LocalDate.of(annee, mois, jour);
        this.genre = genre;
    }

    public String toString() {
        return "Film{titre = '" + this.titre + "', realisateur= '" + this.realisateur + "', dateSortie= " + this.anneeSortie + ", genre= '" + this.genre + "'}";
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public LocalDate getAnneeSortie() {
        return anneeSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setAnneeSortie(LocalDate anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
