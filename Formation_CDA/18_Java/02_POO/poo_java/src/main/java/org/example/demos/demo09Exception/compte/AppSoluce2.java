package org.example.demos.demo09Exception.compte;

import java.util.Scanner;

public class AppSoluce2 {
    public static void main(String[] args) throws Exception {
        Compte cp= new Compte();
        Scanner clavier=new Scanner(System.in);
        System.out.print("Montant à verser:");
        float mt1;
        mt1=clavier.nextFloat();
        cp.verser(mt1);
        System.out.println("Solde Actuel:"+cp.getSolde());
        System.out.print("Montant à retirer:");
        float mt2=clavier.nextFloat();
        cp.retirer(mt2); // Le compilateur signal l’Exception
    }
}
