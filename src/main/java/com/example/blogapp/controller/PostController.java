package com.example.blogapp.controller;

import com.example.blogapp.dto.PostDto;
import com.example.blogapp.dto.PostResponseDto;
import com.example.blogapp.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@AllArgsConstructor
public class PostController {
    private final PostService service;

    @PostMapping ("/creatPost")
    public ResponseEntity<PostResponseDto>createPost(@RequestBody PostDto postDto){
        return new ResponseEntity<>(service.createPost(postDto), HttpStatus.CREATED);
    }
}
