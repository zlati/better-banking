package io.betterbanking.service;

import io.betterbanking.TransactionsApplication;
import io.betterbanking.transactions.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {TransactionsApplication.class})
public class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void testTransactionCount() {
        assertEquals(2, transactionService.findAllByAccountNumber("123").size());
    }
}