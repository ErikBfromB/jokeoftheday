package com.imithree.jokeoftheday.mvc;

import org.springframework.stereotype.Component;

import com.imithree.jokeoftheday.persistence.model.Joke;
import com.imithree.jokeoftheday.persistence.repository.JokeRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Component
@Slf4j
public class HelloWorldGenerator {

    private final JokeRepo jokeRepo;

    public String generate(String name, String surname) {
        Joke joke = new Joke();
        joke.setJoke("Hello World!");
        log.info("SAVING NOW???");
        jokeRepo.save(joke);
        return "<h1>Hello, " + name + " " + surname + "!</h1>";
    }
}
