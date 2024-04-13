package org.example.exocomptebancaire;

public class Client {

    private String nom;
    private String prenom;
    private int identifiant;
    private String listeComptes;
    private int numeroTelephone;

    public Client(String nom, String prenom, int identifiant, String listeComptes, int numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.listeComptes = listeComptes;
        this.numeroTelephone = numeroTelephone;
    }
}
