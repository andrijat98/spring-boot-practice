package io.github.andrijat98.springbootpracticeapp.repos;

import java.util.List;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;

public interface CustomerRepo {
	
	List<Customer> getCustomers();
	
}
