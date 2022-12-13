package com.example.blogapp.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class LikeDto {
    private  Long postId;
    private Long userId;
}
