package com.example.blogapp.service;

import com.example.blogapp.dto.PostDto;
import com.example.blogapp.dto.PostResponseDto;
import com.example.blogapp.model.Post;

public interface PostService {
    PostResponseDto createPost(PostDto postDto);
}
