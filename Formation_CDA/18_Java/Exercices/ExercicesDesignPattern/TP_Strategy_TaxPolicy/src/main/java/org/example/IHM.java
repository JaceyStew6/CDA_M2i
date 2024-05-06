package org.example;

import java.util.Scanner;

public class IHM {
    private static Scanner scanner = new Scanner(System.in);

    public static void start(){
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> firstChoice();
                case 2 -> secondChoice();
                case 3 -> thirdChoice();
                case 0 -> System.out.println("Vous quittez la simulation !!!");
                default -> System.out.println("Choix invalide !!!!");
            }
        }while (choice != 0);
    }

    public static void showMenu(){
        System.out.println("========================================");
        System.out.println("SELECTION DE LA STRATEGIE FISCALE ET SIMULATION");
        System.out.println("========================================");
        System.out.println("##### Choisissez une stratégie fiscale pour la simulation #######");
        System.out.println("1) Impôt sur le revenu");
        System.out.println("2) TVA (Taxe sur la valeur ajoutée)");
        System.out.println("3) Impôt forfaitaire");
        System.out.println("0) Quitter");
        System.out.println("Faite votre choix : ");
    }

    public static void firstChoice(){
        System.out.println("Vous avez choisi la stratégie de l'impôt sur le revenu");
        System.out.println("Le taux appliqué est de 11%");
        System.out.println("Entrez le montant des revenus annuels imposables");
        double income = scanner.nextInt();
        scanner.nextLine();
        Tax t = Tax.builder().income(income).build();
        t.calculateTax(new IncomeTaxStrategy());
    }

    public static void secondChoice(){
        System.out.println("Vous avez choisi la stratégie de la TVA");
        System.out.println("Le taux appliqué est de 5.5%");
        System.out.println("Entrez le montant des revenus");
        double income = scanner.nextInt();
        scanner.nextLine();
        Tax t = Tax.builder().income(income).build();
        t.calculateTax(new VatStrategy());
    }

    public static void thirdChoice() {
        System.out.println("Vous avez choisi la stratégie de l'impôt forfaitaire");
        System.out.println("Le taux appliqué est de 3%");
        System.out.println("Entrez le montant des revenus");
        double income = scanner.nextInt();
        scanner.nextLine();
        Tax t = Tax.builder().income(income).build();
        t.calculateTax(new FlatRateTaxStrategy());
    }
}
