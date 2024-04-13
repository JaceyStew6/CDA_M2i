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

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "\nNom: " + nom
                + "\nHauteur (cm): " + hauteur
                + "\nCouleur des feuilles: " + couleurFeuille;
    }
}
