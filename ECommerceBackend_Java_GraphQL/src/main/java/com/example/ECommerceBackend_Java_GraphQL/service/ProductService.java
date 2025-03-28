package com.example.ECommerceBackend_Java_GraphQL.service;


import com.example.ECommerceBackend_Java_GraphQL.dto.CreateProductDTO;
import com.example.ECommerceBackend_Java_GraphQL.dto.CreateProductVariant;
import com.example.ECommerceBackend_Java_GraphQL.entity.Product;
import com.example.ECommerceBackend_Java_GraphQL.entity.ProductVariant;
import com.example.ECommerceBackend_Java_GraphQL.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;


    @Transactional
    public Product createProduct(CreateProductDTO productDTO) {
        Product product = Product.builder()
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .category(productDTO.getCategory())
                .tags(productDTO.getTags())
                .build();


        List<CreateProductVariant> variants = productDTO.getVariants();

        List<ProductVariant> productVariants = variants.stream()
                .map(variant -> ProductVariant.builder()
                        .size(variant.getSize())
                        .color(variant.getColor())
                        .stockQuantity(variant.getStockQuantity())
                        .product(product)
                        .build())
                .collect(Collectors.toList());

        product.setVariants(productVariants);

        return productRepository.save(product);
    }
}
