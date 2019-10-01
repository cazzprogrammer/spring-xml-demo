package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor;

    public Movie(){}

    public Movie(Actor actor1){
        this.actor = actor1;
    }

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    @Override
    public String toString()
    {
        return "Movie :" + actor;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            System.out.println("ApplicationContext : " + applicationContext);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name : " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory : "+ beanFactory);
    }
}
