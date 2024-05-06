package org.example.entity;

public abstract class Car {
    protected String modelName;
    protected String color;
    protected String type;
    protected int autonomy;
    protected int scope;
    protected int weight;
    protected int speed;

    protected Car(AbstractCarBuilder builder) {
        this.modelName = builder.modelName;
        this.color = builder.color;
        this.type = builder.type;
        this.autonomy = builder.autonomy;
        this.scope = builder.scope;
        this.weight = builder.weight;
        this.speed = builder.speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", autonomy=" + autonomy +
                ", scope=" + scope +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
