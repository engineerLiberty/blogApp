package com.example.blogapp.service.serviceImpl;

import com.example.blogapp.dto.PostDto;
import com.example.blogapp.dto.PostResponseDto;
import com.example.blogapp.enums.Role;
import com.example.blogapp.model.BlogUser;
import com.example.blogapp.model.Post;
import com.example.blogapp.repository.PostRepo;
import com.example.blogapp.repository.UserRepo;
import com.example.blogapp.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepo postRepo;
    private final UserRepo blogUserRepo;

    @Override
    public PostResponseDto createPost(PostDto postDto) {
        PostResponseDto response = new PostResponseDto();
        Post post = new Post();
        BlogUser user = blogUserRepo.findByUserIdAndRole(postDto.getUserId(),Role.ADMIN.name());
        BeanUtils.copyProperties(postDto,post);
        post.setBlogUser(user);
        post =postRepo.save(post);
        BeanUtils.copyProperties(post,response);
        return response;
    }
}
