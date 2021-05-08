package io.betterbanking.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/v1/transactions/{accountNumber}")
    public List<Transaction> getTransactions(@PathVariable("accountNumber") String accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
