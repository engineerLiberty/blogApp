package com.example.blogapp.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "anonymous")
public class AnonymousComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long anonymousId;
    private String comment;

    @CreationTimestamp
    private LocalDate commentTime;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;


}
