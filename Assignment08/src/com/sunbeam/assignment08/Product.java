package com.sunbeam.assignment08;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Product implements Serializable,Comparable<Product>{
	
	/**
	 * 
	 */
	
	//Each project information includes int id, String title, int teamSize, double projectCost , String 
	//technology. 
	private static final long serialVersionUID = 1L;
	
	int id;
	String title ;
	int teamSize; 
	double projectCost; 
	String technology;
	
	public Product()
	{
		
	}

	public Product(int id, String title, int teamSize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public Product(int id) {
		super();
		this.id = id;
	}
	
	public void accept(Scanner sc) {
		System.out.println("ENTER PRODUCTS DETAILS ---------------------");
		System.out.print("Enter product id :- ");
		id = sc.nextInt();
		System.out.print("Enter Title:- ");
		title = sc.next();
		System.out.print("Enter teamSize :- ");
		teamSize = sc.nextInt();
		System.out.print("Enter ProjectCost :- ");
		projectCost = sc.nextDouble();
		System.out.print("Enter Technology :- ");
		technology = sc.next();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}

	@Override
	public int compareTo(Product o) {
		
		return this.id - o.id;
	}
	
	
	
	
	

	
}
