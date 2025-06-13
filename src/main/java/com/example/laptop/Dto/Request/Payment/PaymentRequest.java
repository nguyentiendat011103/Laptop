package com.example.laptop.Dto.Request.Payment;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentRequest {
    @NotNull
    Long userId;

    Long vipPackageId;

    @DecimalMin(value = "0.0", inclusive = false)
    @NotNull
    BigDecimal amount;

    @NotNull
    LocalDateTime paymentDate;
}
