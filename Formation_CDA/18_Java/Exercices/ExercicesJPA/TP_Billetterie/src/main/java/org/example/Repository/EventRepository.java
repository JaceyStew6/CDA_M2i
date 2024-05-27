package org.example.Repository;

import org.example.Entity.Event;

import javax.persistence.EntityManager;
import java.util.List;

public class EventRepository extends BaseRepository<Event> {

    public EventRepository(EntityManager em){
        super(em);
    }

    @Override
    public void save(Event element){
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Event element){
        em.getTransaction().begin();
        em.remove(element);
        em.getTransaction().commit();
    }

    @Override
    public Event findById(int event_id){
        return em.find(Event.class, event_id);
    }

    @Override
    public List<Event> findAll(){
        return em.createQuery("SELECT e from Event e").getResultList();
    }
}
