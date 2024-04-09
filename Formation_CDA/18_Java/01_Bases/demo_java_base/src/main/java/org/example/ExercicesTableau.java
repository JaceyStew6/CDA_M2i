package org.example;

import java.util.Scanner;

public class ExercicesTableau {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Exercice 1

        /*String[] tabChaine = {"Bugs", "Ducky", "Titi", "GrosMinet", "Sam"};
        String tunes;
        //Exercice 1
        do {
            System.out.println("Merci d'indiquer le nom d'un Looney Tunes : ");
            tunes = scanner.nextLine();
            int position = -1;
            boolean trouver = false;
            for(int i=0; i < tabChaine.length; i++) {
                if(tabChaine[i].equalsIgnoreCase(tunes)) {
                    trouver = true;
                    position = i;
                    break;
                }
            }
            if(trouver) {
                System.out.println("Le tunes "+ tunes + " est bien dans le tableau à la position : "+ position);
            }else {
                if(!tunes.equalsIgnoreCase("That's all folks"))
                    System.out.println("Pas présent");
            }
        }while(!tunes.equalsIgnoreCase("That's all folks"));*/

        //Exercice 2 => Memory
        String[] tabPair = {"A", "B", "C", "C", "B", "A"};
        int index = 0;
        int indexPremiereSaisi = 0;
        int indexSecondSaisi = 0;
        String[] elementsTrouves = new String[tabPair.length/2];

        do {
            System.out.println("Merci de saisir l'index du premier element entre 0 et 5");
            indexPremiereSaisi = scanner.nextInt();
            if(indexPremiereSaisi >=0 && indexPremiereSaisi < tabPair.length) {
                System.out.println("Carte "+ tabPair[indexPremiereSaisi]);
                System.out.println("Merci de saisir l'index du deuxième element entre 0 et 5");
                indexSecondSaisi = scanner.nextInt();
                if(indexSecondSaisi != indexPremiereSaisi && (indexSecondSaisi >=0 && indexSecondSaisi < tabPair.length)) {
                    System.out.println("Carte "+ tabPair[indexSecondSaisi]);
                    if(tabPair[indexPremiereSaisi].equals(tabPair[indexSecondSaisi])) {
                        boolean exists = false;
                        for(String carte : elementsTrouves) {
                            if(carte != null && carte.equals(tabPair[indexPremiereSaisi])) {
                                exists = true;
                                break;
                            }
                        }
                        if(exists) {
                            System.out.println("Carte déjà trouvée");
                        }else {
                            elementsTrouves[index++] = tabPair[indexPremiereSaisi];
                            System.out.println("Carte trouvée !!!");
                        }
                    }
                }
            }else {
                System.out.println("Out of range index 1");
            }
        }while (index < elementsTrouves.length);

        System.out.println("Bravo !!!!");

    }
}
