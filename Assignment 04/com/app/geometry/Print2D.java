package com.app.geometry;

import java.util.Scanner;

public class Print2D{
	
	int x;
	int y;
	
	public Print2D()
	{
		this(0,0);
	}

	public Print2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails()
	{
		return "Point2D[x:"+x+",y:"+y+"]";
	}
	
	public boolean isEqual(Print2D o)
	{
		return this.x==o.x && this.y==o.y;
	}
	
	public double calculateDistance(Print2D o)
	{
		return Math.sqrt(Math.pow((this.x - o.x), 2)+Math.pow((this.y - o.y), 2));
	}
	
	public void acceptPoints()
	{
		Scanner po = new Scanner(System.in);
		
		System.out.print("Enter x axis value :- ");
		this.x = po.nextInt();
		System.out.println();
		System.out.print("Enter y axis value :- ");
		this.y = po.nextInt();
		System.out.println();
	}
}




