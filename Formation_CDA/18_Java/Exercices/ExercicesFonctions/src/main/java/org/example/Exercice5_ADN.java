package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercice5_ADN {


    //Écrire un programme qui permet de saisir une chaine d’ADN ainsi qu’une séquence d’ADN et qui retourne le % d’occurrences de la séquence dans la chaîne.
    //Cette séquence sera composée uniquement de la combinaison de lettre suivante : ‘a’, ‘t’, ‘c’, ‘g’
    //1. Écrire une fonction vérification_adn qui permet de renvoyer la valeur True si la chaine d’ADN est valide, False si elle est invalide
    //2. Écrire une fonction saisie_adn qui récupère une saisie, vérifie sa validité et renvoie une chaine d’ADN valide sous forme de chaine
    //3. Écrire une fonction proportion qui reçoit deux paramètres : une chaine d’ADN et une séquence d’ADN. Elle renverra le % d’occurrences de la séquence dans la chaîne
    //4. Créer des instructions pour pouvoir tester le programme


    public static boolean verificationAdn(String chaineAdn) {
        for (int i = 0; i < chaineAdn.length(); i++) {
//            char letter = chaineAdn.charAt(i);
            if (!chaineAdn.contains("actg")) {
                return false;
            }
        }
        return true;
    }

    public static String saisieAdn() {
        System.out.println("Saisir chaine adn");
        Scanner scanner = new Scanner(System.in);

        String chaine = scanner.nextLine().trim().toLowerCase();
        while (!verificationAdn(chaine)) {
            System.out.println("Erreur, veuillez saisir une chaine valide");
            chaine = scanner.nextLine().trim().toLowerCase();
        }
        return chaine;
    }

    public static double pourcentageSequence(String chaine, String sequence) {
        Pattern pattern = Pattern.compile(sequence); //Equivalent d'un regex
        Matcher matcher = pattern.matcher(chaine); //On vient vérifier si le pattern définit avant trouve des éléments dans notre chaine

        double occurences = 0;
        while (matcher.find()) {
            occurences += 1;
        }
        double sequenceLength = sequence.length();
        double chaineLength = chaine.length();

        double pourcent = occurences * sequenceLength / chaineLength * 100;

        return pourcent;
    }


    public static void main(String[] args) {
        String chaineAdn = saisieAdn();
        String sequenceAdn = saisieAdn();

        System.out.println(pourcentageSequence(chaineAdn, sequenceAdn) + " %");

    }
}
