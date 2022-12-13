package com.example.blogapp.service.serviceImpl;

import com.example.blogapp.dto.LogInDto;
import com.example.blogapp.dto.UserDto;
import com.example.blogapp.enums.Role;
import com.example.blogapp.model.BlogUser;
import com.example.blogapp.repository.UserRepo;
import com.example.blogapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceIpImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public BlogUser createAdmin(UserDto userDto) {
        BlogUser admin = new BlogUser();
        admin.setRole(Role.ADMIN.name());
       BeanUtils.copyProperties(userDto,admin);
        return userRepo.save(admin);
    }

    @Override
    public BlogUser createCustomer(UserDto userDto){
        BlogUser customer = new BlogUser();
        customer.setRole(Role.BLOG_USER.name());
        BeanUtils.copyProperties(userDto,customer);
        return  userRepo.save(customer);
    }

    @Override
    public BlogUser logIn(LogInDto logInDto){
        BlogUser user = userRepo.findBlogUserByEmailAndPassword(logInDto.getEmail(),logInDto.getPassword());
        BeanUtils.copyProperties(logInDto,user);
        return userRepo.save(user);

    }

    @Override
    public BlogUser editSignUpDetail(UserDto userDto){
        BlogUser user = userRepo.findBlogUserByEmailAndPassword(userDto.getEmail(),userDto.getPassword());
        BeanUtils.copyProperties(userDto,user);
        return userRepo.save(user);
    }
}
