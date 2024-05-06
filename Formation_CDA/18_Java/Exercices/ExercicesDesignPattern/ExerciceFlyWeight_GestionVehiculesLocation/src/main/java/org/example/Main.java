package org.example;

public class Main {
    public static void main(String[] args) {

        FlyWeightFactory factory = new FlyWeightFactory();

        Vehicule vehicule = new Vehicule(1, factory.getFlyweight(1, "Dacia", "Gris"));
    }
}
