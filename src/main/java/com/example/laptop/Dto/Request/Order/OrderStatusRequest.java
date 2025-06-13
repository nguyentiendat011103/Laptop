package com.example.laptop.Dto.Request.Order;

import com.example.laptop.Util.Enum.OrderStatus;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter
public class OrderStatusRequest {
    private OrderStatus status;
}
