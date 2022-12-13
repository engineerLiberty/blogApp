package com.example.blogapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blogUsers")
public class BlogUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(length = 20)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column(unique = true, length = 20)
    private String email;

    @Column(length = 10)
    private String password;

    private String role;

    @OneToMany(mappedBy = "blogUser",fetch = FetchType.EAGER)
    private List<Post> posts;



}
