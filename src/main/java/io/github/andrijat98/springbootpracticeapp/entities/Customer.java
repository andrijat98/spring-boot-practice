package io.github.andrijat98.springbootpracticeapp.entities;

public class Customer {
	
	private final Long id;
	private final String name;
	
	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	

	
}