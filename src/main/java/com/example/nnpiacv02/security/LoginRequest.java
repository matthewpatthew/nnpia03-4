package com.example.nnpiacv02.security;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginRequest {

    private String username;
    private String password;
}
