package com.imithree.jokeoftheday.api;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.imithree.jokeoftheday.api.model.JokeApiDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class JokeApiClient {

    private final String URL = "https://v2.jokeapi.dev/joke/Any?type=single";

    private final RestTemplate restTemplate = new RestTemplate();

    public JokeApiDto getJoke() {
        JokeApiDto forObject = restTemplate.getForObject(URL, JokeApiDto.class);
        return forObject;
    }
}
