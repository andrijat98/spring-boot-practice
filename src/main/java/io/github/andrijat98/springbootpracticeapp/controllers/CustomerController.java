package io.github.andrijat98.springbootpracticeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;
import io.github.andrijat98.springbootpracticeapp.exceptions.ApiRequestException;
import io.github.andrijat98.springbootpracticeapp.services.CustomerService;
import jakarta.validation.Valid;

@RequestMapping(path = "api/v1/customers")
@RestController
public class CustomerController {

	private final CustomerService customerService;
	
	@Autowired //optional annotation -- dependency injection
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping
	List<Customer> getCustomers() {
		return customerService.getCustomers();
	}
	
	@GetMapping(path = "{customerId}")
	Customer getCustomer(@PathVariable("customerId") Long id) {
		return customerService.getCustomer(id);
	}
	
	@GetMapping(path = "{customerId}/exception")
	Customer getCustomerException(@PathVariable("customerId") Long id) {
		throw new ApiRequestException("ApiRequestException for customer" + id);
	}
	
	@PostMapping
	void createNewCustomer(@RequestBody @Valid Customer customer) {
		System.out.println("Post request: ");
		System.out.println(customer);
	}
	
	@DeleteMapping(path = "{customerId}")
	void deleteCustomer(@PathVariable("customerId") Long id) {
		System.out.println("Delete request for customer with id: " + id);
	}
	
	@PutMapping()
	void updateCustomer(@RequestBody Customer customer) {
		System.out.println("Put request: ");
		System.out.println(customer);
	}
}
