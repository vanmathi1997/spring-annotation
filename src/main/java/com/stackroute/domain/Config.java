package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {

    @Bean(name = "singletonMovieBean")
    @Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Movie movie1() {
        return new Movie(actor());
    }
    @Bean(name = "prototypeMovieBean")
    @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movie2() {
        return new Movie(actor());
    }
    @Bean
    public Actor actor()
    {
    Actor actor=new Actor("Rajni","male",60);
    return actor;
    }
}
