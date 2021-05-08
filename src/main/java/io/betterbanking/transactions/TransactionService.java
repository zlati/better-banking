package io.betterbanking.transactions;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return List.of(Transaction.builder()
                .accountNumber("123")
                .amount(13.23)
                .currency(Transaction.Currency.EUR)
                .date(Instant.now().atZone(ZoneId.systemDefault()))
                .merchantLogo("/logos/1.png")
                .merchantName("Big corp")
                .type(Transaction.Type.CREDIT)
                .build());
    }
}
