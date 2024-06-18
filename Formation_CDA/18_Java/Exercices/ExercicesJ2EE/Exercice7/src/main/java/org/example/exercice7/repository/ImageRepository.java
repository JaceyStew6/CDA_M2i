package org.example.exercice7.repository;

import org.example.exercice7.exception.NotFoundException;
import org.example.exercice7.model.Image;
import org.hibernate.Transaction;
import org.hibernate.annotations.NotFound;

import java.util.List;

public class ImageRepository extends BaseRepository<Image> {

    public ImageRepository() {
        super();
    }


    @Override
    public Image add(Image entity) {
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
        return entity;
    }

    @Override
    public Image finfById(int id) {
        Image image = null;

        try {
            session = sessionFactory.openSession();
            image = session.get(Image.class, id);
            if (image == null){
                throw new NotFoundException("Image not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return image;
    }

    @Override
    public Image update(Image entity) {
        return null;
    }

    @Override
    public boolean delete(Image entity) {
        return false;
    }

    public List<Image> findAll(){
        List<Image> images = null;
        try {
            session = sessionFactory.openSession();
            images= session.createQuery("from Image ").list();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return images;

    }
}