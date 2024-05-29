package org.example;

import org.example.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.type.StringType;

import java.util.Date;
import java.util.List;

public class Exercice4 {
    public static void main(String[] args) {

        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();

        //Ajout de produits
        //Produit 6
/*        session.getTransaction().begin();
        Product p6 = new Product();
        p6.setBrand("Samsung");
        p6.setReference("SAM6");
        p6.setStock(10);
        p6.setProductDate(new Date());
        p6.setProductPrice(900.0);
        session.save(p6);
        System.out.println("ID du produit" + p6.getId());
        session.getTransaction().commit();

        //Produit 7
        session.getTransaction().begin();
        Product p7 = new Product();
        p7.setBrand("Acer");
        p7.setReference("ACE2");
        p7.setStock(66);
        p7.setProductDate(new Date());
        p7.setProductPrice(1299.9);
        session.save(p7);
        System.out.println("ID du produit" + p7.getId());
        session.getTransaction().commit();*/

        //Produit 8
/*        session.getTransaction().begin();
        Product p8 = new Product();
        p8.setBrand("HP");
        p8.setReference("HP01");
        p8.setStock(4);
        p8.setProductDate(new Date());
        p8.setProductPrice(569.99);
        session.save(p8);
        System.out.println("ID du produit" + p8.getId());
        session.getTransaction().commit();

        //Produit 9
        session.getTransaction().begin();
        Product p9 = new Product();
        p9.setBrand("HP");
        p9.setReference("HP02");
        p9.setStock(18);
        p9.setProductDate(new Date());
        p9.setProductPrice(499.90);
        session.save(p9);
        System.out.println("ID du produit" + p9.getId());
        session.getTransaction().commit();*/


        //1. Afficher la valeur du stock des produits d'une marque choisie.
        System.out.println("--- Valeur du stock des produits d'une marque ---");

        double brandStock = (double)session.createQuery("SELECT SUM(productPrice*stock) from Product where brand = 'Samsung' ").uniqueResult();
        System.out.println("Valeur de stock pour les produits Samsung : " + brandStock);


        //2. Calculer le prix moyen des produits.
        System.out.println(" ");
        System.out.println("--- Prix moyen des produits ---");

        double averagePrice = (double)session.createQuery("select round(avg(productPrice),2) from Product").uniqueResult();
        System.out.println("Prix moyen : " + averagePrice);


        //3. Récupérer la liste des produits d'une marque choisie.
        System.out.println("  ");
        System.out.println("--- Liste des produits d'une marque choisie ---");

        String chosenBrand = "Acer";
        Query<Product> queryBrandProduct = session.createQuery("from Product where brand = :chosenBrand");
        queryBrandProduct.setParameter("chosenBrand", chosenBrand);

        List<Product> products = queryBrandProduct.list();
        for(Product p : products){
            System.out.println("Marque: " + p.getBrand() + " Référence: " + p.getReference() + " Date de vente: " + p.getProductDate() + " Prix: " + p.getProductPrice() + " Stock: " + p.getStock());
        }


        //4. Supprimer les produits d'une marque choisie de la table produit.
        System.out.println("  ");
        System.out.println("--- Supprimer les produits d'une marque choisie ---");

        String brandToDelete = "HP";
        Query<Product> queryDeleteBrand = session.createQuery("from Product where brand = :brandToDelete");
        queryDeleteBrand.setParameter("brandToDelete", brandToDelete);

        List<Product> productsToDelete = queryDeleteBrand.list();
        for(Product p1 : productsToDelete){
            session.getTransaction().begin();
            session.delete(p1);
            session.getTransaction().commit();
        }
        System.out.println("Les produits de la marque " + brandToDelete + " ont été supprimés");


        //Fermeture de la session
        session.close();
        sessionFactory.close();
    }
}
