package com.example.blogapp.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PostDto {
    private Long userId;
    private String productName;

    private double price;

    private String category;

}
