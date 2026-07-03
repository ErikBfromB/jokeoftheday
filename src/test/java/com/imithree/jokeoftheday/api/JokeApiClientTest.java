package com.imithree.jokeoftheday.api;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JokeApiClientTest {

    @Autowired
    private JokeApiClient jokeApiClient;

    @Test
    void test_run_client() {
        assertNotNull(jokeApiClient);
    }

    @Test
    void test_get_random_joke() {
        String result = jokeApiClient.getJoke();
        assertNotNull(result);
        assertNotEquals("", result);
    }
}