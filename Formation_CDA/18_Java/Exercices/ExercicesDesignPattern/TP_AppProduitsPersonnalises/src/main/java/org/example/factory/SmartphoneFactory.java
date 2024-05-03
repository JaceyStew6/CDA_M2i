package org.example.factory;

import org.example.entity.AbstractProductBuilder;
import org.example.entity.Smartphone;

public class SmartphoneFactory extends ProductFactory {
    @Override
    public Smartphone createProduct(AbstractProductBuilder builder){
        return (Smartphone) builder.build();
    }
}
