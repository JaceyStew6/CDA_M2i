package org.example.exocomptebancaire;

import java.util.List;

//Doit être une classe abstraite
public class CompteBancaire {
        protected double solde;
        protected String client;
        private List<String> listeOperation;

        public CompteBancaire(double solde, String client, List<String> listeOperation) {
                this.solde = solde;
                this.client = client;
                this.listeOperation = listeOperation;
        }
}
