package com.spakala.springboot.empsalarydemo;

public class MonthlyPayment {

	private int eid;
	private String month;
	private int totalPayment;
	
	public MonthlyPayment() {
		super();
	}

	public MonthlyPayment(int eid, String month, int totalPayment) {
		super();
		this.eid = eid;
		this.month = month;
		this.totalPayment = totalPayment;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	
}
