package io.github.andrijat98.springbootpracticeapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.andrijat98.springbootpracticeapp.repos.CustomerFakeRepo;
import io.github.andrijat98.springbootpracticeapp.repos.CustomerRepo;
import io.github.andrijat98.springbootpracticeapp.repos.CustomerRepoImpl;

@Configuration
public class CustomerConfig {
	
	@Value("${app.useFakeCustomerRepo:false}")
	private Boolean useFakeCustomerRepo;

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Command line running");
		};
	}
	
	@Bean
	CustomerRepo customerRepo() {
		System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
		return useFakeCustomerRepo ?
				new CustomerFakeRepo() : new CustomerRepoImpl();
	}
}