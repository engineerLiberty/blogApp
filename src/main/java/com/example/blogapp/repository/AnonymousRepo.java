package com.example.blogapp.repository;

import com.example.blogapp.model.AnonymousComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnonymousRepo extends JpaRepository<AnonymousComment,Long> {
}
