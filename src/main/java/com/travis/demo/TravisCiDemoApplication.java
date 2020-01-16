package com.travis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisCiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravisCiDemoApplication.class, args);
	}
	
	@GetMapping(value = "/")
	public String home() {
		return "This is First Travis-ci demo for CI/CD";
	}

}
