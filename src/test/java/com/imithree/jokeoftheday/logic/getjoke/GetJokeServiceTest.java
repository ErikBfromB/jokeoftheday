package com.imithree.jokeoftheday.logic.getjoke;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GetJokeServiceTest {

    @Autowired
    private GetJokeService getJokeService;

    @Test
    void test_get_and_save_joke() {
        getJokeService.getJoke();
        System.out.println("stop here");
    }
}