package org.example;

public class IncomeTaxStrategy implements TaxStrategy {
    @Override
    public void calculateTax(double income) {
        double incomeTaxValue;
        double incomeTaxPercentage = 11;
        incomeTaxValue = (income * incomeTaxPercentage) / 100;

        System.out.println("========================================");
        System.out.println("RESULTATS DE LA SIMULATION");
        System.out.println("========================================");
        System.out.println(
                "--- Impôt sur le revenu --- \n" +
                "Revenu: " + income + " €" +
                "\nTaux d'imposition: " + incomeTaxPercentage + " %" +
                "\nRecettes fiscales: " + incomeTaxValue + " €"
        );
    }
}
