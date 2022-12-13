package com.example.blogapp.dto;

import lombok.Data;
import org.aspectj.weaver.tools.Trace;

@Data
public class LogInDto {
    private String email;
    private String password;
}
