package org.example.exercices.exercice07Plante.model;

public class Arbre extends Plante{

    private double circonference;

    public Arbre(String nom, double hauteur, String couleurFeuille,double circonference) {
        super(nom, hauteur, couleurFeuille);
        this.circonference = circonference;
    }


    @Override
    public String toString() {

        return super.toString()+" Arbre{" +
                "circonference=" + circonference +
                '}';
    }


}
