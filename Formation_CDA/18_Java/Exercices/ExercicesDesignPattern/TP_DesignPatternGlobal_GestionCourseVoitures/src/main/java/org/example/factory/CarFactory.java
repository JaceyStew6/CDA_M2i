package org.example.factory;

import org.example.entity.AbstractCarBuilder;
import org.example.entity.Car;

public abstract class CarFactory {
    public abstract Car createCar(AbstractCarBuilder builder);
}
