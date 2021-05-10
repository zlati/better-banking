package io.betterbanking.transactions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", nullable = false)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE", nullable = false)
    private TransactionType type;

    @Column(name = "DATE", nullable = false)
    private OffsetDateTime date;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "CURRENCY", nullable = false)
    private TransactionCurrency currency;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @Column(name = "MERCHANT_NAME", nullable = false)
    private String merchantName;

    @Column(name = "MERCHANT_LOGO", nullable = false)
    private String merchantLogo;
}
