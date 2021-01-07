package com.example.demo;

import org.springframework.stereotype.Component;


public class Greeter extends GreetBase{
    @Override
    public String greet(){

        greetCount++;
    return "Greet "+greetCount;
    }
}
