package org.example;

import org.example.Entity.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Fleuriste fleuriste = em.find(Fleuriste.class,1);
        System.out.println( "fleuriste find : "+ fleuriste);
//        Pot pot = Pot.builder().height(10).width(10).build();
//        Plante plante = Plante.builder().name("tulipe").age(1).color("pink").pot(pot).fleuriste(fleuriste).fleures(new ArrayList<>()).build();
//
//        Fleure fleure1 = Fleure.builder().color("Red").build();
//        Fleure fleure2 = Fleure.builder().color("Blue").build();
//        Fleure fleure3 = Fleure.builder().color("Yellow").build();
//
//        plante.add(fleure1);
//        plante.add(fleure2);
//        plante.add(fleure3);
//
//        em.persist(fleure1);
//        em.persist(fleure2);
//        em.persist(fleure3);
//
//        em.persist(fleuriste);
//        em.persist(pot);
//        em.persist(plante);


//        Serre serre = Serre.builder().surface(50).plantes(new ArrayList<>()).build();
//        serre.add(em.find(Plante.class,2));
//        serre.add(em.find(Plante.class,3));
//        serre.add(em.find(Plante.class,4));

//        em.persist(serre);

        Serre serre = em.find(Serre.class,1);
        System.out.println("Ma serre : "+ serre.getPlantes().toString());

        Plante plante = em.find(Plante.class,3);
        System.out.println("ma plante : "+ plante.getSerres().toString());

        em.getTransaction().commit();

//        try{
//            Plante plantefound = em.find(Plante.class,2);
//            if(plantefound != null){
//                System.out.println(plantefound);
//            }
//        }catch (EntityNotFoundException e){
//            System.out.println(e.getMessage());
//        }

//        Query query = em.createQuery("select p from Plante p where p.id = 1 ");
//        Plante planteFoundByQuery = (Plante) query.getSingleResult();
//
//        if(planteFoundByQuery != null){
//            System.out.println("via quer : "+ planteFoundByQuery);
//
//        }

//        Query query1 = em.createQuery("select p from Plante p");
//        List planteList = query1.getResultList();
//
//        for (Object planteInList : planteList){
//            System.out.println("from list : "+planteInList);
//        }




        em.close();
        emf.close();
    }
}