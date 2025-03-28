package com.example.ECommerceBackend_Java_GraphQL.service;


import com.example.ECommerceBackend_Java_GraphQL.dto.*;
import com.example.ECommerceBackend_Java_GraphQL.entity.*;
import com.example.ECommerceBackend_Java_GraphQL.repository.AddressRepository;
import com.example.ECommerceBackend_Java_GraphQL.repository.ProductRepository;
import com.example.ECommerceBackend_Java_GraphQL.repository.UserProfileRepository;
import com.example.ECommerceBackend_Java_GraphQL.repository.UserRepository;
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

    @Autowired
    private final UserRepository userRepository;


    @Autowired
    private final UserProfileRepository userProfileRepository;

    @Autowired
    private final AddressRepository addressRepository;


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



    @Transactional
    public User createUser(CreateUserDTO createUserDTO) {


        UserProfileDTO userProfileDTO = createUserDTO.getUserProfile();
        AddressDTO addressDTO = userProfileDTO.getAddress();

        User user = User.builder()
                .username(createUserDTO.getUsername())
                .role(createUserDTO.getRole())
                .password(createUserDTO.getPassword())
                .build();


        UserProfile userProfile = UserProfile.builder()
                .firstName(userProfileDTO.getFirstName())
                .lastName(userProfileDTO.getLastName())
                .email(userProfileDTO.getEmail())
                .phone(userProfileDTO.getPhone())
                .age(userProfileDTO.getAge())
                .build();


        Address address = Address.builder()
                .street(addressDTO.getStreet())
                .city(addressDTO.getCity())
                .state(addressDTO.getState())
                .zipCode(addressDTO.getZipCode())
                .country(addressDTO.getCountry())
                .build();





        userProfile.setAddress(
                addressRepository.save(address)
        );
        user.setUserProfile(
                userProfileRepository.save(userProfile)
        );
        return userRepository.save(user);



    }
}
