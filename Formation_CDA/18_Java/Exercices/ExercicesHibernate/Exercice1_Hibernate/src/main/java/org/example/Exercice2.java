package org.example;

import org.example.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Exercice2 {
    public static void main(String[] args) throws ParseException {
        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

        //1. Afficher la totalité des produits
        System.out.println("--- Liste de tous les produits ---");

        Query<Product> queryProduct = session.createQuery("from Product");

        List<Product> products = queryProduct.list();
        for (Product p : products){
            System.out.println("Marque: " + p.getBrand() + " Référence: " + p.getReference() + " Date de vente: " + p.getProductDate() + " Prix: " + p.getProductPrice() + " Stock: " + p.getStock());
        }

        //2. Afficher la liste des produits dont le prix est supérieur à 100 euros
        System.out.println("  ");
        System.out.println("--- Produits dont le prix est supérieur à 100 ---");

        Query<Product> queryProduct1 = session.createQuery("from Product where productPrice > 100");
        List<Product> productList = queryProduct1.list();
        for (Product p : productList){
            System.out.println("Marque: " + p.getBrand() + " Référence: " + p.getReference() + " Date de vente: " + p.getProductDate() + " Prix: " + p.getProductPrice() + " Stock: " + p.getStock());
        }

        //3. Afficher la liste des produits achetés entre deux dates.

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = format.parse("2024-05-26");
        Date endDate = format.parse("2024-05-29");

        System.out.println("  ");
        System.out.println("--- Produits dont la date d'achat est comprise entre deux le 26 Mai et le 29 Mai ---");

        Query<Product> queryProduct2 = session.createQuery("from Product where productDate between :startDate and :endDate");
        queryProduct2.setParameter("startDate", startDate);
        queryProduct2.setParameter("endDate", endDate);

        List<Product> productList2 = queryProduct2.list();
        for (Product p : productList2){
            System.out.println("Marque: " + p.getBrand() + " Référence: " + p.getReference() + " Date de vente: " + p.getProductDate() + " Prix: " + p.getProductPrice() + " Stock: " + p.getStock());
        }

        //Fermeture de la session et la sessionfactory
        session.close();
        sessionFactory.close();
    }
}
