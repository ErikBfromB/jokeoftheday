package com.imithree.jokeoftheday.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.imithree.jokeoftheday.persistence.model.Joke;

public interface JokeRepo extends CrudRepository<Joke, Integer> {

    Joke save(Joke joke);
}
