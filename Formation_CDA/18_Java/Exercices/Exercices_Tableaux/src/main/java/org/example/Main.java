package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Recherche de Valeur
        /*Créez un tableau pré-rempli de nombres ou de chaînes. L'utilisateur tente de deviner une valeur contenue dans le tableau.
        Le programme indique si la valeur est présente et, si oui, à quelle position.*/


        /*int[] tabNumbers = {1, 5, 9, 6, 12, 15, 17, 20};
        System.out.println("Devinez si une valeur est présente dans le tableau. Celle-ci est comprise entre 0 et 20.");
        int userInput = scanner.nextInt();

        for (int i = 0; i < tabNumbers.length; i++) {
            if (tabNumbers[i] == userInput) {
                System.out.println("La valeur est présente");
                System.out.println("Position: " + i);
                break;
            } else if (i + 1 == tabNumbers.length && tabNumbers[i] != userInput) {
                System.out.println("Perdu");
            }
        }*/



        // 2. Jeu des Paires (Memory)
        /*Implémentez un jeu de mémoire simple où l'utilisateur doit trouver des paires de valeurs identiques dans un tableau.
        Le tableau est affiché face cachée, et l'utilisateur spécifie les indices des éléments à retourner pour trouver les paires.*/

        /*int[] tabPair = {2, 10, 6, 6,  10, 12, 2, 12};

        System.out.println("Choisissez une position entre 1 et 8");
        int userFirstChoice = scanner.nextInt();

        System.out.println(tabPair[userFirstChoice-1]);

        System.out.println("Choisissez une seconde position entre 1 et 8, différente de la première");
        int userSecondChoice = scanner.nextInt();
        if (userFirstChoice == userSecondChoice){
            while (userFirstChoice == userSecondChoice){
                System.out.println("Veuillez saisir une valeur différente");
                userSecondChoice = scanner.nextInt();
            }
            System.out.println(tabPair[userSecondChoice-1]);
        } else {
            System.out.println(tabPair[userSecondChoice-1]);
        }

        if  (tabPair[userFirstChoice-1] == tabPair[userSecondChoice-1]){
            System.out.println("Vous avez trouvé une paire");
        } else {
            System.out.println("Perdu");
        }*/



        /*System.out.println("Choisissez une position entre 1 et 8");
        int userFirstChoice = scanner.nextInt();

        System.out.println(tabPair[userFirstChoice-1]);

        System.out.println("Choisissez une seconde position entre 1 et 8, différente de la première");
        int userSecondChoice = scanner.nextInt();

        for (int i = 0; i<tabPair.length/2; i++){
            while (tabPair[userFirstChoice-1] != tabPair[userSecondChoice-1]){
                if (userFirstChoice == userSecondChoice){
                    while (userFirstChoice == userSecondChoice){
                        System.out.println("Veuillez saisir une valeur différente");
                        userSecondChoice = scanner.nextInt();
                    }
                    System.out.println(tabPair[userSecondChoice-1]);
                } else {
                    System.out.println(tabPair[userSecondChoice-1]);
                }

                if  (tabPair[userFirstChoice-1] == tabPair[userSecondChoice-1]){
                    System.out.println("Vous avez trouvé une paire");
                } else {
                    System.out.println("Perdu");
                }
            }
        }*/



        // 3.Simulation de Réservation de Sièges
        /*Simulez un système de réservation de sièges dans un théâtre ou un avion. Les sièges disponibles sont représentés
        dans un tableau. L'utilisateur peut choisir un siège, et le programme met à jour le tableau pour indiquer que le siège est désormais pris.*/


        /*int sits = 10;
        Boolean[] bookingTheaterSitTab = new Boolean[sits];
        int availableSits = sits;

        for(int i=0; i < sits; i++) {
            bookingTheaterSitTab[i] = false;
            System.out.println(bookingTheaterSitTab[i]);
        };

        do {
            System.out.println("Il reste " + availableSits + " places disponibles");
            System.out.println("Quelle place voulez-vous réserver? (entre 1 et 10)");
            int usersChoice = scanner.nextInt()-1;
            int bookedSit = usersChoice + 1;
            for (int i=0; i<bookingTheaterSitTab.length; i++){
                if(bookingTheaterSitTab[usersChoice] == true){
                    while (bookingTheaterSitTab[usersChoice] == true){
                        System.out.println("Cette place n'est pas disponible! Veuillez réserver une autre place!");
                        usersChoice = scanner.nextInt();
                    }
                } else if (bookingTheaterSitTab[usersChoice] == false) {
                    System.out.println("Merci pour votre réservation de la place " + bookedSit);
                    bookingTheaterSitTab[usersChoice] = true;
                    availableSits--;
                    break;
                }
            }
        }while(availableSits>0);*/


        // 4. Gestion d'un Inventaire
        /*Créez un programme qui simule la gestion d'un inventaire d'articles. Les articles et leurs quantités sont stockés dans un tableau. L'utilisateur peut ajouter, retirer ou consulter des articles.*/






        // 5. Bataille navale
        /*Jouer une version simplifiée du jeu de bataille navale.
        Concepts utilisés : Tableaux pour représenter la grille, boucles, conditions.
        Fonctionnement : Utilise un tableau pour créer une grille où l'utilisateur et l'ordinateur placent leurs navires.
        Ensuite, à tour de rôle, ils essaient de deviner la position des navires adverses. Le premier à couler tous les navires adverses gagne.*/


//        String[][] tabUser1 = {{"1","2","3","4","5","6"}, {"A", "B", "C","D","E","F"}};
//        String[][] tabUser2 = {{"1","2","3","4","5","6"}, {"A", "B", "C","D","E","F"}};

        int linesNumber = 6;
        int columnsNumber = 6;
        boolean[][] tabUser = new boolean[linesNumber][columnsNumber];
        boolean[][] tabComputer = new boolean[linesNumber][columnsNumber];
        boolean userSmallBoat = true;
        boolean userMediumBoat = true;
        boolean computerSmallBoat = true;
        boolean computerMediumBoat = true;

        for(int i=0; i < linesNumber; i++) {
            for(int j=0; j < columnsNumber; j++) {
                tabUser[i][j] = false;
                tabComputer[i][j] = false;
            };
        };

        //User
        // Bateau 1 : Ligne 1 - colonnes 1 et 2
        tabUser[0][0] = true;
        tabUser[0][1] = true;

        // Bateau 2 : Lignes 2-3-4 - colonne 4
        tabUser[1][3] = true;
        tabUser[2][3] = true;
        tabUser[3][3] = true;

        //Computer
        // Bateau 1 : Ligne 2 - colonnes 1 et 2
        tabComputer[1][0] = true;
        tabComputer[1][1] = true;

        // Bateau 2 : Lignes 2-3-4 - colonne 6
        tabComputer[1][5] = true;
        tabComputer[2][5] = true;
        tabComputer[3][5] = true;


        do {
            System.out.println("Ligne: ");
            int userLineChoice = scanner.nextInt();
            System.out.println("Colonne: ");
            int userColumnChoice = scanner.nextInt();

            for(int i=0; i < userLineChoice; i++) {
                for(int j=0; j < userColumnChoice; j++) {

                    if (tabComputer[userLineChoice][userColumnChoice] == true) {
                        System.out.println("Touché");
                        tabComputer[userLineChoice][userColumnChoice] = false;
                        if (tabComputer[1][0] == true || tabComputer[1][1] == true){
                            computerSmallBoat = true;
                        } else {
                            computerSmallBoat = false;
                        };
                        if (tabComputer[1][5] == true || tabComputer[2][5] == true || tabComputer[3][5] == true){
                            computerMediumBoat = true;
                        } else {
                            computerMediumBoat = false;
                        };
                        break;
                    }
                    if(tabComputer[userLineChoice][userColumnChoice] == false){
                        System.out.println("Manqué");
                        break;}

                    System.out.print(tabComputer[i][j]);
                };

            };

            if (computerSmallBoat == false && computerMediumBoat == false) {
                System.out.println("Vous avez gagné");
                break;
            }

        } while((computerSmallBoat == true && computerMediumBoat == true) || (userSmallBoat == true && userMediumBoat == true));

















    };
};