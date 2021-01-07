package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class GreeterConfiguration {

    @Bean
    @Scope(value = "prototype")
    public Greeter greeter(){
        return new Greeter();
    }

    @Bean
//    @Scope(value = "singleton")
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public FriendlyGreeter friendlyGreeter(){
        return new FriendlyGreeter();
    }
}
