package com.example.blogapp.dto;

import lombok.Data;

@Data
public class AnonymousCommentDto {
    private Long postId;
    private String comment;
}
