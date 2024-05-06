package org.example.factory;

import org.example.entity.AbstractCarBuilder;
import org.example.entity.ElectricCar;

public class ElectricCarFactory extends CarFactory{

    @Override
    public ElectricCar createCar(AbstractCarBuilder builder) {
        return (ElectricCar) builder.build();
    }
}
