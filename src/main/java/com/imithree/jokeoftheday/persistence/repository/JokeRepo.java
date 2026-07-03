package com.imithree.jokeoftheday.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.imithree.jokeoftheday.persistence.model.JokeEntity;

public interface JokeRepo extends CrudRepository<JokeEntity, Integer> {

    JokeEntity save(JokeEntity jokeEntity);
}
