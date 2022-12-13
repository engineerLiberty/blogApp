package com.example.blogapp.controller;

import com.example.blogapp.dto.CommentDto;
import com.example.blogapp.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/comment")
@RequiredArgsConstructor
@RestController
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/commentOnPost")
    public ResponseEntity<CommentDto>commentOnPost(@RequestBody CommentDto commentDto){
        return new ResponseEntity<>(commentService.commentOnPost(commentDto), HttpStatus.CREATED);
    }
}
