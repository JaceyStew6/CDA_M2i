package org.example.model;

public class Pen extends UnitaryItem {

    private String color;

    public Pen(String itemName, double unitaryPrice, String color) {
        super(itemName, unitaryPrice);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                super.toString() +
                ", color='" + color +
                '}';
    }


}
