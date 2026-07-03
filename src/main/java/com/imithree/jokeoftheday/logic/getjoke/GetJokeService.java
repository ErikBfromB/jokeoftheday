package com.imithree.jokeoftheday.logic.getjoke;

import org.springframework.stereotype.Component;

import com.imithree.jokeoftheday.api.JokeApiClient;
import com.imithree.jokeoftheday.api.model.JokeApiDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class GetJokeService {

    private final JokeApiClient jokeApiClient;

    public JokeApiDto getJoke(){
        return jokeApiClient.getJoke();
    }
}
