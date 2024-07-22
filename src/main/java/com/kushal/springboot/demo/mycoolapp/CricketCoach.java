package com.kushal.springboot.demo.mycoolapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return " |<---- Practice fielding for 2 hours ---->|";
    }
}
