package io.betterbanking.web;

import io.betterbanking.TransactionsApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {TransactionsApplication.class})
@AutoConfigureMockMvc
class TransactionControllerIntegrationTest {

    @Test
    public void testTransactions() throws Exception {
        mockMvc.perform(
                get("/api/v1/transactions/12345678"))
                .andExpect(status().isOk());
    }

    @Autowired
    private MockMvc mockMvc;
}