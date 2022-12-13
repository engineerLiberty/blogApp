package com.example.blogapp.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.security.PrivateKey;



@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String commentBody;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;
}
