package org.example;

public class FlatRateTaxStrategy implements TaxStrategy{
    @Override
    public void calculateTax(double income) {
        double flatRateTaxValue;
        double flatRateTaxPercentage = 3;
        flatRateTaxValue = (income * flatRateTaxPercentage) / 100;

        System.out.println("========================================");
        System.out.println("RESULTATS DE LA SIMULATION");
        System.out.println("========================================");
        System.out.println(
                "--- Impôt forfaitaire --- \n" +
                "Revenu: " + income + " €" +
                "\nTaux d'imposition': " + flatRateTaxPercentage + " %" +
                "\nRecettes fiscales: " + flatRateTaxValue + " €"
        );
    }
}
