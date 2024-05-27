package org.example.Repository;

import org.example.Entity.Client;
import org.example.Entity.Ticket;

import javax.persistence.EntityManager;
import java.util.List;

public class TicketRepository extends BaseRepository<Ticket> {

    public TicketRepository(EntityManager em){
        super(em);
    }

    @Override
    public void save(Ticket element){
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Ticket element){
        em.getTransaction().begin();
        em.remove(element);
        em.getTransaction().commit();
    }

    @Override
    public Ticket findById(int ticket_id){
        return em.find(Ticket.class, ticket_id);
    }

    @Override
    public List<Ticket> findAll(){
        return em.createQuery("SELECT t from Ticket t").getResultList();
    }
}
