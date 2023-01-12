package io.github.andrijat98.springbootpracticeapp.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;
import io.github.andrijat98.springbootpracticeapp.exceptions.NotFoundException;
import io.github.andrijat98.springbootpracticeapp.repos.CustomerRepoImpl;

@Service
public class CustomerService {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
	
	private final CustomerRepoImpl customerRepoImpl;
	
	@Autowired
	public CustomerService(CustomerRepoImpl customerRepoImpl) {
		this.customerRepoImpl = customerRepoImpl;
	}

	public List<Customer> getCustomers() {
		LOGGER.info("getCustomer was called");
		return customerRepoImpl.findAll();
	}
	
	public Customer getCustomer(Long id) {
		
		return customerRepoImpl.findById(id)
		.orElseThrow(
				() -> {
					NotFoundException notFoundException = new NotFoundException("customer with id " + id + " not found");
					LOGGER.error("error in getting customer {}", id, notFoundException);
					return notFoundException;			
		});
	}
}
