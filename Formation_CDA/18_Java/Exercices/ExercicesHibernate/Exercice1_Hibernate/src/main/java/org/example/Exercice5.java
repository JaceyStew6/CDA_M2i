package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Exercice5 {
    public static void main(String[] args) {
        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();


        //Ajouter la possibilité d'ajouter une image à un produit.

        

        //Ajouter la possibilité d'ajouter un commentaire à un produit.

        //Afficher les produits avec une note de 4 ou plus.

    }
}
