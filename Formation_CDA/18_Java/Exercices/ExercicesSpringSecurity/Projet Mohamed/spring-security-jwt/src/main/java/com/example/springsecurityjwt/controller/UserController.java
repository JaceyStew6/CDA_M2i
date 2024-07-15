package com.example.springsecurityjwt.controller;


import com.example.springsecurityjwt.dto.BaseResponseDto;
import com.example.springsecurityjwt.dto.UserLoginDto;
import com.example.springsecurityjwt.model.User;
import com.example.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public BaseResponseDto registerUser(@RequestBody User user) {
        if (userService.createUser(user)) {
            return new BaseResponseDto("Success");
        } else {
            return new BaseResponseDto("Failed");
        }
    }

    //On va faire toutes les opérations de vérification et si ok, donnera un token à la fin
    @PostMapping("/login")
    public BaseResponseDto loginUser(@RequestBody UserLoginDto userLoginDto) {
        if (userService.checkUserNameExist(userLoginDto.getEmail())) { //On vérifie l'existence du user
            if (userService.verifyUser(userLoginDto.getEmail(), userLoginDto.getPassword())) { //On vérifie que ses infos matchent
                Map<String, Object> data = new HashMap<>();
                data.put("token", userService.generateToken(userLoginDto.getEmail(), userLoginDto.getPassword())); //On génère le token après vérification
                return new BaseResponseDto("Success", data);
            } else {
                return new BaseResponseDto("Wrong password");
            }
        } else {
            return new BaseResponseDto("User doesn't exist");
        }
    }
}
