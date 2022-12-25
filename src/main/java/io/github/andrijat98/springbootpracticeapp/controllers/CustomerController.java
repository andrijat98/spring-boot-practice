package io.github.andrijat98.springbootpracticeapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;

@RestController
public class CustomerController {

	@GetMapping("/")
	Customer getCustomer() {
		return new Customer(1l, "Some name");
	}
	
}
