package org.example.correction.correction_flyweight;

public class SharedVehiculeState implements VehiculeFlyWeight {
    String marque;
    String modele;

    String couleur;
    public SharedVehiculeState(String marque, String modele, String couleur) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;

    }
    @Override
    public void afficherInfosVehicule(String typeDeVehicule) {
        System.out.println(marque);
        System.out.println(modele);
        System.out.println(couleur);
        System.out.println(typeDeVehicule);
    }
}
