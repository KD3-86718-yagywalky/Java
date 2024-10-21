package com.app.fruits;

import java.util.Scanner;

abstract class Fruit {
	
	String color;
	String name;
	double weight;
	boolean isFresh;
	
	public Fruit(String color, String name, double weight) {
		super();
		this.color = color;
		this.name = name;
		this.weight = weight;
	}
	
//	public void display()
//	{
//		System.out.print("Color :- "+color);
//		System.out.print("Weight :- "+weight);
//		System.out.print("Name :- "+name);
//		System.out.print("Fresh :- "+isFresh);
//		
//	}
//	
//	

	
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", name=" + name + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	abstract String taste();
}

