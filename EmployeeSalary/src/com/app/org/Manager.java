package com.app.org;

public class Manager extends Employee{

	private int id;
	private String name;
	private int deptId;
	private int basicSal; 
	private int perBonus;
	
	public Manager(int id, String name, int deptId, int basicSal, int perBonus) {
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basicSal = basicSal;
		this.perBonus = perBonus;
	}
	
	public double calculateSal() {
		
		double totSalary = this.basicSal + this.perBonus;
		
		return totSalary;
	}
}
