package org.example;

import org.example.Entity.Computer;
import org.example.Entity.Identification;
import org.example.Entity.OS;
import org.example.Entity.Processor;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

public class IHM {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("Computer_Jpa");
    EntityManager em = emf.createEntityManager();

    Scanner sc = new Scanner(System.in);


    public void start (){
        while (true){
            System.out.println("Menu : ");
            System.out.println("1/ cree");
            System.out.println("2/ afficher tout");
            System.out.println("3/ afficher par id");
            System.out.println("4/ supprimer");
            System.out.println("5/ editer");
            System.out.println("6/ create os");
            System.out.println("7/ create processor");
            System.out.println("8/ Show OS");
            int entry = sc.nextInt();
            sc.nextLine();
            switch (entry){
                case 1:
                    createComputer();
                    break;
                case 2:
                    getAllComputer();
                    break;
                case 3:
                    getComputerById();
                    break;
                case 4:
                    deleteComputer();
                    break;
                case 5:
                    editComputer();
                    break;
                case 6 :
                    createOs();
                    break;
                case 7 :
                    createProcessor();
                    break;
                case 8 :
                    showInfo();
                    break;
                default:
                    return;
            }
        }

    }

    private void createComputer (){

        Identification identification = Identification.builder().macAddress("Mon adresse imac").ipAddress("mon adresse ip").build();
        Processor processor = em.find(Processor.class,1);
        OS os = em.find(OS.class,1);
        Computer computer = Computer.builder().computerName("MyComputer").price(1200.50f).identification(identification).processor(processor).os(os).build();

        em.getTransaction().begin();
        em.persist(computer);
        em.getTransaction().commit();
    }

    private void getAllComputer (){
        Query query = em.createQuery("select c from Computer c");
        List computerList = query.getResultList();

        for (Object computer : computerList){
            System.out.println(computer);
        }
    }

    private void createOs (){
        OS os = OS.builder().osName("Windows").Version("10.12").build();
        em.getTransaction().begin();
        em.persist(os);
        em.getTransaction().commit();
    }

    private void createProcessor (){
        Processor processor = Processor.builder().heart(5).thread(8000).generation(7).build();
        em.getTransaction().begin();
        em.persist(processor);
        em.getTransaction().commit();
    }

    private Computer getComputerById (){
        System.out.println("id computer :");
        int id = sc.nextInt();
        sc.nextLine();

        Computer computer = em.find(Computer.class,id);
        if(computer != null){
            System.out.println(computer);
        }else {
            System.out.println("Computer not found");
        }
        return computer;
    }

    private void deleteComputer (){
        Computer computer = getComputerById();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        if(computer != null){
            em.remove(computer);
        }
        transaction.commit();
    }

    private void editComputer (){
        Computer computer = getComputerById();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        if(computer != null){
            computer.setComputerName("myComputer2");
            computer.setPrice(1000.99f);
        }
        transaction.commit();
    }

    private void showInfo (){
        OS os = em.find(OS.class,1);
        System.out.println( "Os found : "+os);
    }
}
