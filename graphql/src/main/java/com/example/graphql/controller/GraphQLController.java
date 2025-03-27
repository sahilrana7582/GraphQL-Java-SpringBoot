package com.example.graphql.controller;


import com.example.graphql.dto.UserDTO;
import com.example.graphql.entity.User;
import com.example.graphql.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class GraphQLController {

    private final UserService userService;

    @QueryMapping
    public UserDTO getUserById(@Argument String id) {
        return userService.getUserById(id);
    }

    @QueryMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @MutationMapping
    public UserDTO createUser(
            @Argument String username,
            @Argument String email,
            @Argument String password,
            @Argument User.UserRole role
    ) {
        return userService.createUser(username, email, password, role);
    }




}
