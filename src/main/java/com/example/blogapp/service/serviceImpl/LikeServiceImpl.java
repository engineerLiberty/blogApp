package com.example.blogapp.service.serviceImpl;

import com.example.blogapp.dto.LikeDto;
import com.example.blogapp.enums.Role;
import com.example.blogapp.exception.InvalidUserException;
import com.example.blogapp.model.BlogUser;
import com.example.blogapp.model.Like;
import com.example.blogapp.model.Post;
import com.example.blogapp.repository.LikeRepo;
import com.example.blogapp.repository.PostRepo;
import com.example.blogapp.repository.UserRepo;
import com.example.blogapp.service.LikeService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class LikeServiceImpl implements LikeService {

    private final PostRepo postRepo;
    private final LikeRepo likeRepo;
    private final UserRepo userRepo;


    @Override
    public void likePost(LikeDto likeDto) {

        Like like = new Like();
        BlogUser user = userRepo.findById(likeDto.getUserId()).orElseThrow(()->new InvalidUserException("User not Found"));
        like.setUser(user);
        likeRepo.save(like);
        Post post = postRepo.findById(likeDto.getPostId()).orElseThrow(()-> new InvalidUserException("Invalid user"));
        like.setPost(post);
        post.getLikes().add(like);
        postRepo.save(post);
    }

    @Override
    public String unLikePost(LikeDto likeDto){

        BlogUser user = userRepo.findById(likeDto.getUserId()).orElseThrow(()-> new InvalidUserException("User not Found"));

        Like like = likeRepo.findByUser(user);

        Post post = postRepo.findById(likeDto.getPostId()).orElseThrow(()->new InvalidUserException("Invalid user"));

        List<Like>postLikes = new ArrayList<>();

        for (int i = 0 ; i < postLikes.size(); i++){

            if (postLikes.get(i).equals(like)){

                postLikes.remove(i);
            }
        }
        postRepo.save(post);

        return  "Unlike was successful";
    }
}



