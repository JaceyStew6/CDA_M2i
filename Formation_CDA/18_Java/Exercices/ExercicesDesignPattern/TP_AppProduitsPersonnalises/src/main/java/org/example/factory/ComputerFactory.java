package org.example.factory;

import org.example.entity.AbstractProductBuilder;
import org.example.entity.Computer;

public class ComputerFactory extends ProductFactory{

    @Override
    public Computer createProduct(AbstractProductBuilder builder){
        return (Computer) builder.build();
    }

}
