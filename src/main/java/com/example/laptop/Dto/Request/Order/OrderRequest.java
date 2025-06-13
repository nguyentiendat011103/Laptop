package com.example.laptop.Dto.Request.Order;

import com.example.laptop.Util.Enum.PaymentMethod;
import jakarta.validation.constraints.NotNull;

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
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class OrderRequest {

    Long UserId;
    String DetailAddress;
    String fullName;
    String phoneNumber;
    String email;
    Integer wardId;
    List<OrderProductRequest> orderProductRequestList;
    Long discountId;
    BigDecimal discount;
    String note;
    PaymentMethod paymentMethod;
}
