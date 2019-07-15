package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
   private Actor actor;
   private ApplicationContextAware applicationContextAware;
   private BeanNameAware beanNameAware;
   private BeanFactoryAware beanFactoryAware;

   public Movie(Actor actor) {
      this.actor = actor;
      System.out.println(actor);//prints the values

   }

   @Override
   public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
      System.out.println(beanFactory);
   }

   @Override
   public void setBeanName(String s) {
      System.out.println(s);

   }

   @Override
   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      System.out.println(applicationContext);
   }
}