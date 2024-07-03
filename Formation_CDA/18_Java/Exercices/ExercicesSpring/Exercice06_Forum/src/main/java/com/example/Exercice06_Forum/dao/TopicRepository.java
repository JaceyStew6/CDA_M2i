package com.example.Exercice06_Forum.dao;

import com.example.Exercice06_Forum.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
}
