package com.example.ECommerceBackend_Java_GraphQL.dto;


import com.example.ECommerceBackend_Java_GraphQL.entity.ProductCategory;
import com.example.ECommerceBackend_Java_GraphQL.entity.ProductVariant;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductDTO {

    private String name;
    private String description;
    private Float price;
    private ProductCategory category;
    private List<String> tags;
    private List<CreateProductVariant> variants;

}
