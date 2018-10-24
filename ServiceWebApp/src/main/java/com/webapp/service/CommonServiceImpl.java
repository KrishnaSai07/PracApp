package com.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.model.Billing;
import com.webapp.model.Complaints;
import com.webapp.model.Customer;
import com.webapp.model.PlansModel;
import com.webapp.repository.BillRepository;
import com.webapp.repository.ComplaintRepository;
import com.webapp.repository.CustomerRepository;
import com.webapp.repository.PlansRepository;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private PlansRepository planRepo;
	
	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	private ComplaintRepository compRepo;
	
	@Autowired
	private BillRepository billRepo;
	
	@Override
	public List<PlansModel> getAllPlans() {
		// TODO Auto-generated method stub
		return planRepo.findAll();
	}

	@Override
	public boolean existsBySpeed(String speed) {
		// TODO Auto-generated method stub
		return planRepo.existsBySpeed(speed);
	}

	@Override
	public boolean existsByMaxusage(String maxUsage) {
		// TODO Auto-generated method stub
		return planRepo.existsByMaxusage(maxUsage);
	}

	@Override
	public List<PlansModel> findAllBySpeed(String speed) {
		// TODO Auto-generated method stub
		return planRepo.findAllBySpeed(speed);
	}

	@Override
	public List<PlansModel> findAllByMaxusage(String maxUsage) {
		// TODO Auto-generated method stub
		return planRepo.findAllByMaxusage(maxUsage);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	@Override
	public Complaints addComplaint(Complaints complaint) {
		// TODO Auto-generated method stub
		return compRepo.save(complaint);
	}



	@Override
	public Customer getCustomerById(String customerid) {
		// TODO Auto-generated method stub
	Customer customer=null;
		
		/*if(contactRepo.existsById(contactId)) {
			contact = contactRepo.findById(contactId).get();
		}*/
		
		Optional<Customer> optCusto =custRepo.findById(customerid);
		if(optCusto.isPresent()) {
			customer = optCusto.get();
			//System.out.println(customer);
		}
		
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return custRepo.save(customer);
	}

	@Override
	public PlansModel getPlanById(String planid) {
		// TODO Auto-generated method stub
		PlansModel planModel = null;
		
		
		Optional<PlansModel> optCusto =planRepo.findById(planid);
		if(optCusto.isPresent()) {
			planModel = optCusto.get();
			//System.out.println(customer);
		}
		
		return planModel;
	}

	@Override
	public List<Billing> getAllBills() {
		// TODO Auto-generated method stub
		return billRepo.findAll();
	}

	

	

}
