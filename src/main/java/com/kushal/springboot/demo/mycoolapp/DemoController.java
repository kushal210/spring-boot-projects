package com.kushal.springboot.demo.mycoolapp;

import com.kushal.springboot.demo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    // This is CONSTRUCTOR INJECTION.
    // In case of single-constructor, @Autowired is optional.
    // When multiple bean qualifies for Injection, then we can specify the bean to be injected using the @Qualifier annotation by mentioning the bean-name.
    // @Qualifier has higher precedence over @Primary
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach coach){
        myCoach = coach;
    }

    @GetMapping("/get-daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
