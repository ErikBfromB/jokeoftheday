package com.imithree.jokeoftheday.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldGenerator helloWorldGenerator;

    @GetMapping("/hello")
    public String getHelloWorld(@RequestParam String name, @RequestParam String surname) {
        String generatedHelloWorld = helloWorldGenerator.generate(name, surname);
        return generatedHelloWorld;
    }
}
