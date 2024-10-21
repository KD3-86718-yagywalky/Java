package com.sunbeam.try1;

import java.util.Scanner;

interface Shape
{
	double pi = 3.14;
	
	public void accept(Scanner sc);
	
	public void calculateShape();
}

class Rectangle implements Shape
{
	double height;
	double width;
	@Override
	public void accept(Scanner sc) {
		
	 System.out.println("Enter Height :- ");
	 height = sc.nextDouble();
	 System.out.println("Enter Width :- ");
	 width = sc.nextDouble();

	}
	@Override
	public void calculateShape() {
		
		System.out.println("Area of the Rectangle is :- "+(height*width));
		
	}
		
}

class Circle implements Shape
{
	double radius;
	
	@Override
	public void accept(Scanner sc) {
		
	 System.out.println("Enter Radius :- ");
	 radius = sc.nextDouble();

	}
	@Override
	public void calculateShape() {
		
		System.out.println("Area of the Rectangle is :- "+(pi*radius*radius));
		
	}
		
}

class Cylinder implements Shape
{
	double height;
	double radius;
	@Override
	public void accept(Scanner sc) {
		
	 System.out.println("Enter Height :- ");
	 height = sc.nextDouble();
	 System.out.println("Enter Radius :- ");
	 radius = sc.nextDouble();

	}
	@Override
	public void calculateShape() {
		
		System.out.println("Volumn of the Cylinder is :- "+((pi*Math.pow(radius,2)*height)/3));
		
	}
		
}

class Sphere implements Shape
{
	double radius;
	
	@Override
	public void accept(Scanner sc) {
		
	 System.out.println("Enter Radius :- ");
	 radius = sc.nextDouble();
	}
	@Override
	public void calculateShape() {
		
		System.out.println("Area of the Sphere is :- "+((4*radius*radius*radius)/3));
		
	}
		
}


public class Try01 {
	
	public static int menu(Scanner sc)
	{
		System.out.println("0. Exit");
		System.out.println("1. Rectagle");
		System.out.println("2. Circle");
		System.out.println("3. Cylinder");
		System.out.println("4. sphere");
		System.out.println("Enter Choice :- ");
		int choice = sc.nextInt();

		return choice;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Shape s =null;
		int choice;
		
		while((choice = menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				s = new Rectangle();
				break;

			case 2:
				s = new Circle();
				break;

			case 3:
				s = new Cylinder();
				break;
				
			case 4:
				s = new Sphere();
				break;
				
			default:
				System.out.println("Entered a Wrong input");
				break;
			}
			
			if(s!=null)
			{
				s.accept(sc);
				s.calculateShape();
			}
			
		}
	}

}
