package com.stackroute.domain;
import org.springframework.stereotype.Component;

@Component
public class Movie {
   private Actor actor;

   public Movie(Actor actor) {
      this.actor = actor;
      System.out.println(actor);//prints the values

   }

}