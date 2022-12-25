package io.github.andrijat98.springbootpracticeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;
import io.github.andrijat98.springbootpracticeapp.services.CustomerService;

@RestController
public class CustomerController {

	private final CustomerService customerService;
	
	@Autowired //optional annotation
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/")
	Customer getCustomer() {
		return customerService.getCustomer();
	}
	
}
