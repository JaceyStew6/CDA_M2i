package com.example.springsecurityjwt.controller;


import com.example.springsecurityjwt.dto.BaseResponseDto;
import com.example.springsecurityjwt.model.User;
import com.example.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public BaseResponseDto registerUser(@RequestBody User user){
        if(userService.createUser(user)){
            return new BaseResponseDto("Success");
        }else{
            return new BaseResponseDto("Failed");
        }
    }




}
