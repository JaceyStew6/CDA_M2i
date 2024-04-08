package org.example;

public class Exercice1 {
//Exercice 1: Ecrire une fonction qui prend en paramètres: prénom / nom

    //Soluce 1
//    public static void person(String firstname, String lastname){
//        System.out.println(firstname + " " + lastname);
//    }

    //Soluce 2
    public static String person(String firstname, String lastname){
        return firstname + " " + lastname;
    }

    public static void main(String[] args) {
        //Soluce 1
//        person("Max", "Black");

        //Soluce 2
        System.out.println(person("Max", "Black"));

    }
}