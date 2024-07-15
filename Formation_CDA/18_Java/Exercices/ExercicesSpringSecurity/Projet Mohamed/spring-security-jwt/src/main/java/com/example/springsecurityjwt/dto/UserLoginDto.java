package com.example.springsecurityjwt.dto;

import lombok.Data;

@Data
public class UserLoginDto {
    //Ne va contenir que ce dont on a besoin pour se logger

    private String email;
    private String password;
}
