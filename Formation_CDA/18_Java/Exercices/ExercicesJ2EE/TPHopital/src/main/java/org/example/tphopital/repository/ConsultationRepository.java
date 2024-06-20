package org.example.tphopital.repository;

import org.example.tphopital.exception.NotFoundException;
import org.example.tphopital.model.Consultation;
import org.hibernate.Transaction;

import java.util.List;

public class ConsultationRepository extends BaseRepository<Consultation>{
    public ConsultationRepository() {
        super();
    }

    @Override
    public Consultation add(Consultation entity) {
        Transaction transaction= null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return entity;
    }

    @Override
    public Consultation findById(int id) {
        Consultation consultation = null;
        try {
            session = sessionFactory.openSession();
            consultation = session.get(Consultation.class, id);
            if (consultation == null){
                throw new NotFoundException("Consultation not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return consultation;
    }

    @Override
    public Consultation update(Consultation entity) {
        Transaction transaction = null;

        try {
            session= sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return entity;
    }

    @Override
    public boolean delete(Consultation entity) {
        Transaction transaction = null;
        boolean result = false;
        try {
            session= sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
            result = true;
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }

    public List<Consultation> findAllConsultations(){
        List<Consultation> consultations = null;
        try {
            session = sessionFactory.openSession();
            consultations = session.createQuery("from Consultation ").list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return consultations;
    }
}
