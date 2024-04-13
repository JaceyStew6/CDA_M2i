package org.example.exoplantes;

public class Arbre extends Plante {
    private int circonferenceTronc;

    public Arbre(String nom, int hauteur, String couleurFeuille, int circonferenceTronc) {
        super(nom, hauteur, couleurFeuille);
        this.circonferenceTronc = circonferenceTronc;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCirconférence du tronc (cm): " + circonferenceTronc;
    }
}
