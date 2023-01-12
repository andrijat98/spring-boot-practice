package io.github.andrijat98.springbootpracticeapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Customer {
	
	private final Long id;
	@NotBlank
	private final String name;
	@NotBlank
	@JsonProperty(access = Access.WRITE_ONLY)
	private final String password;
	@NotBlank
	@Email
	private final String email;
	
	public Customer(Long id, String name, String password, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	@JsonProperty("customerId")
	public Long getId() {
		return id;
	}
	
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
}
