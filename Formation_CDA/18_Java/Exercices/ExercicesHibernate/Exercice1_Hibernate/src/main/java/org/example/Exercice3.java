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
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) throws ParseException {
        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Scanner sc = new Scanner(System.in);

        //1. Afficher la liste des produits commandés entre deux dates lus au clavier.
/*        System.out.println("Indiquer les dates d'achat des produits à afficher");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("date de début - format yyyy-MM-dd");
        Date startDate = format.parse(sc.nextLine());

        System.out.println("date de fin - format yyyy-MM-dd");
        Date endDate = format.parse(sc.nextLine());

        Query<Product> queryProduct3 = session.createQuery("from Product where productDate between :startDate and :endDate");
        queryProduct3.setParameter("startDate", startDate);
        queryProduct3.setParameter("endDate", endDate);

        System.out.println("");
        System.out.println("Liste des produits achetés entre les dates indiquées");
        List<Product> productList3 = queryProduct3.list();
        for (Product p : productList3){
            System.out.println("Marque: " + p.getBrand() + " Référence: " + p.getReference() + " Date de vente: " + p.getProductDate() + " Prix: " + p.getProductPrice() + " Stock: " + p.getStock());
        }*/

        //2. Retourner les numéros et reference des articles dont le stock est inférieur à une valeur lue au clavier.
        System.out.println("  ");
        System.out.println("--- Produits dont le stock est inférieur à la quantité renseignée ---");

        int selectedStock = 0;

        System.out.println("Saisissez une valeur maximale de stock");
        selectedStock = sc.nextInt();


        Query<Product> queryProduct1 = session.createQuery("from Product where stock < :selectedStock");
        queryProduct1.setParameter("selectedStock", selectedStock);

        System.out.println("--- Produits dont le stock est inférieur à la quantité renseignée ---");
        List<Product> productList = queryProduct1.list();
        for (Product p : productList){
            System.out.println("Id: " + p.getId() + " Référence: " + p.getReference());
        }


        //Fermeture de la session et la sessionfactory
        session.close();
        sessionFactory.close();
    }
}
