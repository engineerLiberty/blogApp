package com.example.blogapp.service.serviceImpl;

import com.example.blogapp.dto.CommentDto;
import com.example.blogapp.model.Comment;
import com.example.blogapp.model.Post;
import com.example.blogapp.repository.CommentRepo;
import com.example.blogapp.repository.PostRepo;
import com.example.blogapp.service.CommentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@RequiredArgsConstructor

public class CommentServiceImpl  implements CommentService {

    private final PostRepo postRepo;
    private final CommentRepo commentRepo;


    @Override
    public CommentDto commentOnPost(CommentDto commentDto) {
        Post post = postRepo.findById(commentDto.getPostId()).get();
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDto,comment);
        comment.setPost(post);
        commentRepo.save(comment);

        return commentDto;
    }
}
