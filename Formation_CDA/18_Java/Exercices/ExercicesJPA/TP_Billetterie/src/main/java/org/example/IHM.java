package org.example;

import org.example.Entity.Client;
import org.example.Entity.Event;
import org.example.Entity.Ticket;
import org.example.Repository.ClientRepository;
import org.example.Repository.TicketRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class IHM {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticketing_jpa");
    EntityManager em = emf.createEntityManager();
    TicketRepository ticketRepository;
    ClientRepository clientRepository;
    Scanner sc;


    public IHM() {
        ticketRepository = new TicketRepository(em);
        clientRepository = new ClientRepository(em);
        sc = new Scanner(System.in);
    }

    public void start(){
        while (true){
            System.out.println("Menu : ");
            System.out.println("1/ Acheter un billet");
            System.out.println("2/ Créer un événement");
            System.out.println("3/ Afficher tous les événements");
            System.out.println("4/ Créer un profil utilisateur");
            int entry = sc.nextInt();
            sc.nextLine();
            switch (entry){
                case 1:
                    createTicket();
                    break;
                case 2:
                    IHMEvent ihmEvent = new IHMEvent(sc,em);
                    ihmEvent.start();
                    break;
                case 3:
                    getAllEvents();
                    break;
                case 4:
                    IHMClient ihmClient = new IHMClient(sc,em);
                    ihmClient.start();
                    break;
                default:
                    return;
            }
        }
    }

    private void createTicket(){
        Client client = em.find(Client.class,1);
        Event event = em.find(Event.class,1);
        //TODO Terminer le builder
        Ticket ticket = Ticket.builder().build();
        ticketRepository.save(ticket);
    }


    private void getAllEvents(){

    }


}
