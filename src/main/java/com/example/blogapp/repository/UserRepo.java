package com.example.blogapp.repository;

import com.example.blogapp.dto.LikeDto;
import com.example.blogapp.enums.Role;
import com.example.blogapp.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<BlogUser,Long> {
    BlogUser findByUserIdAndRole(Long userId,String role);

   BlogUser findBlogUserByEmailAndPassword(String email, String password);

}
