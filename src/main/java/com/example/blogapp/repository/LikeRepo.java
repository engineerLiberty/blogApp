package com.example.blogapp.repository;

import com.example.blogapp.dto.LikeDto;
import com.example.blogapp.model.BlogUser;
import com.example.blogapp.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepo extends JpaRepository<Like,Long> {

    Like findByUser(BlogUser user);
}
