package io.github.andrijat98.springbootpracticeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootPracticeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeAppApplication.class, args);
	}
	
	@GetMapping
	Customer getCustomer() {
		return new Customer(1l, "Some name");
	}
	
	public record Customer (Long id, String name) {}
}
