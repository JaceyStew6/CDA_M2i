package org.example;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Création d'une variable
        int age;
        age = 36;
        System.out.println(age);

        boolean test = true;
        System.out.println(test);
        float prix = 10.99F;
        System.out.println(prix);
        double solde = 100_000.97;
        System.out.println(solde);
        char  c = 'c';
        long big_number = 1000000000000000000L;
        System.out.println(c);
        var firstname = "ihab";
        System.out.println(firstname.toUpperCase());

        //Lire à partir de l'écran => JSE => Scanner
        Scanner scanner = new Scanner(System.in);

        String saisi = scanner.nextLine();
        System.out.println(saisi);
        int saisiInt = scanner.nextInt();
        System.out.println(saisiInt);
        float saisiFloat = scanner.nextFloat();
        System.out.println(saisiFloat);
    }
}