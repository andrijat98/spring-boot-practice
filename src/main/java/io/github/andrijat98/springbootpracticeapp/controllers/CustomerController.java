package io.github.andrijat98.springbootpracticeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;
import io.github.andrijat98.springbootpracticeapp.services.CustomerService;

@RestController
public class CustomerController {

	private final CustomerService customerService;
	
	@Autowired //optional annotation -- dependency injection
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/")
	List<Customer> getCustomers() {
		return customerService.getCustomers();
	}
	
	@PostMapping
	void createNewCustomer(Customer customer) {
		System.out.println("Post request: ");
		System.out.println(customer);
	}
	
	@DeleteMapping(path = "{customerId}")
	void delteCustomer(@PathVariable("customerId") Long id) {
		System.out.println("Delete request for customer with id: " + id);
	}
	
	@PutMapping
	void updateCustomer(Customer customer) {
		System.out.println("Put request: ");
		System.out.println(customer);
	}
}
