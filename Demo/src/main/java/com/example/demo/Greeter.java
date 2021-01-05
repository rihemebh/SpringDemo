package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Greeter implements GreetInterface{
    @Override
    public String greet(){
        return "Greet";
    }
}
