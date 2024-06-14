package org.example.exercice6.repository;

import org.example.exercice6.model.User;
import org.hibernate.Session;

import java.util.List;

public class UserRepository extends Repository<User> {
    public UserRepository(Session session) {
        super(session);
    }

    @Override
    User findById(int id) {
        return (User) _session.get(User.class, id);
    }

    @Override
    List<User> findAll() {
        return _session.createQuery("from User").list();
    }
}
