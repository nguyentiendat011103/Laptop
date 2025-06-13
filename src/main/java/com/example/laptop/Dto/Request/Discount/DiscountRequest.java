package com.example.laptop.Dto.Request.Discount;


import com.example.laptop.Util.Enum.DiscountType;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class DiscountRequest {

    @NotNull(message = "Product ID is required")
    String code;

    String  description;

    @NotNull(message = "Discount type is required")
    DiscountType discountType;

    @NotNull(message = "Discount value is required")
    BigDecimal discountValue;

    @NotNull(message = "Start date is required")
    LocalDateTime startDate;

    @NotNull(message = "End date is required")
    LocalDateTime endDate;

    @NotNull(message = "Quantity is required")
    Integer quantity;

    @NotNull(message = "Is active is required")
    Boolean isActive;


}
