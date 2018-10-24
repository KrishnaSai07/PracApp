package com.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers4")
public class Customer {
	
	@Id
	private String customId;
	private String name;
	private String address;
	private String mobileNumber;
	private String planId;
	
	
	
	public Customer() {
		super();
	}



	public Customer(String customId, String name, String address, String mobileNumber, String planId) {
		super();
		this.customId = customId;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.planId = planId;
	}



	public String getCustomId() {
		return customId;
	}



	public void setCustomId(String customId) {
		this.customId = customId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getPlanId() {
		return planId;
	}



	public void setPlanId(String planId) {
		this.planId = planId;
	}
    
	
	
	
	
	

}
