package com.app.BookStore;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.app.BookStore.Book.Category;


public class Main {
	
	private static HashSet<Book> bk = new HashSet<>();
	public static final String PATH_NAME = "Book.dat";
	
//	public static void readRecord() {
//		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH_NAME));) {
//			bk = (HashSet<Book>) ois.readObject();
//			
//			for(Book b : bk) {
//				System.out.println(b);
//			}
//			
//		} catch (Exception e) {
//			System.out.println("Error reading from file: " + e.getMessage());
//		}
//	}
	
	public static HashSet<Book> readRecord() throws FileNotFoundException, IOException, ClassNotFoundException  {
		try(ObjectInputStream ios = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File (PATH_NAME))));){
			return (HashSet<Book>)ios.readObject();	
		} 
	}
	
//	public static void writeRecord(Book bk) {
//		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(PATH_NAME))))) {
//			oos.writeObject(bk);
//		} catch (Exception e) {
//			System.out.println("Error writing to file: " + e.getMessage());
//		}
//	}
	
	public static void writeRecord(HashSet<Book> bookList) throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File (PATH_NAME))));){
			oos.writeObject(bookList);
		}
	}	

public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		
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
				
//				if(bk.isEmpty()) {
//					System.out.println("\nNothing to display !! ");
//					System.out.println("Book storage is empty...");
//				}
//				else {
					System.out.println("\nDisplaying all stored books : ");
					
					bk = readRecord();
					
					if(bk.isEmpty()) {
						System.out.println("\nNothing to display !! ");
						System.out.println("Book storage is empty...");
					}
					
					for(Book b : bk) {
						System.out.println(b);
					}
//				}
				
				
				break;
				
			case 2 : 
				
				System.out.println("Enter the ID of book to find : ");
				String bIdFind = sc.next();
				
				bk = readRecord();
				
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
					
				//=========================================================================================	
					//adding data in the file
//					try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File (PATH_NAME))));){
//						
//						bk.add(new Book(bId, category, price, publishDate, authorName, quantity));
//						
//						oos.writeObject(bk);
//					}
//					writeRecord(bId, price, publishDate, authorName, quantity, categoryStr);
					
				//=========================================================================================
					
					System.out.println("\nBook is added successfully !!");
					
				}catch(Exception e) {
					System.out.println("\nPlease enter correct category of book from [science , fiction, health ,History, Mystery, Biography]!!");
				}
				
				try {
					Book.Category category = Book.Category.valueOf(categoryStr);
					
					bk.add(new Book(bId, category, price, publishDate, authorName, quantity));
					
					writeRecord(bk); // Save books to file
					
//					try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(PATH_NAME))))) {
//						oos.writeObject(bk);
//					} catch (Exception e) {
//						System.out.println("Error writing to file: " + e.getMessage());
//					}
					
					
					
					System.out.println("\nBook is added successfully !!");
					
				} catch (Exception e) {
					System.out.println("\nPlease enter correct category of book from [science, fiction, health, History, Mystery, Biography]!!");
				}
				
				break;
				
			case 4 : 
				
				System.out.println("Enter the ID of book to remove : ");
				String bIdRem = sc.next();
				
				int bFind=0;
				
				for(Book b : bk) {
					if(bIdRem.equals(b.getBid())) {
						
						System.out.println("\nBook is found !!");
						System.out.println(b);
						
						bk.remove(b);
						
						writeRecord(bk);
						
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
				
				bk = readRecord();
				
				for(Book b : bk) {
					if(bIdQuan.equals(b.getBid())) {
						
						System.out.println("\nBook is found !!");
						System.out.println(b);
						
						b.setQuantity(newQuantity);
						
						writeRecord(bk);
						
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
