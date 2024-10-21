package com.app.fruits;

public class Mango extends Fruit{
	

	public Mango(String color, String name, double weight) {
		super(color, name, weight);
	}
	
//	@Override
//	public void display() {
//	
//		super.display();
//		taste();
//	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	String taste() {
		
		return "Sweet";
	}

}
