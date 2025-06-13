package com.example.laptop.Dto.Request.Account;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserAccountRequest {

    Long id;
    String username;
    String email;
    BigDecimal balance;
    LocalDate vipExpiry;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
