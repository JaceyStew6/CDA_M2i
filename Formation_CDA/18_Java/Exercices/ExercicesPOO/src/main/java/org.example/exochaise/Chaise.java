package org.example.exochaise;

public class Chaise {

    //Attributs de la chaise
    int nbPieds;
    String materiaux;
    String couleur;
    double prix;


    public Chaise() {
        this(4, "chêne", "bleu", 14.4);
    }

    public Chaise(int nbPieds, String materiaux, String couleur, double prix) {
        this.nbPieds = nbPieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

//    public void afficherChaise() {
//        System.out.println("Je suis une chaise avec " + this.nbPieds + " pied(s) en " + this.materiaux + " de couleur " + this.couleur + " à un prix de " + this.prix);
//    }

    public String toString(){
        return "Je suis une chaise avec " + this.nbPieds + " pied(s) en " + this.materiaux + " de couleur " + this.couleur + " à un prix de " + this.prix;
    }
}
