package io.betterbanking.transactions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TransactionComponentTest {
    @LocalServerPort
    private int port;

    @Test
    public void should_return_a_transaction() throws Exception {
        given()
                .log().all()
                .when()
                .get("http://localhost:" + port + "/api/v1/transactions/123")
                .then()
                .body("[0].type", equalTo("CREDIT"));
    }
}