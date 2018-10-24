package com.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plansm2")
public class PlansModel {
	
	@Id
	private String p_Code;
	private String speed;
	private String maxusage;


	private int mrate;
	private int yrate;
	
	public PlansModel() {
	
	}

	public PlansModel(String p_Code, String speed, String maxUsage, int mRate, int yRate) {
		super();
		this.p_Code = p_Code;
		this.speed = speed;
		this.maxusage = maxUsage;
		this.mrate = mRate;
		this.yrate = yRate;
	}

	public String getP_Code() {
		return p_Code;
	}

	public void setP_Code(String p_Code) {
		this.p_Code = p_Code;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	

	
	
	public int getYrate() {
		return yrate;
	}

	public void setYrate(int yrate) {
		this.yrate = yrate;
	}

	public int getMrate() {
		return mrate;
	}

	public void setMrate(int mrate) {
		this.mrate = mrate;
	}

	public String getMaxusage() {
		return maxusage;
	}

	public void setMaxusage(String maxusage) {
		this.maxusage = maxusage;
	}


	
	
	

}
