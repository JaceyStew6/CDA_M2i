package org.example.exocomptebancaire.model;

import java.util.ArrayList;
import java.util.List;

//Doit être une classe abstraite
public class CompteBancaire {
        protected double solde;
        protected Client client;
        private List<Operation> listeOperation;

        public CompteBancaire(double solde, Client client) {
                this.solde = solde;
                this.client = client;
                this.listeOperation = new ArrayList<>();
        }

        public CompteBancaire(Client client){
                this.solde = 0;
                this.client = client;
                this.listeOperation = new ArrayList<>();
        }
}

