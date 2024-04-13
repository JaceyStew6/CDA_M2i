package org.example.exocomptebancaire;

//Doit être une classe abstraite
public class CompteBancaire {

        protected double solde;
        protected String client;
//        public enum listeOperations;


        public CompteBancaire(double solde, String client) {
                this.solde = solde;
                this.client = client;
        }
}
