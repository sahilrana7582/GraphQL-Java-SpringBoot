package com.example.ECommerceBackend_Java_GraphQL.dto;


import com.example.ECommerceBackend_Java_GraphQL.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserDTO {

    private String username;
    private String password;
    private UserRole role;
    private UserProfileDTO userProfile;
}
