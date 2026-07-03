package com.imithree.jokeoftheday.api;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class JokeApiClient {

    private final String URL = "https://v2.jokeapi.dev/joke/Any";

    private final RestTemplate restTemplate = new RestTemplate();

    public String getJoke() {
        String random = restTemplate.getForObject(URL, String.class);
        return random;
    }
}
