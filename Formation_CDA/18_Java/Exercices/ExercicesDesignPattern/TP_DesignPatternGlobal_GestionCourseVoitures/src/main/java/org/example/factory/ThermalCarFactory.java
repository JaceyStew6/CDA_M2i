package org.example.factory;

import org.example.entity.AbstractCarBuilder;
import org.example.entity.ThermalCar;

public class ThermalCarFactory extends CarFactory {

    @Override
    public ThermalCar createCar(AbstractCarBuilder builder){
        return (ThermalCar) builder.build();
    }
}
