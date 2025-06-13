package com.example.laptop.Dto.Response.Order;

import com.example.laptop.Util.Enum.OrderStatus;
import com.example.laptop.Util.Enum.PaymentSatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HistoryOrder {
    Long orderId;
    List<OrderItemResponse> orderItems;
    String email;
    String numberPhone;
    String detailAddress;
    BigDecimal discount;
    OrderStatus orderStatus;
    PaymentSatus paymentSatus;
}
