package com.app.book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Book> bk = new HashSet<Book>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
		sdf.setLenient(false); // Ensures strict date parsing
		
		Date startDate = null;
		Date endDate = null;
		
		try {
			startDate = sdf.parse("10-05-2015");
			endDate = sdf.parse("24-12-2023");
		}catch(Exception e){
			
		}
		
		
		int flag = 0;
		while(true) {
			
			System.out.println("1.Display All books\n2.Find particular book\n3.Add new book\n4.Remove book\n5.Edit book quantity\n6.Exit");
			
			System.out.println("\nEnter the option : ");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1 : 
				
				if(bk.isEmpty()) {
					System.out.println("\nNothing to display !! ");
					System.out.println("Book storage is empty...");
				}
				else {
					System.out.println("\nDisplaying all stored books : ");
					
					List<Book> bookList = new ArrayList<Book>(bk);
					
					Collections.sort(bookList);
					
					for(Book b : bookList) {
						System.out.println(b);
					}
				}
				
				
				break;
				
			case 2 : 
				
				System.out.println("Enter the ID of book : ");
				String bIdFind = sc.next();
				
				int find=0;
				for(Book b : bk) {
					if(bIdFind.equals(b.getBid())) {
						
						System.out.println("\nBook is found !!");
						System.out.println(b);
						
						find=1;
						break;
					}
				}
				if(find==0) {
					System.out.println("\nBook is not found !!");
				}
				break;
				
			case 3 : 
				
				System.out.println("\nEnter the book ID : ");
				String bId = sc.next();
				
				//==================validating book unique ID==================================
				int check=0;
				for(Book b : bk) {
					if(bId.equals(b.getBid())) {
						System.out.println("\nThis ID is already used!!");
						System.out.println("Use different one...");
						
						check=1;
						
						break;
					}
				}
				
				if(check == 1) {
					break;
				}
				
				//=============================================================================
					
				System.out.println("Enter the price of book : ");
				double price = sc.nextDouble();
					
				System.out.println("Enter the Publish date of book : ");
				String publishDate = sc.next();
				//===================================================================================
				//validate date
				Date pubDate = null;
				try {
					pubDate = sdf.parse(publishDate);
					
					if(pubDate.before(startDate) || pubDate.after(endDate)) {
						System.out.println("\nDate is not within the allowed range (10-05-2015 to 24-12-2023)!!");
						break;
					}
				}catch(Exception e) {
					System.out.println("\nInvalid date format. Please enter the date in dd-MM-yyyy format!!");
					break;
				}
				
				//====================================================================================	
				System.out.println("Enter the Author Name of Book : ");
				String authorName = sc.next();
					
				System.out.println("Enter quantity of book : ");
				int quantity = sc.nextInt();
					
				System.out.println("Enter the category of book (science , fiction, health ,History, Mystery, Biography) : ");
				String categoryStr = sc.next().toUpperCase();
				try {
					Book.Category category = Book.Category.valueOf(categoryStr);
					
					bk.add(new Book(bId, category, price, publishDate, authorName, quantity));
					
					System.out.println("\nBook is added succefully !!");
					
				}catch(Exception e) {
					System.out.println("\nPlease enter correct category of book from [science , fiction, health ,History, Mystery, Biography]!!");
				}
				
				break;
				
			case 4 : 
				
				System.out.println("Enter the ID of book : ");
				String bIdRem = sc.next();
				
				int bFind=0;
				for(Book b : bk) {
					if(bIdRem.equals(b.getBid())) {
						
						System.out.println("\nBook is found !!");
						System.out.println(b);
						
						bk.remove(b);
						
						System.out.println("\nBook is removed !!");
						
						bFind=1;
						break;
					}
				}
				if(bFind==0) {
					System.out.println("\nBook is not found !!");
				}
				
				break;
				
			case 5 :
				
				System.out.println("Enter the ID of book : ");
				String bIdQuan = sc.next();
				
				System.out.println("Enter the new quantity : ");
				int newQuantity = sc.nextInt();
				
				int bQuan=0;
				for(Book b : bk) {
					if(bIdQuan.equals(b.getBid())) {
						
						System.out.println("\nBook is found !!");
						System.out.println(b);
						
						b.setQuantity(newQuantity);
						
						System.out.println("\nQuantity is updated !!");
						System.out.println(b);
						
						bQuan=1;
						break;
					}
				}
				if(bQuan==0) {
					System.out.println("\nBook is not found !!");
				}
				
				break;
				
			case 6 :
				
				System.out.println("Exiting...");
				flag = 1;
				
				break;
				
			default : 
				
				System.out.println("Please enter the correct option !!");
				
				break;
			}
			
			if(flag == 1) {
				break;
			}
			
			System.out.println("==================================================================================================================");
		}
		
		sc.close();
	}
}
