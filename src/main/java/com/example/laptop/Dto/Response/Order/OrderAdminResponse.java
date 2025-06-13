package com.example.laptop.Dto.Response.Order;

import com.example.laptop.Dto.Response.Discount.DiscountResponse;
import com.example.laptop.Dto.Response.User.UserResponse;
import com.example.laptop.Entity.InfoUserReceive;
import com.example.laptop.Util.Enum.OrderStatus;
import com.example.laptop.Util.Enum.PaymentMethod;
import com.example.laptop.Util.Enum.PaymentSatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderAdminResponse {
    Long id;
    UserResponse user;
    Long infoUserReceiveId;
    InfoUserReceive infoUserReceive;
    OrderStatus orderStatus;
    PaymentSatus paymentSatus;
    PaymentMethod paymentMethod;
    String note;
    DiscountResponse discount;
    LocalDateTime createTime;
    LocalDateTime updateTime;
    List<OrderItemResponse> orderItems;
}
