package com.example.laptop.Dto.Response.Cart;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QuantityChange {
    Long idCartItem;
    Integer quantity;
    String result;
}
