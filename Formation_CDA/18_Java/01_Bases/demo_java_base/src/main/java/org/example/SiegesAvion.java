package org.example;

import java.util.Scanner;

public class SiegesAvion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] places = new boolean[3][6];
        int nombresPlacesDispos = 192;
        while(true)  {
            System.out.println("Merci d'indiquer la place que vous souhaitez : ");
            System.out.println("Rangée : ");
            int range = scanner.nextInt();
            System.out.println("Numéro : ");
            int numero = scanner.nextInt();
            if(!places[range-1][numero-1]) {
                nombresPlacesDispos--;
                places[range-1][numero-1] = true;
                System.out.println("Réservation OK");
            }else {
                System.out.println("Place déjà réservée");
            }
            boolean plein = true;
            //Affichage des places
            for(int i=0; i < places.length; i++) {
                String ligne = "";
                for(int j = 0; j < places[i].length; j++) {
                    if(!places[i][j])
                        plein = false;
                    ligne += places[i][j] ? "X" : "_";
                    ligne += (j+1)%3 == 0 ? " ": "";
                }
                System.out.println(ligne);
            }
            if(plein) {
                System.out.println("Avion complet");
                break;
            }
        }

    }
}
