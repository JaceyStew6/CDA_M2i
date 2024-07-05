package com.example.Exercice06_Forum.dao;

import com.example.Exercice06_Forum.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
