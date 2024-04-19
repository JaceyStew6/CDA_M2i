package org.example.models;

import java.util.Scanner;

public class IHM {

    private static Scanner scanner = new Scanner(System.in);

    public static void start(){
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> firstChoice();
                case 2 -> secondChoice();
                case 3 -> thirdChoice();
                case 4 -> fourthChoice();
                case 5 -> fifthChoice();
                case 6 -> sixthChoice();
                case 0 -> System.out.println("Vous quittez l'interface");
                default -> System.out.println("Choix invalide");
            }

        }while (choice!=0);
    }

    public static void showMenu(){
        System.out.println("#### Menu ####");
        System.out.println("1. Ajouter un client");
        System.out.println("2. Afficher la liste des clients");
        System.out.println("3. Afficher les réservations d'un client");
        System.out.println("4. Ajouter une réservation");
        System.out.println("5. Annuler une réservation");
        System.out.println("6. Afficher la liste des réservations");
    }

    public static void firstChoice(){
        System.out.println("Vous pouvez ajouter un client");
    }
    public static void secondChoice(){
        System.out.println("Voici la liste des clients");
    }
    public static void thirdChoice(){
        System.out.println("Réservations du client");
    }
    public static void fourthChoice(){
        System.out.println("Vous pouvez ajouter une réservation");
    }
    public static void fifthChoice(){
        System.out.println("Vous pouvez annuler une réservation");
    }
    public static void sixthChoice(){
        System.out.println("Voici la liste des réservations");
    }


}
