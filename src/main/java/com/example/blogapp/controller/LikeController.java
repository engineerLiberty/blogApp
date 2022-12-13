package com.example.blogapp.controller;


import com.example.blogapp.dto.LikeDto;
import com.example.blogapp.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/like")
public class LikeController {

    private  final LikeService likeService;

    @PostMapping("/likePost")
    public ResponseEntity<String> likePost(@RequestBody LikeDto likeDto){

        likeService.likePost(likeDto);
        return new ResponseEntity<>("you liked this post",HttpStatus.OK);
    }

    @PostMapping("/unlikePost")
    public ResponseEntity<String>unlikePost(LikeDto likeDto){
        likeService.unLikePost(likeDto);
        return new ResponseEntity<>("You have unlike a post", HttpStatus.ACCEPTED);
    }
}
