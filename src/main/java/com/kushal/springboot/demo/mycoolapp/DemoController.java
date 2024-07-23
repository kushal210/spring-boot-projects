package com.kushal.springboot.demo.mycoolapp;

import com.kushal.springboot.demo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    // This is CONSTRUCTOR INJECTION.
    // In case of single-constructor, @Autowired is optional.
    // When multiple bean qualifies for Injection, then we can specify the bean to be injected using the @Qualifier annotation by mentioning the bean-name.
    // @Qualifier has higher precedence over @Primary
//    @Autowired
//    public DemoController(@Qualifier("tennisCoach") Coach coach) {
//        myCoach = coach;
//    }

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){
        myCoach = coach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/get-daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check-scope")
    public String checkBeanScope(){
        return "Comparing beans, 'myCoach<>anotherCoach' : " + myCoach.equals(anotherCoach)
                + " | Since the Scope of CricketCoach bean is of prototype, both the references of CricketCoach Object are different.";
    }
}
