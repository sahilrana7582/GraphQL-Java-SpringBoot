package com.example.ECommerceBackend_Java_GraphQL.repository;

import com.example.ECommerceBackend_Java_GraphQL.entity.Address;
import com.example.ECommerceBackend_Java_GraphQL.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
