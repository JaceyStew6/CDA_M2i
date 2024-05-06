package org.example.entity;

public abstract class AbstractCarBuilder {
    protected String modelName;
    protected String color;
    protected String type;
    protected int autonomy;
    protected int scope;
    protected int weight;
    protected int speed;


    public AbstractCarBuilder modelName (String modelName){
        this.modelName = modelName;
        return this;
    }
    public AbstractCarBuilder color (String color){
        this.color = color;
        return this;
    }
    public AbstractCarBuilder type (String type){
        this.type = type;
        return this;
    }
    public AbstractCarBuilder autonomy (int autonomy){
        this.autonomy = autonomy;
        return this;
    }
    public AbstractCarBuilder scope (int scope){
        this.scope = scope;
        return this;
    }
    public AbstractCarBuilder weight (int weight){
        this.weight = weight;
        return this;
    }
    public AbstractCarBuilder speed (int speed){
        this.speed = speed;
        return this;
    }

    public abstract Car build();
}
