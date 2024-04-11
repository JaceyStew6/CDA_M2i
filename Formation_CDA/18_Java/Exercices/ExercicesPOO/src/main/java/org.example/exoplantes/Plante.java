package org.example.exoplantes;

public class Plante {

    protected String nom;
    protected int hauteur;
    protected String couleurFeuille;

    public Plante(String nom, int hauteur, String couleurFeuille) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuille = couleurFeuille;
    }

    public String afficher(){
        return "Nom: " + nom
                + " / Hauteur (cm): " + hauteur
                + " / Couleur des feuilles: " + couleurFeuille;
    }

    @Override
    public String toString() {
        return "Plante: \n" + this.afficher();
    }
}
