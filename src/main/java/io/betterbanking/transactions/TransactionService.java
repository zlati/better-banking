package io.betterbanking.transactions;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(String accountNumber, int listSize) {
        return List.of();
    }
}
