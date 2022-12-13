package com.example.blogapp.service.serviceImpl;

import com.example.blogapp.dto.AnonymousCommentDto;
import com.example.blogapp.model.AnonymousComment;
import com.example.blogapp.model.Post;
import com.example.blogapp.repository.AnonymousRepo;
import com.example.blogapp.repository.PostRepo;
import com.example.blogapp.service.AnonymousService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnonymousCImpl implements AnonymousService {

    private final AnonymousRepo anonymousRepo;
    private final PostRepo postRepo;
    @Override
    public AnonymousCommentDto anonymousComment(AnonymousCommentDto anonymousCommentDto) {
        Post post = postRepo.findById(anonymousCommentDto.getPostId()).get();
        AnonymousComment anonymousComment = new AnonymousComment();
        anonymousComment.setPost(post);
        BeanUtils.copyProperties(anonymousCommentDto,anonymousComment);
        anonymousRepo.save(anonymousComment);
        return anonymousCommentDto;
    }
}
