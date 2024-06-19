package org.example.exercice6.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSession {

    private static StandardServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;

    private static SessionFactory getSessionFactory(){
        serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        return sessionFactory;
    }
}