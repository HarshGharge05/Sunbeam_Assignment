package FoodBill;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	public void foodMenu() {
		
		double totalBill=0;
		
		while(true) {
			System.out.println("=====Food Menu======");
			System.out.println("1.Dosa\n2.Samosa\n3.Idli\n4.VadaPav\n5.Icecreame\n6.Generate total bill\n7.Exit");
		
			System.out.print("Choose option : ");
			int opt = sc.nextInt();
			
			switch(opt){
				case 1 : 
					totalBill += 30;
					break;
			
				case 2 :
					totalBill += 20;
					break;
			
				case 3 : 
					totalBill += 25;
					break;
				
				case 4 : 
					totalBill += 10;
					break;
				
				case 5 : 
					totalBill += 50;
					break;
				
				case 6 : 
					System.out.println("Total Bill is : "+totalBill);
					break;
				
				case 7 :
					System.out.println("Total Bill is : "+totalBill);
					System.out.println("Exiting...");
					break;
			}
		
				if(opt==7) {
					break;
				}
		}
	}
	
}
