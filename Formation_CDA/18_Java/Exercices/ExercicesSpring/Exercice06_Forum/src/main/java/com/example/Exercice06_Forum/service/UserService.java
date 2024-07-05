package com.example.Exercice06_Forum.service;

import com.example.Exercice06_Forum.dao.UserRepository;
import com.example.Exercice06_Forum.entity.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private HttpSession _httpSession;

    @Autowired
    UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(int id) {

    }



}



/*
    public boolean login(String username, String password) {
        if (username.equals(LOGIN) && password.equals(PASSWORD)) {
            _httpSession.setAttribute("login", "OK");
            return true;
        }
        return false;
    }

    public boolean isLogged(){
        try {
            String attrIsLogged = _httpSession.getAttribute("login").toString();
            return attrIsLogged.equals("OK");
        } catch (Exception e) {
            return false;
        }
    }

    public void logout() {
        _httpSession.removeAttribute("login");
    }

    // Method to add a new user
    public boolean addUser(String username, String password) {
        try {
            User newUser = new User(username, password);
            userRepository.save(newUser);
            _httpSession.setAttribute("user", newUser); // Store user information in session
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}*/
