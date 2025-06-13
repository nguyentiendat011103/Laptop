package com.example.laptop.Dto.Response.Order;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderItemResponse {
    Long OrderItemId;
    Long ProductVariantId;
    String ProductCode;
    String ProductName;
    String ProductImageUrl;;
    Integer quantity;
    BigDecimal priceAtOrderTime;
    String productColor;
}
