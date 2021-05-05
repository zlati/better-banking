package io.betterbanking.transactions;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class Transaction {
    private String type;
    private ZonedDateTime date;
    private String accountNumber;
    private Double currency;
    private String amount;
    private String merchantName;
    private String merchantLogo;
}
