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
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductCreateRequest {

    @NotNull(message = "Product name must not be null")
    @Size(max = 255, message = "product namr must be at most 255 characters")
    String name;
    String description;

    @NotNull(message = "Category ID must not be null")
    Long categoryId;

    @NotNull(message = "Brand ID must not be null")
    Long brandId;

    @NotNull(message = "Images must not be null")
    List<MultipartFile> imageThumbnails;

    @NotNull(message = "Product options must not be null")
    @Valid
    List<ProductOptionCreateRequest> options;
}
