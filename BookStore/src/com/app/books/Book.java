package com.app.books;


public class Book {
	
	 public enum Category {
	        FICTION, NONFICTION, SCIENCE, HISTORY, TECHNOLOGY, ART, OTHER
	    }

	private String bId;
	private Category category;
	private double price;
	private String publishDate;
	private String authorName;
	private int quantity;
	
	public void set(String bId, Category category, double price, String publishDate, String authorName, int quantity) {
		
		this.bId = bId;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.setQuantity(quantity);
	}
	
	public String toString() {
		return "Book-"+getbId() +" "+category +" "+price +" "+publishDate +" "+authorName +" "+getQuantity();
	}

	public String getbId() {
		return this.bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
