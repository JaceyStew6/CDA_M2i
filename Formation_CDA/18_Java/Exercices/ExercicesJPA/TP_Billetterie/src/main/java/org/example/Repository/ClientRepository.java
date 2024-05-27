package org.example.Repository;

import org.example.Entity.Client;
import org.example.Entity.Event;

import javax.persistence.EntityManager;
import java.util.List;

public class ClientRepository extends BaseRepository<Client> {

    public ClientRepository(EntityManager em){
        super(em);
    }

    @Override
    public void save(Client element){
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Client element){
        em.getTransaction().begin();
        em.remove(element);
        em.getTransaction().commit();
    }

    @Override
    public Client findById(int client_id){
        return em.find(Client.class, client_id);
    }

    @Override
    public List<Client> findAll(){
        return em.createQuery("SELECT c from Client c").getResultList();
    }
}
