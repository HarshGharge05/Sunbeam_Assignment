package com.app.org;

import java.util.Scanner;

public class Employee {

	private static int id;
	private static String name;
	private static int deptId;
	private static int basicSal;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		while(true) {
		System.out.println("Whose salary do you want to calculate? : ");
		System.out.println("1. Manager \n2. Worker\n3. Exit");
		System.out.println("\nEnter your choice : ");
		int opt = sc.nextInt();
		
		switch(opt) {
			case 1 :
				
				System.out.println("Enter the ID of Manager : ");
				id = sc.nextInt();
				
				System.out.println("Enter the name of Manager : ");
				name = sc.next();
				
				System.out.println("Enter the Department Id of Manager : ");
				deptId = sc.nextInt();
				
				System.out.println("Enter the basic salary of Manager : ");
				basicSal = sc.nextInt();
				
				System.out.println("Enter the performance bonus of Manager : ");
				int perBonus = sc.nextInt();
				
				Manager mgr = new Manager(id, name, deptId, basicSal, perBonus);
				
				double MgrTotalSal = mgr.calculateSal();
				
				System.out.println("\n=======================================");
				System.out.println("Total salary of Manager is "+MgrTotalSal);
				System.out.println("=======================================");
				
				break;
				
			case 2 : 
				System.out.println("Enter the ID of Worker : ");
				id = sc.nextInt();
				
				System.out.println("Enter the name of Worker : ");
				name = sc.next();
				
				System.out.println("Enter the Department Id of Worker : ");
				deptId = sc.nextInt();
				
				System.out.println("Enter the basic salary of Worker : ");
				basicSal = sc.nextInt();
				
				System.out.println("Enter the hours Worked by Worker : ");
				int hoursWorked = sc.nextInt();
				
				System.out.println("Enter the hourly Rate of worker: ");
				int hourlyRate = sc.nextInt();
				
				Worker wrk = new Worker(id, name, deptId, basicSal, hoursWorked, hourlyRate);
				
				double wrkTotalSal = wrk.calculateSal();
				
				System.out.println("\n=======================================");
				System.out.println("Total salary of Worker is "+wrkTotalSal);
				System.out.println("=======================================");
				
				break;
				
			case 3 :
				System.out.println("Exiting..");
				flag = 1;
				break;
				
			default :
					System.out.println("\nPlease choose correct choice!!");
					break;
		}
		
		if(flag == 1) {
			break;
		}
	  }
	}
}
