package com.example.laptop.Dto.Response.Cart;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartItemResponse {

    Long id;
    Long variantId;
    String productName;
    String productCode;
    String cpu;
    String ram;
    String storage;
    String gpu;
    String color;
    BigDecimal basePrice;
    String imageUrl;
    Integer quantity;


    public CartItemResponse(
            Long id, Long variantId, String productName, String productCode, String cpu, String ram,
            String storage, String gpu, String color, BigDecimal basePrice, BigDecimal priceDiff, String imageUrl, Integer quantity) {
        this.id = id;
        this.variantId = variantId;
        this.productName = productName;
        this.productCode = productCode;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.color = color;
        this.basePrice = basePrice.add(priceDiff);
        this.imageUrl = imageUrl;
        this.quantity = quantity;
    }
}
