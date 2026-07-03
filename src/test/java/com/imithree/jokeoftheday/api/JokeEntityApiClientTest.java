package com.imithree.jokeoftheday.api;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.imithree.jokeoftheday.api.model.JokeApiDto;

@SpringBootTest
class JokeEntityApiClientTest {

    @Autowired
    private JokeApiClient jokeApiClient;

    @Test
    void test_run_client() {
        assertNotNull(jokeApiClient);
    }

    @Test
    void test_get_random_joke() {
        JokeApiDto result = jokeApiClient.getJoke();
        assertNotNull(result);
        assertNotNull(null, result.getJoke());
        assertNotEquals("", result.getJoke());
        System.out.println(result.getJoke());
    }
}