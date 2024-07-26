package org.example.tp_spring_react.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<TPost, TGet> {
    TGet create(TPost post);

    TGet update(int id, TPost post);

    boolean delete(int id);

    TGet findById(int id);

    List<TGet> findAll();
}
