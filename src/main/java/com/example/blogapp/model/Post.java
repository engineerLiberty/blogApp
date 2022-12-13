package com.example.blogapp.model;

import com.example.blogapp.enums.Role;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name ="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String productName;

    private double price;

    private String category;


    @CreationTimestamp
    private LocalDate postDate;




    @OneToMany(mappedBy = "post",fetch = FetchType.LAZY)
    private List<Comment>comments = new ArrayList<>();

    @OneToMany(mappedBy = "post",fetch = FetchType.LAZY)
    private List<Like>likes = new ArrayList<>();

    @OneToMany(mappedBy = "post",fetch = FetchType.LAZY)
    private List<AnonymousComment> anonymousComment;


    @ManyToOne
    @JoinColumn(name = "userId")
    private BlogUser blogUser;

//       @JoinColumn(name = "columnId",referencedColumnName = "userId",nullable = false)




}
