package com.stackroute.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.stackroute.domain")
public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Movie movie=context.getBean(Movie.class);

    }
}
