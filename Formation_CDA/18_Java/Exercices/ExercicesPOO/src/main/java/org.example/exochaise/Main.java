package org.example.exochaise;

public class Main {

    public static void main(String[] args) {

        Chaise chaise = new Chaise();
        Chaise chaise1 = new Chaise(3, "bambou", "gris", 130.99);
        Chaise chaise2 = new Chaise(1, "métal", "orange", 76.25);

//        chaise.afficherChaise();
//        chaise1.afficherChaise();
//        chaise2.afficherChaise();

        // deuxième méthode avec toString()

        System.out.println(chaise);
        System.out.println(chaise1);
        System.out.println(chaise2);

    }
}
