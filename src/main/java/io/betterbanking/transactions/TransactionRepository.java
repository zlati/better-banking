package io.betterbanking.transactions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface TransactionRepository extends JpaRepository<Transaction, String> {
    List<Transaction> findAllByAccountNumber(final String accountNumber);
}