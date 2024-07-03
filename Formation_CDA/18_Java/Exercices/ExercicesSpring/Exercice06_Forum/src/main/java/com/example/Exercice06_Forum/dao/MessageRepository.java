package com.example.Exercice06_Forum.dao;

import com.example.Exercice06_Forum.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
