package org.example.model;

public class PaperReam extends UnitaryItem{

    private double grams;

    public PaperReam(String itemName, double unitaryPrice, double grams) {
        super(itemName, unitaryPrice);
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "PaperReam{" +
                super.toString() +
                ", grams='" + grams +
                '}';
    }


}
