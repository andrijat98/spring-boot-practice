package io.github.andrijat98.springbootpracticeapp.repos;

import java.util.Collections;
import java.util.List;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;

public class CustomerRepoImpl implements CustomerRepo{

	@Override
	public List<Customer> getCustomers() {
		return Collections.singletonList(
				new Customer(1l, "TODO", "to do", "email@gmail.com")
				);
	}

}
