package org.example.exojoueur;

public class Main {

    public static void main(String[] args) {
        Joueur joueur1 = new Joueur("Jacey", 1, 40);

        int nbQuete = 20;
        for (int i = 0; i < nbQuete ; i++) {
            joueur1.effectuerUneQuete(i);
            joueur1.upgradeNiveau();
        }
    }
}
