package org.example.correction.correction_strategy2;

import org.example.correction.correction_strategy2.strategy.FlatTaxStrategy;
import org.example.correction.correction_strategy2.strategy.ProgessiveTaxStrategy;
import org.example.correction.correction_strategy2.strategy.VATStrategy;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    static TaxCalculator taxCalculator = new TaxCalculator();
    public static void main(String[] args) {

        displayHeader();
        System.out.println("Entrer le montant : ");
        double income = scanner.nextDouble();
        scanner.nextLine();
        String choix;

        do {
            displayMenu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    actionTaxStrategy(income);
                case "0":
                    break;
            }
        }while (!choix.equals("0"));

    }

    private static void displayHeader() {
        System.out.println("========================================================\n" +
                "     SIMULATEUR DE POLITIQUE FISCALE - MENU PRINCIPAL\n" +
                "========================================================");
    }

    private static void displayMenu() {
        System.out.println("Veuillez choisir une option :\n" +
                "1. Sélectionner la stratégie fiscale et lancer la simulation\n" +
                "0. Quitter\n" +
                "\n" +
                "Votre choix: ");
    }

    private static void displayMenuStrategy() {
        System.out.println("Choisissez une stratégie fiscale pour la simulation :\n" +
                "1. Impôt progressif sur le revenu\n" +
                "2. TVA (Taxe sur la valeur ajoutée)\n" +
                "3. Impôt forfaitaire\n" +
                "\n" +
                "Votre choix: ");
    }


    private static void actionTaxStrategy(double income) {
        String choix;
        do {
            displayMenuStrategy();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    taxCalculator.setTaxStrategy(new ProgessiveTaxStrategy());
                    System.out.println(taxCalculator.calculateTax(income));
                    break;
                case "2":
                    System.out.println("Taux tva");
                    double rate = scanner.nextDouble();
                    scanner.nextLine();
                    taxCalculator.setTaxStrategy(new VATStrategy(rate));
                    System.out.println(taxCalculator.calculateTax(income));
                    break;
                case "3":
                    taxCalculator.setTaxStrategy(new FlatTaxStrategy());
                    System.out.println(taxCalculator.calculateTax(income));
                    break;
                case "0":
                    break;
            }
        }while (!choix.equals("0"));

    }
}
