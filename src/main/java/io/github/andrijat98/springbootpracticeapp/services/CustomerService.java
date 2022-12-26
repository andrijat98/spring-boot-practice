package io.github.andrijat98.springbootpracticeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;
import io.github.andrijat98.springbootpracticeapp.repos.CustomerRepo;

@Service
public class CustomerService {
	
	private final CustomerRepo customerRepo;
	
	@Autowired
	public CustomerService(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	public List<Customer> getCustomers() {
		return customerRepo.getCustomers();
	}
}
