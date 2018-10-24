package com.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

	
	
}
