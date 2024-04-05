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

      /*  int linesNumber = 6;
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
                    System.out.print(tabComputer[i][j]);
                };
                System.out.println();
            };
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

            if (computerSmallBoat == false && computerMediumBoat == false) {
                System.out.println("Vous avez gagné");
                break;
            }

        } while((computerSmallBoat == true && computerMediumBoat == true) || (userSmallBoat == true && userMediumBoat == true));*/


        // Nouvelle approche Bataille Navale

        int linesNumber = 6;
        int columnsNumber = 6;
        boolean[][] tabUser = new boolean[linesNumber][columnsNumber];
        boolean[][] tabComputer = new boolean[linesNumber][columnsNumber];
        int computerSmallBoat = 1;
        int computerMediumBoat = 1;
        int userSmallBoat = 1;
        int userMediumBoat = 1;


        //USER
        // PETIT BATEAU
        System.out.println("Choississez les coordonnées de départ de votre petit bateau (2 cases)");
        System.out.println("Axe X (0 - 5)");
        int smallBoatLocationX = scanner.nextInt();
        System.out.println("Axe Y (0 - 5)");
        int smallBoatLocationY = scanner.nextInt();
        tabUser[smallBoatLocationX][smallBoatLocationY] = true;
        int smallBoatLocationX1 = 0;
        int smallBoatLocationY1 = 0;

        System.out.println("Choississez une direction: verticale - horizontale");
        String direction = scanner.next().toLowerCase();

        if (direction.equals("horizontale")) {
            smallBoatLocationX1 = smallBoatLocationX;
            smallBoatLocationY1 = smallBoatLocationY + 1;
            tabUser[smallBoatLocationX1][smallBoatLocationY1] = true;
        } else if (direction.equals("verticale")) {
            smallBoatLocationX1 = smallBoatLocationX + 1;
            smallBoatLocationY1 = smallBoatLocationY;
            tabUser[smallBoatLocationX1][smallBoatLocationY1] = true;
        }

        // BATEAU MOYEN
        System.out.println("Choississez les coordonnées de départ de votre bateau moyen (3 cases)");
        System.out.println("Axe X (0 - 5)");
        int mediumBoatLocationX = scanner.nextInt();
        System.out.println("Axe Y (0 - 5)");
        int mediumBoatLocationY = scanner.nextInt();
        tabUser[mediumBoatLocationX][mediumBoatLocationY] = true;
        int mediumBoatLocationX1 = 0;
        int mediumBoatLocationY1 = 0;
        int mediumBoatLocationX2 = 0;
        int mediumBoatLocationY2 = 0;

        System.out.println("Choississez une direction: verticale - horizontale");
        direction = scanner.next().toLowerCase();

        if (direction.equals("horizontale")) {
            mediumBoatLocationX1 = mediumBoatLocationX;
            mediumBoatLocationY1 = mediumBoatLocationY + 1;
            mediumBoatLocationX2 = mediumBoatLocationX;
            mediumBoatLocationY2 = mediumBoatLocationY + 2;
            tabUser[mediumBoatLocationX1][mediumBoatLocationY1] = true;
            tabUser[mediumBoatLocationX2][mediumBoatLocationY2] = true;
        } else if (direction.equals("verticale")) {
            mediumBoatLocationX1 = mediumBoatLocationX + 1;
            mediumBoatLocationY1 = mediumBoatLocationY;
            mediumBoatLocationX2 = mediumBoatLocationX + 2;
            mediumBoatLocationY2 = mediumBoatLocationY;
            tabUser[mediumBoatLocationX1][mediumBoatLocationY1] = true;
            tabUser[mediumBoatLocationX2][mediumBoatLocationY2] = true;
        }


        //COMPUTER
        System.out.println("L'ordinateur place ses bateaux ...");

        // PETIT BATEAU
        int cpSmallBoatLocationX = (int) (Math.random() * (linesNumber));
        int cpSmallBoatLocationY = (int) (Math.random() * (columnsNumber));

        // On vérifie que X et Y sont inférieurs à la taille du tableau moins 1 (car bateau de 2 cases)
        while(cpSmallBoatLocationX == linesNumber-1 && cpSmallBoatLocationY == columnsNumber-1 ){
            cpSmallBoatLocationX = (int) (Math.random() * (linesNumber));
            cpSmallBoatLocationY = (int) (Math.random() * (columnsNumber));
        }

        // On relance tant qu'au moins un des emplacements du bateau est pris
        while (tabComputer[cpSmallBoatLocationX][cpSmallBoatLocationY] == true && (tabComputer[cpSmallBoatLocationX][cpSmallBoatLocationY+1] == true || tabComputer[cpSmallBoatLocationX+1][cpSmallBoatLocationY] == true )){
            cpSmallBoatLocationX = (int) (Math.random() * (linesNumber));
            cpSmallBoatLocationY = (int) (Math.random() * (columnsNumber));
        }

        tabComputer[cpSmallBoatLocationX][cpSmallBoatLocationY] = true;

        int cpSmallBoatLocationX1 =0;
        int cpSmallBoatLocationY1 =0;

        //Définition de la direction en fonction de X ou Y
        int cpDirection;
        if (cpSmallBoatLocationX == 5) {
            cpDirection = 0;
        } else if (cpSmallBoatLocationY == 5) {
            cpDirection = 1;
        }else {
            cpDirection = (int) (Math.random() * 2);
        }

        if (cpDirection == 0) {
            cpSmallBoatLocationX1 = cpSmallBoatLocationX;
            cpSmallBoatLocationY1 = cpSmallBoatLocationY + 1;
            tabComputer[cpSmallBoatLocationX1][cpSmallBoatLocationY1] = true;
        } else if (cpDirection == 1) {
            cpSmallBoatLocationX1 = cpSmallBoatLocationX + 1;
            cpSmallBoatLocationY1 = cpSmallBoatLocationY;
            tabComputer[cpSmallBoatLocationX1][cpSmallBoatLocationY1] = true;
        }

        // BATEAU MOYEN
        int cpMediumBoatLocationX = (int) (Math.random() * (linesNumber));
        int cpMediumBoatLocationY = (int) (Math.random() * (columnsNumber));

        // On vérifie que X et Y sont inférieurs à la taille du tableau moins 2 (car bateau de 3 cases)
        while (cpMediumBoatLocationX < 4 && cpMediumBoatLocationY < 4){
            cpMediumBoatLocationX = (int) (Math.random() * (linesNumber));
            cpMediumBoatLocationY = (int) (Math.random() * (columnsNumber));
        }

        // On relance tant qu'au moins un des emplacement du bateau est pris
        while (tabComputer[cpMediumBoatLocationX][cpMediumBoatLocationY] == true && ((tabComputer[cpMediumBoatLocationX][cpMediumBoatLocationY+1] == true && tabComputer[cpMediumBoatLocationX][cpMediumBoatLocationY+2] == true) || (tabComputer[cpMediumBoatLocationX+1][cpMediumBoatLocationY] == true && tabComputer[cpMediumBoatLocationX+2][cpMediumBoatLocationY] == true))){
            cpMediumBoatLocationX = (int) (Math.random() * (linesNumber));
            cpMediumBoatLocationY = (int) (Math.random() * (columnsNumber));
        }

        tabComputer[cpMediumBoatLocationX][cpMediumBoatLocationY] = true;

        int cpMediumBoatLocationX1 = 0;
        int cpMediumBoatLocationY1 = 0;
        int cpMediumBoatLocationX2 = 0;
        int cpMediumBoatLocationY2 = 0;

        //Définition de la direction en fonction de X ou Y
        if (cpMediumBoatLocationX >= 4) {
            cpDirection = 0;
        } else if (cpMediumBoatLocationY >= 4) {
            cpDirection = 1;
        }else {
            cpDirection = (int) (Math.random() * 2);
        }

        //horizontale
        if (cpDirection == 0) {
            cpMediumBoatLocationX1 = cpMediumBoatLocationX;
            cpMediumBoatLocationY1 = cpMediumBoatLocationY + 1;
            cpMediumBoatLocationX2 = cpMediumBoatLocationX;
            cpMediumBoatLocationY2 = cpMediumBoatLocationY + 2;
            tabComputer[cpMediumBoatLocationX1][cpMediumBoatLocationY1] = true;
            tabComputer[cpMediumBoatLocationX2][cpMediumBoatLocationY2] = true;
        //verticale
        } else if (cpDirection == 1) {
            cpMediumBoatLocationX1 = cpMediumBoatLocationX + 1;
            cpMediumBoatLocationY1 = cpMediumBoatLocationY;
            cpMediumBoatLocationX2 = cpMediumBoatLocationX + 2;
            cpMediumBoatLocationY2 = cpMediumBoatLocationY;
            tabComputer[cpMediumBoatLocationX1][cpMediumBoatLocationY1] = true;
            tabComputer[cpMediumBoatLocationX2][cpMediumBoatLocationY2] = true;
        }

        do {
            //TOUR DU JOUEUR
            System.out.println("--------");
            System.out.println("A VOUS DE JOUER");
            for (int i = 0; i < linesNumber; i++) {
                for (int j = 0; j < columnsNumber; j++) {
                    System.out.print(tabComputer[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Entrez les coordonnées de votre tir (0-5)");
            int shootX = scanner.nextInt();
            int shootY = scanner.nextInt();

            if (tabComputer[shootX][shootY] == true) {
                System.out.println("Touché");
                tabComputer[shootX][shootY] = false;
            } else {
                System.out.println("Manqué");
            }

            //On vérifie si des bateaux sont coulés
            if (computerSmallBoat != 0) {
                if (tabComputer[cpSmallBoatLocationX][cpSmallBoatLocationY] == false && tabComputer[cpSmallBoatLocationX1][cpSmallBoatLocationY1] == false) {
                    System.out.println("Le petit bateau est coulé");
                    computerSmallBoat = 0;
                }
            }
            if (computerMediumBoat != 0) {
                if (tabComputer[cpMediumBoatLocationX][cpMediumBoatLocationY] == false && tabComputer[cpMediumBoatLocationX1][cpMediumBoatLocationY1] == false && tabComputer[cpMediumBoatLocationX2][cpMediumBoatLocationY2] == false) {
                    System.out.println("Le bateau moyen est coulé");
                    computerMediumBoat = 0;
                }
            }
            if (computerSmallBoat == 0 && computerMediumBoat == 0) {
                System.out.println("VOUS AVEZ GAGNE!!");
                break;
            }


            //TOUR DE L'ORDINATEUR
            System.out.println("--------");
            System.out.println("L'ORDINATEUR JOUE");
            for (int i = 0; i < linesNumber; i++) {
                for (int j = 0; j < columnsNumber; j++) {
                    System.out.print(tabUser[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("L'ordinateur choisi ses coordonnées de tir");
            shootX = (int) (Math.random() * linesNumber);
            shootY = (int) (Math.random() * columnsNumber);
            System.out.println("X: " + shootX + " Y: " + shootY);

            if (tabUser[shootX][shootY] == true) {
                System.out.println("Touché");
                tabUser[shootX][shootY] = false;
            } else {
                System.out.println("L'ordinateur vous manque");
            }

            //On vérifie si des bateaux sont coulés
            if (userSmallBoat != 0) {
                if (tabUser[smallBoatLocationX][smallBoatLocationY] == false && tabUser[smallBoatLocationX1][smallBoatLocationY1] == false) {
                    System.out.println("Votre petit bateau est coulé");
                    userSmallBoat = 0;
                }
            }
            if (userMediumBoat != 0) {
                if (tabUser[mediumBoatLocationX][mediumBoatLocationY] == false && tabUser[mediumBoatLocationX1][mediumBoatLocationY1] == false && tabUser[mediumBoatLocationX2][mediumBoatLocationY2] == false) {
                    System.out.println("Votre bateau moyen est coulé");
                    userMediumBoat = 0;
                }
            }
            if (userSmallBoat == 0 && userMediumBoat == 0) {
                System.out.println("L'ORDINATEUR A GAGNE!! VOUS AVEZ PERDU!!");
                break;
            }

        } while ((computerSmallBoat != 0 && computerMediumBoat != 0) || (userSmallBoat != 0 && userMediumBoat != 0));


    }

    ;
};