package com.kushal.springboot.demo.config;

import com.kushal.springboot.demo.util.Coach;
import com.kushal.springboot.demo.util.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Declaring a Java Class as spring Bean using the @Configuration class and @Bean method.
@Configuration
public class SportsConfig {

    // name of the method annotated with @Bean annotation is the bean name that needs to be injected.
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
