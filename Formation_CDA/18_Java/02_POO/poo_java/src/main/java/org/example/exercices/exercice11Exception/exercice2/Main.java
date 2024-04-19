package org.example.exercices.exercice11Exception.exercice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean over = true;
        while (over){
            try {
                System.out.println("Entrez un nombre entier positif : ");
                int nombre = scanner.nextInt();
                if (nombre < 0){
                    throw new IllegalArgumentException("Erreur : Le nombre doit etre positif");
                }
                double racineCaree = Math.sqrt(nombre);
                System.out.println("La racine carrée de "+ nombre + " est : "+ racineCaree);
                over = false;
            }catch (InputMismatchException e){
                System.out.println("Erreur : Entrée non numérique. Veuillez saisir un nombre entier positif !!!!");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }finally {
                scanner.nextLine();
            }
        }
    }
}
