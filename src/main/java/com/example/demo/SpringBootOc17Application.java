package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOc17Application {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to spring boot";
	}
	
	@GetMapping("/{input}")
	public String welcome(@PathVariable String input) {
		return "Hi " + input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOc17Application.class, args);
	}

}
