package org.example;

import org.example.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

        //Ajout des produits
        //Produit 1
/*        session.getTransaction().begin();
        Product p1 = new Product();
        p1.setBrand("Samsung");
        p1.setReference("SAM5");
        p1.setStock(10);
        p1.setProductDate(new Date());
        p1.setProductPrice(600.0);
        session.save(p1);
        System.out.println("ID du produit" + p1.getId());
        session.getTransaction().commit();

        //Produit 2
        session.getTransaction().begin();
        Product p2 = new Product();
        p2.setBrand("Dell");
        p2.setReference("DEL6");
        p2.setStock(2);
        p2.setProductDate(new Date());
        p2.setProductPrice(800.0);
        session.save(p2);
        System.out.println("ID du produit" + p2.getId());
        session.getTransaction().commit();

        //Produit 3
        session.getTransaction().begin();
        Product p3 = new Product();
        p3.setBrand("Xiaomi");
        p3.setReference("XIA2");
        p3.setStock(50);
        p3.setProductDate(new Date());
        p3.setProductPrice(320.0);
        session.save(p3);
        System.out.println("ID du produit" + p3.getId());
        session.getTransaction().commit();

        //Produit 4
        session.getTransaction().begin();
        Product p4 = new Product();
        p4.setBrand("Asus");
        p4.setReference("ASU3");
        p4.setStock(6);
        p4.setProductDate(new Date());
        p4.setProductPrice(730.9);
        session.save(p4);
        System.out.println("ID du produit" + p4.getId());
        session.getTransaction().commit();

        //Produit 5
        session.getTransaction().begin();
        Product p5 = new Product();
        p5.setBrand("Acer");
        p5.setReference("ACE1");
        p5.setStock(1);
        p5.setProductDate(new Date());
        p5.setProductPrice(699.0);
        session.save(p5);
        System.out.println("ID du produit" + p5.getId());
        session.getTransaction().commit();*/

        //Afficher informations du produit à l'id 2
        session.getTransaction().begin();
        Product p = session.load(Product.class, 2);
        System.out.println("Marque: " + p.getBrand() + " Référence: " + p.getReference() + " Date de vente: " + p.getProductDate() + " Prix: " + p.getProductPrice() + " Stock: " + p.getStock());

        //On supprime le produit à l'id 3
        session.delete(p3);
        session.getTransaction().commit();

        //On modifie les informations du produit à l'id 1
        session.getTransaction().begin();
        Product p1Update = session.load(Product.class, 1);
        System.out.println("Marque: " + p1Update.getBrand() + " Référence: " + p1Update.getReference() + " Date de vente: " + p1Update.getProductDate() + " Prix: " + p1Update.getProductPrice() + " Stock: " + p1Update.getStock());
        p1Update.setStock(20);
        session.update(p1Update);
        session.getTransaction().commit();

        System.out.println("Marque: " + p1Update.getBrand() + " Référence: " + p1Update.getReference() + " Date de vente: " + p1Update.getProductDate() + " Prix: " + p1Update.getProductPrice() + " Stock: " + p1Update.getStock());

        //Autre façon de procéder en connaissant le nom de l'objet mais en ne passant pas par l'id
/*        session.getTransaction().begin();
        p1.setStock(20);
        session.update(p1);
        session.getTransaction().commit();*/

        session.getTransaction().begin();
        p5.setProductPrice(99);
        session.update(p5);
        session.getTransaction().commit();

        //Fermeture de la session et de la session factory
        session.close();
        sessionFactory.close();
    }
}
