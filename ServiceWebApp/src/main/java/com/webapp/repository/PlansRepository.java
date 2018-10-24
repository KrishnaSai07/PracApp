package com.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.model.PlansModel;

@Repository
public interface PlansRepository extends JpaRepository<PlansModel, String>{
	
	boolean existsBySpeed(String speed);
	boolean existsByMaxusage(String maxUsage);
	
	List<PlansModel> findAllBySpeed(String speed);
	List<PlansModel> findAllByMaxusage(String maxUsage);
	

}
