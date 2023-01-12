package io.github.andrijat98.springbootpracticeapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Customer {
	
	@Id
	private Long id;
	@NotBlank(message = "name can't be empty!")
	private String name;
	@NotBlank(message = "password can't be empty!")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	@NotBlank(message = "email can't be empty!")
	@Email
	private String email;
	
	public Customer(Long id, String name, String password, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public Customer() {
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
