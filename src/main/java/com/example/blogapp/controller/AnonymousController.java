package com.example.blogapp.controller;

import com.example.blogapp.dto.AnonymousCommentDto;
import com.example.blogapp.service.AnonymousService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anonymous")
@RequiredArgsConstructor
public class AnonymousController {
    private final AnonymousService anonymousService;

    @PostMapping("/anonymousComment")
    public ResponseEntity<String>createAnonymousComment(@RequestBody AnonymousCommentDto anonymousCommentDto){
        anonymousService.anonymousComment(anonymousCommentDto);
        return new ResponseEntity<>("Comment created successfully", HttpStatus.CREATED);
    }

}
