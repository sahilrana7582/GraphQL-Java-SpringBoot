package com.example.ECommerceBackend_Java_GraphQL.dto;


import com.example.ECommerceBackend_Java_GraphQL.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProductVariant {

    private String size;
    private String color;
    private Integer stockQuantity;
    private Product product;
}
