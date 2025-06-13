package com.example.laptop.Dto.Response.Brand;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BrandResponse {

    Long id;
    String name;
    String description;
    String logoUrl;
    String countryName;
    Integer count;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
