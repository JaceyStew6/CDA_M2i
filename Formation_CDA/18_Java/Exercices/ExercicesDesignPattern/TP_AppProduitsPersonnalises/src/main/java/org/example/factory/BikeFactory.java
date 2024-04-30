package org.example.factory;

import org.example.entity.AbstractProductBuilder;
import org.example.entity.Bike;

public class BikeFactory extends ProductFactory {

    @Override
    public Bike createProduct(AbstractProductBuilder builder){
        return (Bike) builder.build();
    }
}
