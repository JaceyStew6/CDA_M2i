package org.example;

import org.example.Repository.EventRepository;
import org.example.Repository.TicketRepository;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class IHMEvent{
    private Scanner sc ;
    private EventRepository eventRepository;
    private TicketRepository ticketRepository;

    public IHMEvent(Scanner sc, EntityManager em) {
        this.sc = sc;
        eventRepository = new EventRepository(em);
        ticketRepository = new TicketRepository(em);
    }

    public void start(){

    }
}
