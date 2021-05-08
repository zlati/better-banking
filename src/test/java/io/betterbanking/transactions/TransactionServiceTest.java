package io.betterbanking.transactions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {
    @Mock
    private TransactionService transactionService;

    @Test
    void should_return_empty_list() {
        when(transactionService.findAllByAccountNumber("123")).thenReturn(List.of(Transaction.builder()
                .accountNumber("123")
                .amount(13.23)
                .currency(Transaction.Currency.EUR)
                .date(Instant.now().atZone(ZoneId.systemDefault()))
                .merchantLogo("/logos/1.png")
                .merchantName("Big corp")
                .type(Transaction.Type.CREDIT)
                .build()));
        List<Transaction> transactions = transactionService.findAllByAccountNumber("123");
        assertTrue(transactions.size() > 0);
    }
}