package com.example.blogapp.service;

import com.example.blogapp.dto.LogInDto;
import com.example.blogapp.dto.UserDto;
import com.example.blogapp.model.BlogUser;

public interface UserService {
    BlogUser createAdmin(UserDto userDto);

    BlogUser createCustomer(UserDto userDto);

    BlogUser logIn(LogInDto logInDto);

    BlogUser editSignUpDetail(UserDto userDto);
}
