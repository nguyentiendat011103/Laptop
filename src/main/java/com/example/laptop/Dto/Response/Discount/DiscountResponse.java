package com.example.laptop.Dto.Response.Discount;



import com.example.laptop.Util.Enum.DiscountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountResponse {

    Long id;
    String code;
    String description;
    DiscountType discountType;
    BigDecimal discountValue;
    LocalDateTime startDate;
    Integer quantity;
    LocalDateTime endDate;
    Boolean isActive;
    Boolean isDeleted;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
