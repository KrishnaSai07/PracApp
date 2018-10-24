package com.webapp.service;

import java.util.List;

import com.webapp.model.Billing;
import com.webapp.model.Complaints;
import com.webapp.model.Customer;
import com.webapp.model.PlansModel;

public interface CommonService {
	
	List<PlansModel> getAllPlans();
    List<Customer> getAllCustomers();
    
    Complaints addComplaint(Complaints complaint);
	Customer updateCustomer(Customer customer);
    
    
	boolean existsBySpeed(String speed);
	boolean existsByMaxusage(String maxUsage);
	
	List<PlansModel> findAllBySpeed(String speed);
	List<PlansModel> findAllByMaxusage(String maxUsage);
	
	
	
	Customer getCustomerById(String customerid);
	
	PlansModel getPlanById(String planid);
	
	List<Billing> getAllBills();

}
