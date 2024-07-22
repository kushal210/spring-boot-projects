package com.kushal.springboot.demo.mycoolapp;

import com.kushal.springboot.demo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    // This is CONSTRUCTOR INJECTION.
    // In case of single-constructor, @Autowired is optional.
    @Autowired
    public DemoController(Coach coach){
        myCoach = coach;
    }

    @GetMapping("/get-daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
