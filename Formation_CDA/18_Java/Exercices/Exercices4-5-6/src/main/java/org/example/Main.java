package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Exercice 4 :  Choisissez votre propre aventure

        System.out.println("Vous arrivez à Altabianca, une ville d'une richesse démesurée, séparée en quatre quartiers: \n"
        + "un quartier marchand ou se trouve un grand marché proposant des produits provenants du monde entier, \n"
        + "un quatier résidentiel où toutes les villas rivalisent les unes avec les autres, \n"
        + "le quartier royal avec un immense palais somptueux dominant toute la ville au sommet d'une falaise \n"
        + "et un quartier en apparence plus populaire et portuaire où s'affairent des centaines de marins! \n"
        + " Ou allez vous?");

        System.out.println("1: quartier marchand \n" +
                "2: quartier résidentiel \n" +
                "3: quartier royal \n" +
                "4: quartier populaire");

        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("En vous enfonçant dans les allées du marché, vous voyez soudainement le reflet de l'objet de votre destinée. \n"
                + "La dague familiale autrefois perdue apparait devant vous, tronant fièrement sur un coussin de soie");
                break;
            case 2:
                System.out.println("Des villas plus somptueuses les unes que les autres défilent sous vos yeux à mesure que vous avancez. \n"
                + "Au loin, devant une villa d'un blanc immaculé se tient une personne que vous reconnaissez parfaitement: votre petite soeur que vous pensiez morte!");
                break;
            case 3:
                System.out.println("Vous vous avancez jusqu'à l'entrée du palais. Deux gardes en apparence féroce se tiennent prêts à stopper le moindre intrus \n"
                + "Vous tentez de leur passer devant et ils vous chassent avec un coup de pied bien senti en guise d'avertissement");
                break;
            case 4:
                System.out.println("En direction du phare, vous vous faites bousculer par les pêcheurs qui s'affairent \n"
                + "L'un d'eux laisse soudainement échapper une caisse remplie de poissons, qui vous tombent dessus et vous attaquent avec la ferveur de poissons, tout sauf morts.");
                break;
            default:
                System.out.println("Vous ne faites rien");
                break;
        }


        //Exercice 5 : Le Devineur d'animaux

        System.out.println("Est-ce que l'animal auquel vous pensez vit dans l'eau ? Répondez par oui ou non.");
            String response = scanner.nextLine();

            if( response.equals("oui")){
                System.out.println("Est-ce qu'il est féroce?");
                response = scanner.nextLine();
                if (response.equals("oui")){
                    System.out.println("C'est un requin");
                }else if(response.equals("non")){
                    System.out.println("C'est une baleine");
                }
            } else if (response.equals("non")) {
                System.out.println("Est-ce qu'il est affectueux?");
                response = scanner.nextLine();
                if (response.equals("oui")){
                    System.out.println("C'est un chien");
                } else if (response.equals("non")){
                    System.out.println("C'est un chat");
                }
        }


        //Exercice 6: Le Choix du super-héros

        System.out.println("Choisissez et obtenez un super-heros en fonction de : \n"
        + "1: sa force \n"
        + "2: son intelligence \n"
        + "3: sa vitesse");

        int choiceHero = scanner.nextInt();

        switch(choiceHero){
            case 1:
                System.out.println("FORCE!! \n"
                        + "Carole Danvers aka Captain Marvel dispose d'une force surhumaine grâce à l'énergie du Tesseract, lui permettant de déplacer des vaisseaux spaciaux à mains nues");
                break;
            case 2:
                System.out.println("INTELLIGENCE!! \n" +
                        "Black Widow dispose d'une intelligence stratégique. C'est une espionne hors pair");
                break;
            case 3:
                System.out.println("VITESSE!! \n" +
                        "Barry Allen aka The Flash est tout simplement l'Homme le plus rapide sur Terre.");
                break;

            default:
                System.out.println("Erreur");
                break;
        }


        //Exercice 7: Le Générateur de journée


        System.out.println("Décrivez votre humeur du jour. Par exemple: joyeux, triste, aventurier");

        String choiceMood = scanner.nextLine().toLowerCase();

        switch(choiceMood){
            case "joyeux":
                System.out.println("Sortez prendre un verre avec des amis");
                break;
            case "triste":
                System.out.println("Faites une activité qui vous plait et relaxez vous");
                break;
            case "aventurier":
                System.out.println("Partez faire une petite randonnée en pleine nature");
                break;

            default:
                System.out.println("Ne faites rien");
                break;
        }

    }
}