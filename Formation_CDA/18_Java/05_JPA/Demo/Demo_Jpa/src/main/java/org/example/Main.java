package org.example;

import org.example.Entity.Plante;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager em = emf.createEntityManager();

        Plante plante = Plante.builder().name("Rose").age(1).color("Red").build();

        em.getTransaction().begin();
        em.persist(plante);
        em.getTransaction().commit();

        try{
            Plante plantefound = em.getReference(Plante.class,2);
            if(plantefound != null){
                System.out.println(plantefound);
            }
        }catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        Query query = em.createQuery("select p from Plante p where p.id = 1 ");
        Plante planteFoundByQuery = (Plante) query.getSingleResult();

        if(planteFoundByQuery != null){
            System.out.println("via quer : "+ planteFoundByQuery);

        }

        Query query1 = em.createQuery("select p from Plante p");
        List planteList = query1.getResultList();

        for (Object planteInList : planteList){
            System.out.println("from list : "+planteInList);
        }




        em.close();
        emf.close();
    }
}