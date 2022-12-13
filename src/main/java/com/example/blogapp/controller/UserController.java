package com.example.blogapp.controller;


import com.example.blogapp.dto.LogInDto;
import com.example.blogapp.dto.UserDto;
import com.example.blogapp.model.BlogUser;
import com.example.blogapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService service;


    @PostMapping("/createAdmin")
    public ResponseEntity<BlogUser> createAdmin(@RequestBody UserDto userDto) {

        return new ResponseEntity<>(service.createAdmin(userDto), HttpStatus.CREATED);
    }

    @PostMapping("/createCustomer")
    public ResponseEntity<BlogUser> createCustomer(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(service.createCustomer(userDto), HttpStatus.CREATED);
    }

    @PostMapping("/logIn")
    public ResponseEntity<String> logIn(@RequestBody LogInDto logInDto) {
        service.logIn(logInDto);
        return new ResponseEntity<>("Login was successful", HttpStatus.ACCEPTED);
    }


    @PostMapping("/editRegistration")
    public ResponseEntity<String> editRegistration(@RequestBody UserDto userDto) {
        service.editSignUpDetail(userDto);
        return new ResponseEntity<>("Details updated successfully", HttpStatus.ACCEPTED);
    }
}
