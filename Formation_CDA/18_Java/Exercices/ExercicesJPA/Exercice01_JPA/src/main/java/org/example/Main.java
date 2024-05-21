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
        SSD ssd1 = SSD.builder().brand("Samsung").size(8).ssdType("mSATA").build();

        em.getTransaction().begin();
        em.persist(ssd);
        em.persist(ssd1);
        em.getTransaction().commit(); //push les modifications directement dans la BDD

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

//        SSD ssd2 = em.find(SSD.class, 2);
//        if(ssd == null){
//            System.out.println("SSD not found");
//        }else {
//            em.remove(ssd2);
//        }
//
//        em.getTransaction().commit();


        em.close();
        emf.close();


    }
}