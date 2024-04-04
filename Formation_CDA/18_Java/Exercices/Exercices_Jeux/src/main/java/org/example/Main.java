package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Le jeu de Pierre-Papier-Ciseaux
        /*Objectif : Jouer contre l'ordinateur à Pierre-Papier-Ciseaux.
        Fonctionnement : L’utilisateur et l’ordinateur choisissent chacun pierre, papier, ou ciseaux. Le programme détermine ensuite le gagnant selon les règles classiques du jeu.*/


        /*int min = 1;
        int max = 3;
        int range = (max - min) + 1;
        int random = (int) (range * Math.random()) + min;
        String computersChoice = "";


        if (random == 1){
            computersChoice = "Pierre";
        }else if (random == 2){
            computersChoice = "Papier";
        }else if (random == 3) {
            computersChoice = "Ciseaux";
        }

        System.out.println("Bienvenue dans Pierre-Papier-Ciseaux! Jouez contre l'ordinateur");
        System.out.println("Faites votre choix: \n" +
                "1. Pierre \n" +
                "2. Papier \n" +
                "3. Ciseaux");

        int usersChoice = scanner.nextInt();

        switch (usersChoice){
            case 1:
                System.out.println("Vous avez choisi la Pierre");
                if (computersChoice.equals("Pierre")){
                    System.out.println("Pierre // " + computersChoice );
                    System.out.println("MATCH NUL!!");
                } else if (computersChoice.equals("Papier")) {
                    System.out.println("Pierre // " + computersChoice );
                    System.out.println("Le papier englobe la pierre");
                    System.out.println("PERDU!!");
                } else if (computersChoice.equals("Ciseaux")) {
                    System.out.println("Pierre // " + computersChoice );
                    System.out.println("La pierre écrase les ciseaux");
                    System.out.println("GAGNE!!");
                }
                break;
            case 2:
                System.out.println("Vous avez choisi le Papier");
                if (computersChoice.equals("Pierre")){
                    System.out.println("Papier // " + computersChoice );
                    System.out.println("Le papier englobe la pierre");
                    System.out.println("GAGNE!!");
                } else if (computersChoice.equals("Papier")) {
                    System.out.println("Papier // " + computersChoice );
                    System.out.println("MATCH NUL!!");
                } else if (computersChoice.equals("Ciseaux")) {
                    System.out.println("Papier // " + computersChoice );
                    System.out.println("Les ciseaux coupent le papier");
                    System.out.println("PERDU!!");
                }
                break;
            case 3:
                System.out.println("Vous avez choisi les Ciseaux");
                if (computersChoice.equals("Pierre")){
                    System.out.println("Ciseaux // " + computersChoice );
                    System.out.println("La pierre écrase les ciseaux");
                    System.out.println("PERDU!!");
                } else if (computersChoice.equals("Papier")) {
                    System.out.println("Ciseaux // " + computersChoice );
                    System.out.println("Les ciseaux coupent le papier");
                    System.out.println("GAGNE!!");
                } else if (computersChoice.equals("Ciseaux")) {
                    System.out.println("Ciseaux // " + computersChoice );
                    System.out.println("MATCH NUL!!");
                }
                break;
        }*/


        // 2. Le jeu du pendu simplifié

        /*Objectif : Deviner un mot lettre par lettre.
        Fonctionnement : Le jeu choisit un mot. L’utilisateur tente de deviner les lettres du mot une par une. Le jeu se termine si l’utilisateur trouve toutes les lettres du mot ou si un certain nombre d’essais est dépassé*/










        // 3. Course de voitures simplifiée
        /*Objectif : Atteindre l'arrivée avant l'ordinateur en avançant basé sur les résultats d'un dé.
        Fonctionnement : Chaque tour, l’utilisateur et l’ordinateur "lancent un dé" (génèrent un nombre aléatoire entre 1 et 6). Le nombre indique combien de cases ils avancent. Le premier à atteindre une certaine distance gagne*/


        int distance = 50;

        int minDiceValue = 1;
        int maxDiceValue = 6;
        int diceRange = (maxDiceValue - minDiceValue) + 1;
        int userResult = 0;
        int computerResult= 0;

        while (userResult < 50 && computerResult < 50){
            System.out.println("ORDINATEUR");
            System.out.println("L'ordinateur lance son dé ...");
            int computerDice = (int) (diceRange * Math.random()) + minDiceValue;
            System.out.println("L'ordinateur avance de " + computerDice + " cases");
            computerResult += computerDice;
            System.out.println("Distance restante: " + (distance - computerResult));
            System.out.println("----");

            if (computerResult >= 50) {
                System.out.println("L'ORDINATEUR GAGNE! VOUS AVEZ PERDU!");
                break;
            }

            System.out.println("JOUEUR");
            System.out.println("Vous lancez votre dé ...");
            int userDice = (int) (diceRange * Math.random()) + minDiceValue;
            System.out.println("Vous avancez de " + userDice + " cases");
            userResult += userDice;
            System.out.println("Distance restante: " + (distance - userResult));
            System.out.println("----");

            if (userResult >= 50){
                System.out.println("VOUS AVEZ GAGNE!!");
                break;
            }
        }


        // 4. L'évasion du labyrinthe
            //Objectif : Trouver la sortie d'un labyrinthe simple représenté par du texte.
            /*Fonctionnement : Le labyrinthe est représenté par un ensemble de directions possibles à chaque étape (par exemple, gauche, droite, avancer).
             À chaque étape, l’utilisateur choisit une direction. Le jeu se termine lorsque l’utilisateur trouve la sortie. Bien que cela puisse sembler
             nécessiter un tableau, un labyrinthe simple peut être codé dans la logique du programme sans utiliser explicitement de tableau.*/


        





    }
}