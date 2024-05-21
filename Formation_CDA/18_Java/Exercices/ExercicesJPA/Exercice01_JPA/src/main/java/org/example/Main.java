package org.example;

import org.example.Entity.SSD;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_exo1");
        EntityManager em = emf.createEntityManager();

        SSD ssd = SSD.builder().brand("Samsung").size(16).ssdType("NVME").build();

        em.getTransaction().begin();
        em.persist(ssd);
        em.getTransaction().commit();

        try{
            SSD ssdFound = em.getReference(SSD.class,2);
            if(ssdFound != null){
                System.out.println(ssdFound);
            }
        }catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        Query query = em.createQuery("select s from SSD s where s.id=1");
        SSD ssdFoundByQuery = (SSD) query.getSingleResult();

        if(ssdFoundByQuery != null){
            System.out.println("via query : "+ ssdFoundByQuery);

        }

        Query query1 = em.createQuery("select s from SSD s");
        List ssdList = query1.getResultList();

        for (Object ssdInList : ssdList){
            System.out.println("from list : "+ssdInList);
        }

        em.close();
        emf.close();


    }
}