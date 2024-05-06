package org.example;

public class Vehicule {

    private int id;

    private VehiculeFlyWeight flyWeight;

    public Vehicule(int id, VehiculeFlyWeight flyWeight) {
        this.id = id;
        this.flyWeight = flyWeight;
    }

    public void display(){
        this.flyWeight.displayVehiculeInfo(id);
    }
}
