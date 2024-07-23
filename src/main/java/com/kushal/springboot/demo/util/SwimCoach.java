package com.kushal.springboot.demo.util;

// This is not annotated with @Component on purpose to demonstrate the injection via Bean Configuration.
// Use case: Those third party libraries that could not be annotated with @Component, declaring @Configuration|@Bean
// declares that as a Spring Bean and makes it ready for Injection.
public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("Inside constructor: " +  this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim for 100 m for warmup!";
    }
}
