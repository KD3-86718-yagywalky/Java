package com.assignment;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i = new Invoice("1","One of the best item present in our shop",5,180000);
		i.displayDetails();
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		i.setquantity(-5);
		i.displayDetails();
		System.out.println("************************************************************");
		System.out.println("************************************************************");
	}

}
