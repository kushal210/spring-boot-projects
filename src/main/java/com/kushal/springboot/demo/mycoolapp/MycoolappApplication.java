package com.kushal.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.kushal.springboot.demo.mycoolapp",
		"com.kushal.springboot.demo.util",
		"com.kushal.springboot.demo.config"
})
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
