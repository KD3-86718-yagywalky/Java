package com.assignment;

public class Invoice
{
	String part_number;
	String description;
	int quantity;
	double price;
	double Total_Amount;
	
	public Invoice()
	{
		this(" "," ",0,0.0);
	}

	public Invoice(String part_number, String description, int quantity, double price) {
		
		this.part_number=part_number;
		this.description=description;
		this.quantity=quantity;
		this.price=price;
		
	}
	
	
	public String getpartno()
	{
		return part_number;
	}
	
	public String getdescription()
	{
		return description;
	}
	
	public int getquantity()
	{
		return quantity;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public void setpartno(String p)
	{
		part_number = p;
	}
	
	public void setdescription(String d)
	{
		description = d;
	}
	
	public void setquantity(int q)
	{
		quantity = q;
	}
	
	public void setprice(double p)
	{
		price = p;
	}
	
	public void setTotalAmount()
	{
		if(quantity<0)
		{
			setquantity(0);
		}
		
		else if(price<0)
		{
			setprice(0.0);
		}
		
		else 
		{
			Total_Amount = quantity*price;
		}
	}
	
	public void displayDetails()
	{
		System.out.println("Part_Number :- "+part_number);
		System.out.println("Description :- "+description);
		
		if(quantity<0)
		{
			setquantity(0);
			System.out.println("Quantity :- " +quantity);
		}
		else
		{
			System.out.println("Quantity :- " +quantity);
		}
		
		if(price<0)
		{
			setprice(0.0);
			System.out.println("Price :- " +price);
		}
		else
		{
			System.out.println("Price :- " +price);
		}
		
		System.out.println("Total Amount of Parts :- "+(quantity*price));
	}
	
}



