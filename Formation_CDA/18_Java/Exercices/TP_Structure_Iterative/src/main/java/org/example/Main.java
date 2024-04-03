package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TP: Le festival de musique virtuel

        int userEnergy = 10;
        int userTime = 6;

        System.out.println("Bienvenue au festival de musique virtuel!");
        do {
            System.out.println("Temps: " + userTime + " heures \n" +
                    "Energie: " + userEnergy + " points");
            System.out.println("Vous pouvez choisir parmi les différentes scènes suivantes: \n" +
                    "1. Pop \n" +
                    "2. Rock \n" +
                    "3. Country");

            int userChoice = scanner.nextInt();

            switch(userChoice){
                case 1:
                    System.out.println("POP");
                    System.out.println("11. Taylor Swift - 1h - 3pe");
                    System.out.println("12. Avril Lavigne - 1h - 2pe");
                    userChoice = scanner.nextInt();
                    switch (userChoice){
                        case 11:
                            if (userTime>=1 && userEnergy>=3){
                                System.out.println("Taylor Swift");
                                userEnergy -= 3;
                                userTime -= 1;
                            }else{
                                if(userTime<1){
                                    System.out.println("Vous n'avez plus suffisamment de temps pour assister à ce concert");
                                } else if (userEnergy<3) {
                                    System.out.println("Vous n'avez plus suffisamment d'énergie pour assister à ce concert");
                                }
                                break;
                            }
                            break;
                        case 12:
                            if (userTime>=1 && userEnergy>=2){
                                System.out.println("Avril Lavigne");
                                userEnergy -= 2;
                                userTime -= 1;
                            }else{
                                if(userTime<1){
                                    System.out.println("Vous n'avez plus suffisamment de temps pour assister à ce concert");
                                } else if (userEnergy<2) {
                                    System.out.println("Vous n'avez plus suffisamment d'énergie pour assister à ce concert");
                                }
                                break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("ROCK");
                    System.out.println("21. The Pretty Reckless - 1h - 5pe");
                    System.out.println("22. Linkin Park - 2h - 4pe");
                    userChoice = scanner.nextInt();
                    switch (userChoice){
                        case 21:
                            if (userTime>=1 && userEnergy>=5){
                                System.out.println("The Pretty Reckless");
                                userEnergy -= 5;
                                userTime -= 1;
                            }else{
                                if(userTime<1){
                                    System.out.println("Vous n'avez plus suffisamment de temps pour assister à ce concert");
                                } else if (userEnergy<5) {
                                    System.out.println("Vous n'avez plus suffisamment d'énergie pour assister à ce concert");
                                }
                                break;
                            }
                            break;
                        case 22:
                            if (userTime>=2 && userEnergy>=4){
                                System.out.println("Linkin Park");
                                userEnergy -= 4;
                                userTime -= 2;
                            }else{
                                if(userTime<2){
                                    System.out.println("Vous n'avez plus suffisamment de temps pour assister à ce concert");
                                } else if (userEnergy<4) {
                                    System.out.println("Vous n'avez plus suffisamment d'énergie pour assister à ce concert");
                                }
                                break;
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("COUNTRY");
                    System.out.println("31. The Dixie Chicks - 1h - 2pe");
                    System.out.println("32. Maddie & Tae - 2h - 3pe");
                    userChoice = scanner.nextInt();
                    switch (userChoice){
                        case 31:
                            if (userTime>=1 && userEnergy>=2){
                                System.out.println("The Dixie Chicks");
                                userEnergy -= 2;
                                userTime -= 1;
                            }else{
                                if(userTime<1){
                                    System.out.println("Vous n'avez plus suffisamment de temps pour assister à ce concert");
                                } else if (userEnergy<2) {
                                    System.out.println("Vous n'avez plus suffisamment d'énergie pour assister à ce concert");
                                }
                                break;
                            }
                            break;
                        case 32:
                            if (userTime>=2 && userEnergy>=3){
                                System.out.println("Maddie & Tae");
                                userEnergy -= 3;
                                userTime -= 2;
                            }else{
                                if(userTime<2){
                                    System.out.println("Vous n'avez plus suffisamment de temps pour assister à ce concert");
                                } else if (userEnergy<3) {
                                    System.out.println("Vous n'avez plus suffisamment d'énergie pour assister à ce concert");
                                }
                                break;
                            }
                            break;
                    }
                    break;
            }
            if (userEnergy == 0) {
                System.out.println("Vous avez épuisé votre énergie! \n" +
                        "Merci d'avoir participé! Au revoir et à bientôt");
            } else if (userTime == 0) {
                System.out.println("Vous n'avez plus de temps \n" +
                        "Merci d'avoir participé! Au revoir et à bientôt");
            }
        }while(userEnergy>=1 && userTime>=1);
    }
}