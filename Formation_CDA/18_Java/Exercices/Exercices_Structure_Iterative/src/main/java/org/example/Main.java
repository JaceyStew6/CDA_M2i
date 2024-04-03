package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Exercice 1: Devine le nombre

        int min = 1;
        int max = 100;

        int range = (max - min) + 1;
        int random = (int) (range * Math.random()) + min;


        //System.out.println(random);
        System.out.println("Devinez le nombre aléatoire");
        int response = scanner.nextInt();
        do {
            if (response < random) {
                System.out.println("Le nombre cherché est supérieur");
                response = scanner.nextInt();
            } else if (response > random) {
                System.out.println("Le nombre cherché est inférieur");
                response = scanner.nextInt();
            }
            ;
        } while (response != random);

        System.out.println("Bravo, le nombre est bien " + random);


        //Exercice 2 : La Machine à compter

        System.out.println("Saisissez un premier nombre");
        int num1 = scanner.nextInt();

        System.out.println("Saisissez un second nombre");
        int num2 = scanner.nextInt();

        int pas = (num1 < num2) ? 1 : -1;

        do {
            System.out.println(num1);
            num1 += pas;
        } while (num1 != num2);


        //Exercice 3: Le Parcours d'obstacles


        //INACHEVE

        /*String choice = scanner.nextLine();
        String response = null;

        for (int i = 1; i < 3; i++) {

            while (response.equals(false)) {
                if (choice != response) {

                }

            }
        }*/


        //Exercice 4: Le Générateur de motifs

        System.out.println("Saisissez un motif (par exemple: *.+)");
        char chosenFont = scanner.next().charAt(0);

        System.out.println("Saisissez le nombre de lignes");
        int linesNumber = scanner.nextInt();

        for (int rows=1; rows <= linesNumber; rows++){
            for (int columns=1; columns<=rows; columns++){
                System.out.print(chosenFont + " ");
            }
            System.out.println();
        }

    }
}