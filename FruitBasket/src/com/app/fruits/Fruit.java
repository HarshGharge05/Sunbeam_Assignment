package com.app.fruits;

public class Fruit {

	protected String color;
	protected double weight;
	protected static String name;
	protected boolean fresh;
	
	public static String getName() {
		return name;
	}
	
	public void fruitInfo() {
		System.out.println("color of "+name +" is "+this.color);
		System.out.println("weight of "+name +" is "+this.weight);
		
		if(this.fresh == true){
			System.out.println(name +" is "+" fresh");
		}
		else {
			System.out.print(name +" is not "+" fresh");
		}
	}
	
	public void test() {
		if(this.name == "Apple") {
			System.out.println("Test of "+this.name+" is sweet and sour");
		}
		else if(this.name == "Orange") {
			System.out.println("Test of "+this.name+" sour");
		}
		else if(this.name == "Mango") {
			System.out.println("Test of "+this.name+" is sweet");
		}
				
	}
}
