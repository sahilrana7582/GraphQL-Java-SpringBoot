package com.example.ECommerceBackend_Java_GraphQL.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProfileDTO {

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String phone;
    private AddressDTO address;

}
