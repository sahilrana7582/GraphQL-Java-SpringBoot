package com.example.ECommerceBackend_Java_GraphQL.controller;


import com.example.ECommerceBackend_Java_GraphQL.dto.CreateProductDTO;
import com.example.ECommerceBackend_Java_GraphQL.dto.CreateUserDTO;
import com.example.ECommerceBackend_Java_GraphQL.entity.Product;
import com.example.ECommerceBackend_Java_GraphQL.entity.User;
import com.example.ECommerceBackend_Java_GraphQL.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @MutationMapping
    public Product createProduct(
            @Argument CreateProductDTO input
    ) {
        return productService.createProduct(input);
    }


    @MutationMapping
    public User createUser(
            @Argument("input") CreateUserDTO createUserDTO
            ) {

        if (createUserDTO == null) {
            throw new IllegalArgumentException("CreateUserDTO cannot be null");
        }
        return productService.createUser(createUserDTO);
    }
}
