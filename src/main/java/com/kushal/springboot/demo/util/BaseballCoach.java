package com.kushal.springboot.demo.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// While using @Primary, the implementation classes decide among themselves, which one is the Primary type, rather than the class using the implementation.
@Primary
@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
