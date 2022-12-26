package io.github.andrijat98.springbootpracticeapp.repos;

import java.util.Arrays;
import java.util.List;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;


public class CustomerFakeRepo implements CustomerRepo{

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return Arrays.asList(
				new Customer(1l, "Some name", "password"),
				new Customer(2l, "Some other name", "password123")
				);
	}

}
