package io.github.andrijat98.springbootpracticeapp.services;

import org.springframework.stereotype.Service;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;

@Service
public class CustomerService {

	public Customer getCustomer() {
		return new Customer(1l, "Some name");
	}
	
}
