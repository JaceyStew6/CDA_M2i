package org.example;

public class SharedVehiculeState implements VehiculeFlyWeight {

    private String model;
    private String color;

    public SharedVehiculeState(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void displayVehiculeInfo(int id) {
        System.out.println(id);
        System.out.println(model);
        System.out.println(color);
    }
}
