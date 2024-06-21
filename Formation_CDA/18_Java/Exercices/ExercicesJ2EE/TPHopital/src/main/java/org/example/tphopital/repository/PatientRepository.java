package org.example.tphopital.repository;

import org.example.tphopital.exception.NotFoundException;
import org.example.tphopital.model.Patient;
import org.hibernate.Transaction;

import java.util.List;

public class PatientRepository extends BaseRepository<Patient>{

    public PatientRepository() {
        super();
    }

    @Override
    public Patient add(Patient entity) {
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
    public Patient findById(int id) {
        Patient patient = null;
        try {
            session = sessionFactory.openSession();
            patient = session.get(Patient.class, id);
            if (patient == null){
                throw new NotFoundException("Patient not found");
            }
            //Permet de charger les consultations du patient en mémoire pour éviter les LazyInitializationException
            // lors de l'affichage des consultations et du détail d'un patient
            patient.getConsultations().size();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return patient;
    }

    @Override
    public Patient update(Patient entity) {
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
    public boolean delete(Patient entity) {
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

    public List<Patient> findAllPatients(){
        List<Patient> patients = null;
        try {
            session = sessionFactory.openSession();
            patients = session.createQuery("from Patient").list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return patients;
    }
}



