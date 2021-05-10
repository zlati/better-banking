package io.betterbanking.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return transactionRepository.findAllByAccountNumber(accountNumber);

//                List.of(Transaction.builder()
//                .accountNumber("123")
//                .amount(13.23)
//                .currency(Transaction.Currency.EUR)
//                .date(OffsetDateTime.now())
//                .merchantLogo("/logos/1.png")
//                .merchantName("Big corp")
//                .type(Transaction.Type.CREDIT)
//                .build());
    }
}
