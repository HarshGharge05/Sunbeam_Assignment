package tester;

public class Employee {

	private String name;
	private double salary;
	
//	public Employee(String name, double salary) {
//		
//		this.setName(name);
//		this.setSalary(salary);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Name: " + name + ", Salary: " + salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
