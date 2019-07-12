package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Movie movie1() {
        return new Movie(actor());
    }
    @Bean
    public Actor actor()
    {
    Actor actor=new Actor("Rajni","male",60);
    return actor;
    }
}
