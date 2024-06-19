package org.example.exercice9.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exercice9.model.Car;

@ApplicationScoped
public class CarService {
    public Car save(int id, String brand, String manufacturingYear, String color){
        return new Car(id,brand, manufacturingYear, color);
    }
}