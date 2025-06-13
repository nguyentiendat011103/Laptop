package com.example.laptop.Dto.Request.Product.Create;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductOptionCreateRequest {

    @NotNull(message = "Option code must not be null")
    @Size(max = 50, message = "Option code must be at most 50 characters")
    String code;

    @NotNull(message = "Option price must not be null")
     BigDecimal price;

    @NotNull(message = "Product variants must not be null")
    @Valid
    List<ProductVariantCreateRequest> variants;

    String cpu;
    String gpu;
    String ram;
    String ramType;
    String ramSlot;
    String storage;
    String storageUpgrade;
    String displaySize;
    String displayResolution;
    String displayRefreshRate;
    String displayTechnology;
    String audioFeatures;
    String keyboard;
    String security;
    String webcam;
    String operatingSystem;
    String battery;
    String weight;
    String dimension;
    String wifi;
    String bluetooth;
    String ports;
    String specialFeatures;

}
