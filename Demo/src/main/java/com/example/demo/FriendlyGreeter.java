package com.example.demo;

import org.springframework.stereotype.Component;


public class FriendlyGreeter extends GreetBase{

    @Override
    public String greet() {
        greetCount++;
        return "Friendly greeter "+greetCount;
    }
}
