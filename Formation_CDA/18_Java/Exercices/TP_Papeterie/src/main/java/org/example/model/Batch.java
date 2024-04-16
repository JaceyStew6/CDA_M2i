package org.example.model;

public class Batch {

    private Item item;
    private int quantity;
    private double discountPercentage;

    public Batch(Item item, int quantity, double discountPercentage) {
        this.item = item;
        this.quantity = quantity;
        this.discountPercentage = discountPercentage;
    }
}
