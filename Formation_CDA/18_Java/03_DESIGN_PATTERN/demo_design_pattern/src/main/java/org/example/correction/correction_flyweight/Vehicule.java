package org.example.correction.correction_flyweight;

public class Vehicule {

    String type;

    VehiculeFlyWeight vehiculeFlyWeight;

    public Vehicule(String type, VehiculeFlyWeight vehiculeFlyWeight) {
        this.type = type
        this.vehiculeFlyWeight = vehiculeFlyWeight;
    }

    public void afficheInfo() {
        this.vehiculeFlyWeight.afficherInfosVehicule(type);
    }
}
