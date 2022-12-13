package com.example.blogapp.service;

import com.example.blogapp.dto.CommentDto;

public interface CommentService {
    CommentDto commentOnPost(CommentDto commentDto);
}
