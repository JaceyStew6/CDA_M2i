package org.example.tphopital.repository;

import org.example.tphopital.exception.NotFoundException;
import org.example.tphopital.model.CareSheet;
import org.hibernate.Transaction;

import java.util.List;

public class CareSheetRepository extends BaseRepository<CareSheet> {
    public CareSheetRepository() {
        super();
    }

    @Override
    public CareSheet add(CareSheet entity) {
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
    public CareSheet findById(int id) {
        CareSheet careSheet = null;
        try {
            session = sessionFactory.openSession();
            careSheet = session.get(CareSheet.class, id);
            if (careSheet == null){
                throw new NotFoundException("Care sheet not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return careSheet;
    }

    @Override
    public CareSheet update(CareSheet entity) {
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
    public boolean delete(CareSheet entity) {
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

    public List<CareSheet> findAllCareSheets(){
        List<CareSheet> careSheets = null;
        try {
            session = sessionFactory.openSession();
            careSheets = session.createQuery("from CareSheet ").list();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return careSheets;
    }
}
