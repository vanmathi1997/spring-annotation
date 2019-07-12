package com.stackroute.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@ComponentScan(basePackages = "com.stackroute.domain")
public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Movie movie=context.getBean("singletonMovieBean",Movie.class);//only one object is created in singleton scope
        Movie movieref=context.getBean("singletonMovieBean",Movie.class);
        System.out.println("Singleton Scope:"+(movie==movieref));
        Movie movie1=context.getBean("prototypeMovieBean",Movie.class);//two times the object is created
        Movie movie1ref=context.getBean("prototypeMovieBean",Movie.class);
        System.out.println("Prototype Scope:"+(movie1==movie1ref));

    }
}
