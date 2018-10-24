package com.webapp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaint1")
public class Complaints {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long complaintId;
	private LocalDate complaintDate;
	private LocalTime complaintTime;
	private String customerName;
	private String complaintDesc;
	private String status;
	
	
	
	public Complaints() {
		super();
	}



	public Complaints(long complaintId, LocalDate complaintDate, LocalTime complaintTime, String customerName,
			String complaintDesc, String status) {
		super();
		this.complaintId = complaintId;
		this.complaintDate = complaintDate;
		this.complaintTime = complaintTime;
		this.customerName = customerName;
		this.complaintDesc = complaintDesc;
		this.status = status;
	}



	public long getComplaintId() {
		return complaintId;
	}



	public void setComplaintId(long complaintId) {
		this.complaintId = complaintId;
	}



	public LocalDate getComplaintDate() {
		return complaintDate;
	}



	public void setComplaintDate(LocalDate complaintDate) {
		this.complaintDate = complaintDate;
	}



	public LocalTime getComplaintTime() {
		return complaintTime;
	}



	public void setComplaintTime(LocalTime complaintTime) {
		this.complaintTime = complaintTime;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getComplaintDesc() {
		return complaintDesc;
	}



	public void setComplaintDesc(String complaintDesc) {
		this.complaintDesc = complaintDesc;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
