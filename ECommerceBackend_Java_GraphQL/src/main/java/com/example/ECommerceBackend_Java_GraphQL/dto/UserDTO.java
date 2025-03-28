package com.example.ECommerceBackend_Java_GraphQL.dto;

import com.example.ECommerceBackend_Java_GraphQL.entity.UserRole;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String username;
    private String password;
    private String email;
    private UserRole role;
}
