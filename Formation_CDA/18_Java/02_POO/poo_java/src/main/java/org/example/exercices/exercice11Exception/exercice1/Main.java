package org.example.exercices.exercice11Exception.exercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chaine;
        Scanner scanner = new Scanner(System.in);
        boolean over = true;

        while (over){
            System.out.println("Saisir un entier : ");
            chaine = scanner.nextLine();
            try{
                int entier = convertirEnEntier(chaine);
                System.out.println("Entier converti : "+ entier);
               over = false;
            }catch (NumberFormatException e){
               System.out.println("Erreur : Conversion impossible");
            }

        }

    }

    public static int convertirEnEntier(String chaine){
        return Integer.parseInt(chaine);
    }


}
