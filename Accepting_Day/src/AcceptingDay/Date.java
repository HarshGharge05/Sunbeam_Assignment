package AcceptingDay;

import java.util.Scanner;

public class Date {

		private int day;
		private String month;
		private int year;
		
		public void initDate() {
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter day : ");
			int day = sc.nextInt();
			this.day = day;
			
			System.out.println("Enter month : ");
			String month = sc.next();
			this.month = month;
			
			System.out.println("Enter year : ");
			int year = sc.nextInt();
			this.year = year;
		}
		
		public void printDate() {
			
			System.out.println("Date is : "+day+" "+month+" "+year);
		}

}
