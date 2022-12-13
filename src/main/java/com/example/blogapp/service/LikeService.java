package com.example.blogapp.service;

import com.example.blogapp.dto.LikeDto;

public interface LikeService {
    void likePost(LikeDto likeDto);

    String unLikePost(LikeDto likeDto);
}
