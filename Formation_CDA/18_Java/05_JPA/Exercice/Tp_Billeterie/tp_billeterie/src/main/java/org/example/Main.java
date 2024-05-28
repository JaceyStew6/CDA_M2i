package org.example;

import com.mysql.cj.xdevapi.Client;
import org.example.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp_billeterie");

    public static void main(String[] args) {

        System.out.println("Tp Billeterie");

        EntityManager em = emf.createEntityManager();

        /*
        em.getTransaction().begin();

        Address address = Address.builder().city("ma ville").street("ma rue").build();
        System.out.println("ID avant persist"+address.getId());
        em.persist(address);
        System.out.println("ID apres persist"+address.getId());

        em.getTransaction().commit();

        Address address1 = em.find(Address.class,2);
        System.out.println(address1.toString());

         */

        /*
        em.getTransaction().begin();
        Location location = Location.builder().city("Tourcoing").street("rue de lens").capacity(255).build();
        System.out.println("ID avant persist"+location.getId());
        em.persist(location);
        System.out.println("ID apres persist"+location.getId());

        em.getTransaction().commit();

         */

        /*
        em.getTransaction().begin();

        Customer customer = Customer.builder().age(42).firstName("toto").lastName("tata").phoneNumber("0123456789").address(em.find(Address.class,2)).build();
        System.out.println("ID avant persist"+customer.getId());
        em.persist(customer);
        System.out.println("ID apres persist"+customer.getId());

        em.getTransaction().commit();

         */

        /*
        em.getTransaction().begin();


        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        SimpleDateFormat outputFormat = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm", Locale.FRENCH);

        System.out.println("Veuillez saisir la date de l'event : (format : dd/MM/yyyy)");
        String dateSaisie = scanner.nextLine();

        System.out.println("Veuillez saisir l'heure de l'event : (format : HH:mm)");
        String heureSaisie = scanner.nextLine();

        String dateHeureSaisie = dateSaisie+" "+heureSaisie;

        try {
            Date date = dateFormat.parse(dateHeureSaisie);
            System.out.println("DAte et heure saisie : "+date);
            String dateLisible = outputFormat.format(date);
            System.out.println("Date et heure saisie lisible :"+dateLisible);
            Event event = Event.builder().name("event1").numberOfPlace(45).dateAndHours(date).location(em.find(Location.class,4)).build();
            em.persist(event);
        }catch (ParseException e){
            System.out.println("Date ou heure saisie invalide !!!!");
        }


        em.getTransaction().commit();

         */

        em.getTransaction().begin();

        Ticket ticket = Ticket.builder().placeNumber(89).placeType(PlaceType.VIP).event(em.find(Event.class,6)).customer(em.find(Customer.class,5)).build();
        em.persist(ticket);



        em.getTransaction().commit();


        em.close();
        emf.close();

    }
}