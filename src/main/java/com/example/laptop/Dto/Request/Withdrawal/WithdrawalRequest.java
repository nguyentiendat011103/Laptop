package com.example.laptop.Dto.Request.Withdrawal;

import com.example.laptop.Util.Enum.WithdrawalStatus;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WithdrawalRequest {
    String accountNumber;
    BigDecimal amount;
    String requestNote;
    String adminNote;
    WithdrawalStatus status;
}
