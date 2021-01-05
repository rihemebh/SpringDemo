package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FriendlyGreeter implements GreetInterface{

    @Override
    public String greet() {
        return "Friendly greeter";
    }
}
