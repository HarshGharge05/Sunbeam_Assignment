package studentInfo;

import java.util.Scanner;

public class Student {

	private int rollno;
	private String name;
	private  int marks;
	
	public Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void acceptStudentDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Roll no : ");
		this.rollno = sc.nextInt();
		
		System.out.println("Enter your name : ");
		this.name = sc.next();
		
		System.out.println("Enter your marks : ");
		this.marks = sc.nextInt();
	}
	
	public void  printStudentDetails() {
		System.out.println("Your Roll no is : "+rollno);
		System.out.println("Your name is : "+name);
		System.out.println("your marks are : "+marks);
	}


	
}
