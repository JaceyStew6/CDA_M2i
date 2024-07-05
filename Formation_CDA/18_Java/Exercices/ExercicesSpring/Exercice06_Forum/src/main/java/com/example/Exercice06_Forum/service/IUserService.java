package com.example.Exercice06_Forum.service;

import com.example.Exercice06_Forum.entity.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);
    User getUserById(int id);
    void deleteUser(int id);
}
