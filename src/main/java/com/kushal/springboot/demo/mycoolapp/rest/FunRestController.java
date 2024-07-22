package com.kushal.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${team.name}")
    private String teamName;

    @Value("${team.description}")
    private String teamMotto;

    // Expose a '/' endpoint
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
    @GetMapping("/get-team-info")
    public String getTeamInfo(){
        return "My Coding team is " + teamName + " and its motto is " + teamMotto;
    }
}
