package org.example.entity;

public abstract class AbstractProductBuilder {
    protected String name;
    protected String color;

    public AbstractProductBuilder name (String name){
        this.name = name;
        return this;
    }

    public AbstractProductBuilder color (String color){
        this.color = color;
        return this;
    }
    public abstract Product build();

}
