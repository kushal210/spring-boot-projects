package com.kushal.springboot.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    // Constructor.
    public CricketCoach(){
        System.out.println("Inside the constructor of " + this.getClass().getSimpleName());
    }
    // define our init method.
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("Inside the PostConstruct method of: " + this.getClass().getSimpleName());
    }

    // define our destroy method.
    // @PreDestroy doesn't work when the scope is Prototype..
    @PreDestroy
    public void doCleanUpStuff(){
        System.out.println("Inside the PreDestroy method of: " + this.getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return " |<---- Practice fielding for 2 hours ---->|";
    }
}
