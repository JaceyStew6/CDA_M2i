package org.example;

import org.example.entity.Bike;
import org.example.entity.Computer;
import org.example.entity.Product;
import org.example.entity.Smartphone;
import org.example.factory.BikeFactory;
import org.example.factory.ComputerFactory;
import org.example.factory.SmartphoneFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IHM {
    private static Scanner scanner = new Scanner(System.in);
//    private List <Product> products = new ArrayList<Product>();

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
                case 0 -> System.out.println("Au revoir !!!");
                default -> System.out.println("Choix invalide !!!!");
            }
        }while (choice != 0);
    }

    public static void showMenu(){
        System.out.println("##### Quel produit souhaitez-vous personnaliser? #######");
        System.out.println("1) Ordinateur");
        System.out.println("2) Vélo");
        System.out.println("3) Smartphone");
        System.out.println("0) Quitter");
        System.out.println("Faite votre choix : ");
    }

    public static void firstChoice(){
        System.out.println("Vous avez choisi de personnaliser un ordinateur");
        System.out.println("Quel modèle souhaitez vous personnaliser? (Asus/ Acer/ Dell)");
        String model = scanner.nextLine();
        System.out.println("Quelle couleur?");
        String color = scanner.nextLine();
        System.out.println("Quel type de stockage (SSD/HDD)?");
        String storage = scanner.nextLine();
        System.out.println("Quelle RAM (8Go/16Go/32Go/64Go)?");
        int ram = scanner.nextInt();
        scanner.nextLine();
        Product computer = new ComputerFactory().createProduct(new Computer.ComputerBuilder().storageType(storage).ram(ram).name(model).color(color));
        System.out.println(computer);
    }

    public static void secondChoice(){
        System.out.println("Vous avez choisi de personnaliser un vélo");
        System.out.println("Quel modèle souhaitez vous personnaliser? (Van Rysel/ Rockrider)");
        String model = scanner.nextLine();
        System.out.println("Quelle couleur?");
        String color = scanner.nextLine();
        System.out.println("Quel type (VTT/ VTC/ Route)?");
        String type = scanner.nextLine();
        System.out.println("Quelle taille (1/2/3/4)?");
        int size = scanner.nextInt();
        scanner.nextLine();
        Product bike = new BikeFactory().createProduct(new Bike.BikeBuilder().size(size).type(type).name(model).color(color));
        System.out.println(bike);
    }

    public static void thirdChoice(){
        System.out.println("Vous avez choisi de personnaliser un smartphone");
        System.out.println("Quel modèle souhaitez vous personnaliser? (Samsung/Apple)");
        String model = scanner.nextLine();
        System.out.println("Quelle couleur?");
        String color = scanner.nextLine();
        System.out.println("Quelle taille d'écran (5/6/7 pouces)?");
        int size = scanner.nextInt();
        scanner.nextLine();
        Product smartphone = new SmartphoneFactory().createProduct(new Smartphone.SmartphoneBuilder().size(size).name(model).color(color));
        System.out.println(smartphone);
    }
}
