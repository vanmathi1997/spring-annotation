package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {

    @Autowired
    @Bean
    public Movie movie2() {
        Actor actor=new Actor("vj","male",40);
        return new Movie(actor(actor));
    }
    @Bean
    public Actor actor(Actor actor)
    {
    return actor ;
    }

    @Bean(initMethod = "customBeanInit",destroyMethod = "customBeanDestroy")
    public BeanLifecycleDemoBean getMethods()
    {
        return new BeanLifecycleDemoBean();
    }
    @Bean
    public BeanPostProcessorDemoBean getBeans()
    {
        return new BeanPostProcessorDemoBean();
    }
}
