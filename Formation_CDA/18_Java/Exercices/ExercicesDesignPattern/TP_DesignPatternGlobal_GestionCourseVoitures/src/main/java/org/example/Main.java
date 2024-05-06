package org.example;

import org.example.entity.Car;
import org.example.entity.ThermalCar;
import org.example.factory.ThermalCarFactory;

public class Main {
    public static void main(String[] args) {

        Car thermal1 = new ThermalCarFactory().createCar(new ThermalCar.ThermalCarBuilder().fuelType("gas").autonomy(5).color("blue"));
        System.out.println(thermal1);

    }
}