package io.github.andrijat98.springbootpracticeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootPracticeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeAppApplication.class, args);
	}

}
