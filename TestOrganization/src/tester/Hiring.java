package tester;

import java.util.*	;

public class Hiring {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		
//		ArrayList worker = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		while(true) {
			System.out.println("1.Hire Manager\n2.Hire Worker\n3.Display information of all employees\n4.Update basic salary\n5.Exit");
			System.out.println("\nChoose option : ");
			int opt = sc.nextInt();
		
			switch(opt) {
			case 1 : 
				System.out.println("Enter name of hired manager : ");
				String mgrName = sc.next();
				System.out.println("Enter the salary of Manager : ");
				double mgrSalary = sc.nextInt();
				employees.add(new Manager(mgrName, mgrSalary));
				
				break;
				
			case 2 : 
				System.out.println("Enter name of hired Worker : ");
				String wrkName = sc.next();
				System.out.println("Enter the salary of Worker : ");
				double wrkSalary = sc.nextInt();
				employees.add(new Worker(wrkName, wrkSalary));
				
				break;
				
			case 3 : 
				System.out.println("Employees : ");
				
				for(Employee employee : employees) {
					System.out.println(employee); //Implicitly calls employee.toString()
				}
				
				break;
				
			case 4 :
				System.out.println("\nUpdating basic salary ");
				System.out.println("Enter the name of employee : ");
				String empName = sc.next();
				
				Employee empToUpdate = null;
				for(Employee employee : employees) {
					if(employee.getName().equals(empName)) {
						empToUpdate = employee;
						break;
					}
				}
				
				if(empToUpdate!=null) {
					System.out.println("Enter the new salary : ");
					double newSalary = sc.nextDouble();
					
					empToUpdate.setSalary(newSalary);
					
					System.out.println("Salary is updated SuccessFully !!");
				}
				else {
					System.out.println("Employee not found");
				}
				
				break;
			
			case 5 : 
				System.out.println("Exiting...");
				flag = 1;
				break;
				
			default : 
				System.out.println("Please enter correct option");
				
			}
			
			if(flag == 1) {
				break;
			}
			
			System.out.println("======================================================");
		}
		sc.close();
	}
}
