package org.example;

import org.example.Entity.Client;
import org.example.Repository.ClientRepository;
import org.example.Repository.EventRepository;
import org.example.Repository.TicketRepository;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class IHMClient {

    private Scanner sc ;
    private ClientRepository clientRepository;
    private TicketRepository ticketRepository;

    public IHMClient(Scanner sc, EntityManager em) {
        this.sc = sc;
        clientRepository = new ClientRepository(em);
        ticketRepository = new TicketRepository(em);
    }

    public void start(){

    }
}
