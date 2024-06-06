package com.app.books;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book b[] = new Book[10];
		
		int bcnt = 0;
		
		int flag = 0;
		while(true) {
			System.out.println("1.Display All books\n2.Find particular book\n3.Add new book\n4.Remove book\n5.Edit book quantity\n6.Exit");
			
			System.out.println("\nEnter the option : ");
			int opt = sc.nextInt();
			
			
			switch(opt) {
			case 1:
				if(bcnt != 0) {
					System.out.println("\nDisplaying all stored books : \n");
					for(int i = 0; i<bcnt; i++) {
						System.out.println(b[i]);
					}
					
				}
				else {
					System.out.println("Storage is empty !!");
				}
				
				break;
				
			case 2:
				
				System.out.println("Enter the ID of book : ");
				String bIdFind = sc.next();
				
				int bFound = 0;
				for(int i = 0; i<bcnt; i++) {
					if(bIdFind.equals(b[i].getbId())) {
						System.out.println("\nBook is found !!");
						System.out.println(b[i]);
						
						bFound = 1;
						
						break;
					}
				}
				if(bFound == 0){
					System.out.println("\nBook is not found !!");
					
					break;
				}
				
				break;
				
			case 3:
				
				
				if(bcnt<b.length) {
					System.out.println("Enter the book ID : ");
					String bId = sc.next();
					
//					try {
//						System.out.println("Enter the category of book (FICTION, NONFICTION, SCIENCE, HISTORY, TECHNOLOGY, ART, OTHER) : ");
//						String categoryStr = sc.next().toUpperCase();
//						Book.Category category = Book.Category.valueOf(categoryStr);
//					}
//					catch(Exception e) {
//						System.out.println("Please enter category from given set");
//					}
					
					System.out.println("Enter the category of book (FICTION, NONFICTION, SCIENCE, HISTORY, TECHNOLOGY, ART, OTHER) : ");
					String categoryStr = sc.next().toUpperCase();
					Book.Category category = Book.Category.valueOf(categoryStr);
					
					System.out.println("Enter the price of book : ");
					double price = sc.nextDouble();
					
					System.out.println("Enter the Publish date of book : ");
					String publishDate = sc.next();
					
					System.out.println("Enter the Author Name of Book : ");
					String authorName = sc.next();
					
					System.out.println("Enter quantity of book : ");
					int quantity = sc.nextInt();
					
					
					b[bcnt] = new Book();
					b[bcnt].set(bId, category, price, publishDate, authorName, quantity);
					
					bcnt++;
					
				}
				else {
					System.out.println("\nStorage is fulled !!");
				}
				
				break;
				
			case 4:
				
				System.out.println("Enter the ID of book : ");
				String bIdDel = sc.next();
				
				int deleted = 0;
				for(int i = 0; i<bcnt; i++) {
					if(bIdDel.equals(b[i].getbId())) {
						
						System.out.println("\nBook is found !!");
						
						for(int j=i; j<bcnt-1; j++) {
							b[j] = b[j+1];
						}
						
						b[bcnt-1] = null;
						bcnt--;
						
						deleted=1;
						
						System.out.println("Book is deleted !!");
						
						break;
					}
				}
				
				if(deleted == 0) {
					System.out.println("\nBooke is not found!!");
				}
				
				break;
				
				
			case 5:
				
				System.out.println("Enter the ID of book : ");
				String updQty = sc.next();
				
				int found = 0;
				for(int i = 0; i<bcnt; i++) {
					if(updQty.equals(b[i].getbId())) {
						System.out.println("\nBook is found !!");
						System.out.println(b[i]);
						
						System.out.println("\nEnter the new Quantity : ");
						int newQty = sc.nextInt();
						
						System.out.println("\nQuantity is updated !!");
						b[i].setQuantity(newQty);
						System.out.println(b[i]);
						
						found = 1;
							
						break;
					}
					
				}
				
				if(found == 0) {
					System.out.println("\nBook is not found !!");
				}
				
				break;
				
			case 6:
				System.out.println("\nExiting...");
				flag = 1;
				
				break;
				
			default:
				System.out.println("\nPlease Enter correct choice !!");
				
				break;
			
			}
			
			if(flag == 1) {
				break;
			}
			
			System.out.println("============================================================");
		}
		
		sc.close();
	}
}
