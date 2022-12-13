package com.example.blogapp.dto;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}

//{"firstName":"Liberty2",
//
//        "lastName":"Austine",
//
//        "email":"lib@gmail.com",
//
//        "password":"1234"
//        }

//{
//        "userId": 8,
//        "firstName": "Liberty2",
//        "lastName": "Austine",
//        "email": "lib@gmail.com",
//        "password": "1234",
//        "role": "CUSTOMER"
//        }