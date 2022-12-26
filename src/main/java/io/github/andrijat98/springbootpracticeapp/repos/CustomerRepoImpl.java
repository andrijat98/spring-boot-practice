package io.github.andrijat98.springbootpracticeapp.repos;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;

@Component
public class CustomerRepoImpl implements CustomerRepo{

	@Override
	public List<Customer> getCustomers() {
		
		return Collections.emptyList();
	}

}
