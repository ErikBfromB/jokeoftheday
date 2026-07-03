package com.imithree.jokeoftheday.mvc;

import org.springframework.stereotype.Component;

import com.imithree.jokeoftheday.api.model.JokeApiDto;
import com.imithree.jokeoftheday.logic.getjoke.GetJokeService;
import com.imithree.jokeoftheday.persistence.model.JokeEntity;
import com.imithree.jokeoftheday.persistence.repository.JokeRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Component
@Slf4j
public class HelloWorldGenerator {

    private final JokeRepo jokeRepo;

    private final GetJokeService getJokeService;

    public String generate(String name, String surname) {
        JokeApiDto joke = getJokeService.getJoke();

        JokeEntity jokeEntity = new JokeEntity(joke.getJoke());
        log.info("SAVING NOW");
        jokeRepo.save(jokeEntity);

        return "<h1>Hello, " + name + " " + surname + "!</h1>\n"
                + "<p>" + joke.getJoke() + "</p>";
    }
}
