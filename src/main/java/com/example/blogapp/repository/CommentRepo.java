package com.example.blogapp.repository;

import com.example.blogapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,Long> {

//    echo "# blogApp" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin git@github.com:engineerLiberty/blogApp.git
//    git push -u origin main
}
