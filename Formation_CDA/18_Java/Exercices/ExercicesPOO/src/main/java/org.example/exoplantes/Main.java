package org.example.exoplantes;

public class Main {
    public static void main(String[] args) {

        Plante plante1 = new Plante("Chêne", 500, "Vert");
        Plante arbre1 = new Arbre("Acajou", 200, "Jaune", 50);

        System.out.println(plante1);
        System.out.println(arbre1);
    }
}

