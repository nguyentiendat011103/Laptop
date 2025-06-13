package com.example.laptop.Dto.Request.Account;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterRequest {

    @NotBlank
    String name;

    @Email
    @NotBlank
    String email;

    @NotBlank
    String password;

    @NotBlank
    String fullName;

}
