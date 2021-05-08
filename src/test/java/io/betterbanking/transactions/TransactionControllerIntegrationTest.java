package io.betterbanking.transactions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {TransactionsApplication.class})
@AutoConfigureMockMvc
class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void should_return_a_transaction() throws Exception {
        final String accNum = "123";
        mvc.perform(MockMvcRequestBuilders
                .get("/api/v1/transactions/{accountNumber}", accNum)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*]type").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*]date").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*]accountNumber").value(accNum))
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*]currency").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*]amount").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*]merchantName").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*]merchantLogo").isNotEmpty());
    }
}