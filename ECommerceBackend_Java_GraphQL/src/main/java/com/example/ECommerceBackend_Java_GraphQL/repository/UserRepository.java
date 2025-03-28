package com.example.ECommerceBackend_Java_GraphQL.repository;

import com.example.ECommerceBackend_Java_GraphQL.entity.Address;
import com.example.ECommerceBackend_Java_GraphQL.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
