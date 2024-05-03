package org.example.entity;

public abstract class Product {
    protected String name;
    protected String color;

    protected Product(AbstractProductBuilder builder){
        this.name = builder.name;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
