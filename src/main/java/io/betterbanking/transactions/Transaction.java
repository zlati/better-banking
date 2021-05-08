package io.betterbanking.transactions;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class Transaction {
    public enum Currency {EUR}

    public enum Type {CREDIT}

    private Type type;
    private ZonedDateTime date;
    private String accountNumber;
    private Currency currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;
}
