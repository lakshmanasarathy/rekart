package com.example.rekart.dto;

public record AuthResponse(
        String token,
        String tokenType,
        String username,
        String role
) {
}