package com.webapp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bills1")
public class Billing {
	
	@Id
	private String billId;
	private LocalDate dueDate;
    private int amount;
    private String pOfPayment;
    private String mOfPayment;
    private String status;
	
    public Billing() {
		super();
	}

	public Billing(String billId, LocalDate dueDate, int amount, String pOfPayment,
			String mOfPayment, String status) 
	{
		super();
		this.billId = billId;
		this.dueDate = dueDate;
		this.amount = amount;
		this.pOfPayment = pOfPayment;
		this.mOfPayment = mOfPayment;
		this.status = status;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getpOfPayment() {
		return pOfPayment;
	}

	public void setpOfPayment(String pOfPayment) {
		this.pOfPayment = pOfPayment;
	}

	public String getmOfPayment() {
		return mOfPayment;
	}

	public void setmOfPayment(String mOfPayment) {
		this.mOfPayment = mOfPayment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
    
    
     
   
}
