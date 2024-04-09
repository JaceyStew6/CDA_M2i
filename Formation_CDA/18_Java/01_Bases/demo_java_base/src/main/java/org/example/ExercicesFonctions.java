package org.example;

import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.regex.*;

public class ExercicesFonctions {

    // Exercice 1
//    public static String nomComplet(String prenom, String nom){
//        return prenom + " " + nom;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(nomComplet("Guillaume","Mairesse"));
//    }

    //Exercice 2
//    public static int soustraire (int a, int b){
//        System.out.println("Je soustrait 2 et 1");
//        return a - b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(soustraire(2, 1));
//    }

    //Exercice 3
//    public static void quelleHeure(String heure){
//        System.out.println("Il est " + heure);
//    }
//    public static void quelleHeure(){
//        quelleHeure("12h00");
//    }
//
//    public static void main(String[] args) {
//        quelleHeure();
//        quelleHeure("14h00");
//    }

    // Exercice 4
//    public static int compterLetteA(String chaine){
////        chaine = chaine.toLowerCase();
////        char[] tab = chaine.toCharArray();
////        int sommeA = 0;
//////        for (int i = 0; i < tab.length; i++) {
//////            if (tab[i] == 'a' ) {
//////                sommeA++;
//////            }
//////        }
//////        for (char c : tab) if (c == 'a' ) sommeA++;
////        for (char c : tab)
////            if (c == 'a' )
////                sommeA++;
//
//        chaine = chaine.toLowerCase();
//        int sommeA = 0;
//        for (int i = 0; i < chaine.length(); i++) {
//            if (chaine.charAt(i) == 'a' ) {
//                sommeA++;
//            }
//        }
//
//        return sommeA;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(compterLetteA("baba"));
//        System.out.println(compterLetteA("bsdgfsjdfc"));
//    }

    // Exercice 5 ADN

    public static void main(String[] args) {
        String chaineAdn = saisieChaineAdn("Saisir la chaine : ");
        String sequence = saisieChaineAdn("Saisir la séquence : ");

        System.out.println("chaine : " + chaineAdn);
        System.out.println("sequence : " + sequence);

        double pourcent = pourcentageSequence(chaineAdn, sequence);
        System.out.println("Pourcentage : " + pourcent);
    }

    public static boolean verificationAdn(String chaineAdn) {
        //première version
//        for(int i = 0; i < chaineAdn.length(); i++){
//            if(!"actg".contains(Character.toString(chaineAdn.charAt(i))))
//                return false;
//        }
        //seconde version

        // convertis la chaine en tableau
//        String[] chaineAdnSplit = chaineAdn.split("");
//        for (String charAdn : chaineAdnSplit) {
//            if (!"actg".contains(charAdn)) {
//                return false;
//            }
//        }
//        return true;

        // en une ligne
        return chaineAdn.matches("[atcgATCG]+");
    }

    public static String saisieChaineAdn(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String chaine = scanner.nextLine().trim().toLowerCase();
        while (!verificationAdn(chaine)) {
            System.out.print("Erreur ! " + message);
            chaine = scanner.nextLine().trim().toLowerCase();
        }
        return chaine;
    }

    public static double pourcentageSequence(String chaine, String sequence) {
        Pattern pattern = Pattern.compile(sequence);
        Matcher matcher = pattern.matcher(chaine);
        int occurrences = 0;

        // tant qu'il y a la sequence dans la chaine de caractère l'occurences s'incrémente de 1
        while (matcher.find()) {
            occurrences++;
        }
        return (double) occurrences * sequence.length() / chaine.length() * 100;
    }
}
