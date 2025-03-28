package com.example.ECommerceBackend_Java_GraphQL.repository;

import com.example.ECommerceBackend_Java_GraphQL.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
