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
public class RevenueMonth {
    private int month;
    private BigDecimal totalRevenue;
    private Long laptops;
    private Integer customers;

    public RevenueMonth(int month, BigDecimal totalRevenue, Long laptops) {
        this.month = month;
        this.totalRevenue = totalRevenue;
        this.laptops = laptops;
    }
}
