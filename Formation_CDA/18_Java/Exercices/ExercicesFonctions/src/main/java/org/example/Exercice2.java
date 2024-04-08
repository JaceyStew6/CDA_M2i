package org.example;

public class Exercice2 {

    //Écrire la fonction soustraire qui prend en paramètre:
    //nombre a
    //nombre b
    //Elle retournera un entier qui sera la soustraction de ces deux nombres
    //exemple : soustraire(2, 1) => résultat = 1
    //De plus, lors de l’exécution la fonction affichera « Je soustrait 2 et 1 »
    //Vous afficherez ensuite le résultat de cette fonction


    public static int soustraire (int nba, int nbb){
        System.out.println("Je soustrais " + nba + " et " + nbb);
        return nba - nbb;
    };


    public static void main(String[] args) {

        System.out.println(soustraire(3,1));
    }
}
