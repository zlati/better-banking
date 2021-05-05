package io.betterbanking.transactions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {
    @Mock
    private TransactionService transactionService;

    @Test
    void should_return_empty_list() {
        List<Transaction> transactions = transactionService.findAllByAccountNumber("123", 0);
        assertEquals(0, transactions.size());
    }
}