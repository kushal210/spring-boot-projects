package com.kushal.springboot.demo.util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return " |<---- Practice fielding for 2 hours ---->|";
    }
}
