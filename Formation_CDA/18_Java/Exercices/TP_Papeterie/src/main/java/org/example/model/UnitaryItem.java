package org.example.model;

public class UnitaryItem extends Item {

    protected String itemName;
    protected double unitaryPrice;

    public UnitaryItem(String itemName, double unitaryPrice) {
        this.itemName = itemName;
        this.unitaryPrice = unitaryPrice;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", itemName='" + itemName + '\'' +
                ", unitaryPrice=" + unitaryPrice;
    }
}
