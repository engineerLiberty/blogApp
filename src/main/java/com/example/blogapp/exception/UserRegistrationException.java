package com.example.blogapp.exception;

public class UserRegistrationException extends RuntimeException{

    public UserRegistrationException(String message){
        super(message);
    }
}
