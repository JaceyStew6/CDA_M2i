package org.example;

public class Exercice4_CompteurDeLettre {

    //Écrire une fonction compter_lettre_a
    //Cette fonction prendra en paramètre une chaîne
    //Créer une boucle qui parcourt les lettres de la chaine et compte le nombre de lettres égales à "a"
    //La fonction renverra un entier
    //exemple : compter_lettre_a("C'est le b-a ba") => résultat : 2
    //exemple : compter_lettre_a("mixer") => résultat : 0
    //Écrire une autre fonction sans boucle qui utilisera count à la place.


    public static int compterLettreA(String phrase) {
        int counterLetter = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);
            if (letter == 'a') {
                counterLetter++;
            }
        }
        return counterLetter;
    }

    //Faire la même chose avec .count() et .contains() et sans boucle

    public static void main(String[] args) {

        System.out.println(compterLettreA("Max Black et Caroline Channing"));

    }
}
