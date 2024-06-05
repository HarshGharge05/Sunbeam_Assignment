package com.app.fruits;

import java.util.*;

public class Main {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of basket : ");
		int basketSize = sc.nextInt();
		
		String[] basket = new String[basketSize];
		
		int i = 0;
		while(true) {
			
			System.out.println("1. Add Apple\n2. Add Orange\n3. Mango\n4. Display the fruits in the basket\n5. Exit");
			System.out.println("Enter your choice : ");
			int opt = sc.nextInt();
			
			
			switch(opt) {
				case 1 :
					
					Fruit fr = new Apple("Red", 200, "Apple", true);
					
					fr.fruitInfo();
					fr.test();
					
					if(i < basketSize) {
						basket[i] = Fruit.getName();
						i++;
					}
					else {
						System.out.println("\nBasket is fulled !!");
					}
					
					break;
				
				case 2 : 
					
					Fruit fr1 = new Orange("Orange", 180, "Orange", true);
					
					fr1.fruitInfo();
					fr1.test();
					
					if(i < basketSize) {
						basket[i] = Fruit.getName();
						i++;
					}
					else {
						System.out.println("\nBasket is full !!");
					}
					
					break;
					
				case 3 : 
					
					Fruit fr2 = new Mango("Yellow", 210, "Mango", true);
					
					fr2.fruitInfo();
					fr2.test();
					
					if(i < basketSize) {
						basket[i] = Fruit.getName();
						i++;
					}
					else {
						System.out.println("\nBasket is full !!");
					}
					
					
					break;
				
				case 4 : 
					
					System.out.println("Basket contains fruits : ");
					
					for(i=0; i<basketSize; i++) {
						System.out.println(basket[i]);
					}
					
					break;
					
				case 5 : 
					System.out.println("Exiting...");
					break;
			}
			
//			i++;
			if(i>= basketSize) {
				
				System.out.println("\nBasket is full !!");
				
				System.out.println("\nBasket contains : ");
				
				for(i=0; i<basketSize; i++) {
					System.out.println(basket[i]);
				}
				System.out.println("\nExiting...");
				break;
			}
			
			System.out.println("==================================");
		}
	}
}
