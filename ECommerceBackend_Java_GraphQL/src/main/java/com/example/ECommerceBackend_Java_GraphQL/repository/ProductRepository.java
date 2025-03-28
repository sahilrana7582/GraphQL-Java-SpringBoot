package com.example.ECommerceBackend_Java_GraphQL.repository;


import com.example.ECommerceBackend_Java_GraphQL.entity.Product;
import com.example.ECommerceBackend_Java_GraphQL.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    List<Product> findByCategory(ProductCategory category);
}
