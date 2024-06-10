package com.app.Book;

class Book implements Comparable<Book>{
	
	 public enum Category {
		 SCIENCE , FICTION, HEALTH ,HISTORY, MYSTERY, BIOGRAPHY
	 }

	private String bId;
	private Category category;
	private double price;
	private String publishDate;
	private String authorName;
	private int quantity;
	
	public Book(String bId, Category category, double price, String publishDate, String authorName, int quantity) {
		
		this.bId = bId;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Book-"+bId +" "+category+" "+price+" "+publishDate+" "+authorName+" "+quantity;
	}
	
	public String getBid() {
		return this.bId;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.authorName.compareTo(o.authorName);
	}
	}
