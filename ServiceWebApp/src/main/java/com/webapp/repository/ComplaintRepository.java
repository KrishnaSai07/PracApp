package com.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.model.Complaints;

public interface ComplaintRepository extends JpaRepository<Complaints, Long> {


}
