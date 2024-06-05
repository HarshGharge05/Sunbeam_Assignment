package com.app.org;

public class Worker extends Employee{

	private int id;
	private String name;
	private int deptId;
	private int basicSal; 
	private int hoursWorked;
	private int hourlyRate;
	
	public Worker(int id, String name, int deptId, int basicSal, int hoursWorked, int hourlyRate) {
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basicSal = basicSal;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		this.hourlyRate = hourlyRate;
	}
	
	public double calculateSal() {
		
		double totSalary = this.basicSal + (this.hoursWorked * this.hourlyRate);
		
		return totSalary;
	}
}
