package com.spakala.springboot.empsalarydemo;

import java.util.Date;

public class Payment {

	private int id;
	private String name;
	private int regularSalary; //to be subsumed into Enum paymentType
	private int bonus; //to be subsumed into Enum paymentType
	private String date; //simplification of Date for demo
	
	public Payment() {
		super();
	}

	public Payment(int id, String name, int regularSalary, int bonus, String date) {
		super();
		this.id = id;
		this.name = name;
		this.regularSalary = regularSalary;
		this.bonus = bonus;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularSalary() {
		return regularSalary;
	}

	public void setRegularSalary(int regularSalary) {
		this.regularSalary = regularSalary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
}
