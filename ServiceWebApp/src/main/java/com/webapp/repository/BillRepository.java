package com.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.model.Billing;

public interface BillRepository extends JpaRepository<Billing, String> {

}
