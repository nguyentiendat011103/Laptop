package com.example.laptop.Dto.Response.Order;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class RevenueYear {
    private Integer year;
    private BigDecimal revenueInYear;
}
