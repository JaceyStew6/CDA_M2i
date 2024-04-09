package org.example.exojoueur;

public class Joueur {
    //Attributs du joueur
    private String nom;
    private int niveau;
    private int pointsExperience;

    public Joueur(String nom, int niveau, int pointsExperience){
        this.nom = nom;
        this.niveau = niveau;
        this.pointsExperience = pointsExperience;
    }

    public int effectuerUneQuete(int i){
        System.out.println("Le joueur " + this.nom + " effectue la quête n°" + i);
        return this.pointsExperience += 10;
    };

    public int upgradeNiveau(){
        if (this.pointsExperience > 100){
            this.niveau += 1;
            System.out.println("Le joueur " + this.nom + " passe au niveau " + this.niveau);
            return this.pointsExperience = 0;
        }
        return this.niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPointsExperience() {
        return pointsExperience;
    }

    public void setPointsExperience(int pointsExperience) {
        this.pointsExperience = pointsExperience;
    }
}
