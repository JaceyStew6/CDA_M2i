package org.example;

import java.util.Locale;

public class Fonctions {

    //    <visibilité> <mot-clés poo> <type de retour> <identificateur/symbol de la fonction>(<paramètres et leur types>){
    public static int add(int int1, int int2) { // signature de la méthode
//        var result = int1 + int2;
//        return result;
        return int1 + int2; // instruction de sortie/retour
    }

    // les 2 fonctions suivantes sont différentes de la fonction add(int, int) car leur signatures sont différentes
    // => Polymorphisme (PLUSIEURS FORMES pour une fonction avec un même nom/identificateur/symbol
    public static int add(int int1, int int2, int int3) {
        return int1 + int2 + int3;
    }

    public static double add(double int1, double int2, double int3) {
        return int1 + int2 + int3;
    }

    // les types et nombre de paramètres sont identique à add(int,int) donc c'est impoissible
//    public static double add(int int1, int int2){ //
//        return int1 + int2;
//    }

    public static void addPrint(int int1, int int2) { // void => aucun type de retour, impossible de récupérer un résultat à l'exécution (!= null, 0 , "", '\0')
        System.out.println("Résultat de l'addition : " + (int1 + int2));
        if (true)
            return;
        return;
//        System.out.println("après le return");
    }

    public static int sum(int[] ints) {
        var somme = 0.;
//        for (int i = 0; i < ints.length; i++) {
//            somme += ints[i];
//        }

        for (var item : ints) {
            somme += item;
        }

        return (int) somme;
    }

    public static int sum2(/*String test,*/ int... ints) { // ici on accepte autant de paramêtres du même type que nécessaire (on peu aussi directement mettre un tableau)
        var somme = 0;
        for (var item : ints) { // ints est un tableau
            somme += item;
        }
        return somme;
    }

    public static void infinie() {
        infinie();
    }

    public static void main(String[] args) {
        var result = add(1, 2);
        System.out.println(result);

        System.out.println(add(1, 2, 3)); // avec des ints
        System.out.println(add(1., 2, (double) 3)); // avec des doubles

//        var result2 = addPrint(1,2);
//        int result2 = addPrint(1,2);
        addPrint(1, 2);

        int[] tab = {1, 2, 3, 4};
        var tab2 = new int[]{1, 2, 3, 4};

        System.out.println(sum(tab));
        System.out.println(sum2(tab));
        System.out.println(sum2(1, 5, 6, 8));
        System.out.println(sum2());

        // infinie(); // Stack Overflow !!!
    }
}
