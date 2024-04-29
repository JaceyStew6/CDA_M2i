package org.example;

import org.example.correction.Pizza;
import org.example.demo_abstract_factory.Application;
import org.example.demo_abstract_factory.MacFactory;
import org.example.demo_abstract_factory.WinFactory;

public class Main {
    public static void main(String[] args) {
        /*Voiture voiture1 = new Voiture.VoitureBuilder().marque("marque 1").build();
        Voiture voiture2 = new Voiture.VoitureBuilder().marque("marque 2").model("model 1").build();

        Voiture voiture3 = new Voiture.VoitureBuilder().marque("marque 2").model("model 1").annee(2020).build();

        System.out.println(voiture2);
        System.out.println(voiture1);*/

        //Correction exercice Builder

        /*Pizza  pizza = new Pizza.Builder()
                .typePate("p1")
                .taille("grande")
                .fromage("mozzarella")
                .fromage("f2")
                .typeSauce("tomate")
                .garnitures("Poivron", "Olive")
                .build();

        System.out.println(pizza);*/

        //Démo abstract Factory

        Application application = new Application(new WinFactory());

        Application applicationMac = new Application(new MacFactory());
    }
}