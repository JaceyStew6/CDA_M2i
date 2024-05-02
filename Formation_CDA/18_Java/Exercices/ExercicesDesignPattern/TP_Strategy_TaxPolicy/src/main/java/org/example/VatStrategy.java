package org.example;

public class VatStrategy implements TaxStrategy {
    @Override
    public void calculateTax(double income) {
        double vatValue;
        double vatPercentage = 5.5;
        vatValue = (income * vatPercentage) / 100;

        System.out.println("========================================");
        System.out.println("RESULTATS DE LA SIMULATION");
        System.out.println("========================================");
        System.out.println(
                "--- TVA --- \n" +
                "Revenu: " + income + " €" +
                "\nTaux de TVA: " + vatPercentage + " %" +
                "\nRecettes fiscales: " + vatValue + " €"
        );
    }
}
