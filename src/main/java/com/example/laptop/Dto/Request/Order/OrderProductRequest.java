package com.example.laptop.Dto.Request.Order;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderProductRequest {

    Long idCratItem;
    Long productVariantId;
    Integer quantity;
    String productCode;
    String productName;
    String productImage;
    BigDecimal priceAtOrderTime;
    String productColor;
}
