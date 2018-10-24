package com.webapp.restapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.model.Billing;
import com.webapp.model.Complaints;
import com.webapp.model.Customer;
import com.webapp.model.PlansModel;
import com.webapp.service.CommonService;

@RestController
@CrossOrigin
public class ServiceRestApi {
	
	@Autowired
	private CommonService coms;
	
	@RequestMapping("/plans")
	@GetMapping()
	public ResponseEntity<List<PlansModel>> getAllPlansAction()
	{
		return new ResponseEntity<>(coms.getAllPlans(),HttpStatus.OK);
	}
	
	@RequestMapping("/customer")
	@GetMapping()
	public ResponseEntity<List<Customer>> getAllCustomersAction()
	{
		return new ResponseEntity<>(coms.getAllCustomers(),HttpStatus.OK);
	}
	
	@GetMapping("/plans/{field}/{srhValue}")
	public ResponseEntity<List<PlansModel>> getAllPlansByValue(
			@PathVariable("field") String fieldBy,
			@PathVariable("srhValue") String searchValue)
	{
		List<PlansModel> results = null;
		
		switch(fieldBy)
		{
		case "speed":
			 List<PlansModel> cByNetspeed = coms.findAllBySpeed(searchValue);
			if(cByNetspeed!=null)
			{
				results= coms.findAllBySpeed(searchValue);
			}
			break;
		case "maxusage":
			List<PlansModel> cByMaxusage = coms.findAllByMaxusage(searchValue);
			if(cByMaxusage!=null)
			{
				results=coms.findAllByMaxusage(searchValue);
			}
			break;
		}
		
		ResponseEntity<List<PlansModel>> resp;
		
		if(results==null)
			resp= new ResponseEntity<List<PlansModel>>(HttpStatus.BAD_REQUEST);
		else
			resp= new ResponseEntity<List<PlansModel>>(results,HttpStatus.OK);
		
		return resp;
	}
	
	@RequestMapping("/complaint")
	@PostMapping
	public ResponseEntity<Complaints> addComplaint(@RequestBody Complaints complaint)
	{
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		
		complaint.setComplaintDate(date);
		complaint.setComplaintTime(time);
		complaint.setStatus("NEW");
		
		coms.addComplaint(complaint);
		return new ResponseEntity<Complaints>(complaint,HttpStatus.OK);
		
	}

	@PutMapping("/customer/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		ResponseEntity<Customer> resp = null;
		
		Customer com=coms.getCustomerById(customer.getCustomId());
		if(com.getCustomId()==customer.getCustomId())
		{
			coms.updateCustomer(customer);
			resp=new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
		else
		{
			resp=new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
		}
		
		return resp;

	}
	
	@GetMapping("/customerId/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String customid) {
		ResponseEntity<Customer> resp;
		Customer c = coms.getCustomerById(customid);
		if (c == null)
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		return resp;
	}

	@GetMapping("/planId/{id}")
	public ResponseEntity<PlansModel> getPlanById(@PathVariable("id") String planid) {
		ResponseEntity<PlansModel> resp;
		PlansModel c = coms.getPlanById(planid);
		if (c == null)
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		return resp;
	}
	
	@RequestMapping("/bills")
	@GetMapping()
	public ResponseEntity<List<Billing>> getAllBillsAction()
	{
		return new ResponseEntity<>(coms.getAllBills(),HttpStatus.OK);
	}
	
	
	

}
