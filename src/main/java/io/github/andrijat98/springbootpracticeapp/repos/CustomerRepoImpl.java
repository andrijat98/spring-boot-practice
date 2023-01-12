package io.github.andrijat98.springbootpracticeapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.andrijat98.springbootpracticeapp.entities.Customer;

@Repository
public interface CustomerRepoImpl extends JpaRepository<Customer, Long>{



}
