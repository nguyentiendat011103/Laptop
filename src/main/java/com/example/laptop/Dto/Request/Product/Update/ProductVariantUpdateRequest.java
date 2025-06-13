package com.example.laptop.Dto.Request.Product.Update;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductVariantUpdateRequest {

    private Long id;

    @NotNull(message = "Color must not be null")
    @Size(max = 50, message = "Color must be at most 50 characters")
    String color;

    BigDecimal priceDiff;

    @NotNull(message = "Stock must not be null")
    Integer stock;

    MultipartFile image;
}
