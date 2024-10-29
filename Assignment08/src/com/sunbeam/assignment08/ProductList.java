package com.sunbeam.assignment08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ProductList {
		
	private static int menu(Scanner sc) {
		
		System.out.println("**********************************************************************");
		System.out.println("0. EXIT ");
		System.out.println("1. Add Following Projects in the Set");
		System.out.println("2. Input a Project from user and add in Set");   
		System.out.println("3. Display all Projects in Set");  
		System.out.println("4. Delete a Project by Id from Set "); 
		System.out.println("5. Copy All Projects from Set to ArrayList");
		System.out.println("6. Display all Projects from List  ");
		System.out.println("7. Sort all Projects in List by cost");  
		System.out.println("8. Find project with Max team size using Collections.max()");
		System.out.println("9. Count all Projects of \"Java\" technology using Stream API ");
		System.out.print("Enter Your choice :- ");
		return sc.nextInt();
		
		
	

	}

	public static void main(String[] args) {
		
		Set<Product> product = new HashSet<Product>();
		List<Product> listOfProduct = new ArrayList<Product>();
//		
		Scanner sc = new Scanner(System.in);
		Product p;
		
		int choice;
		
		while((choice = menu(sc))!=0)
		{
			System.out.println("**********************************************************************");

			switch(choice)
			{
			case 1: 
				{
					product.add(new Product(1, "Train Reservation System",3, 5000000,"Java"));
					product.add(new Product(2, "Airline Reservation System",3, 6000000, ".NET"));
					product.add(new Product(4, "Online Grocery Shop", 6, 3000000, "Java"));
					product.add(new Product(5, "Online Book Shop", 2, 3000000, ".NET"));
					product.add(new Product(3, "Online Jewelry Shop", 4, 4000000, "Java"));
					product.add(new Product(2, "Bus Reservation System", 3, 3500000, "JS"));
				}	
				break;
			case  3:
				{
					product.forEach(System.out::println);
				}
				break;
				
			case 2: 
					saveProduct(product);
				break;
				
			case 4: 
				{
					product.remove(new Product(sc.nextInt()));
				}
				break;
			case 5: 
				{				
					listOfProduct.addAll(product);
				}
				break;
			
			case 6:
				{
					listOfProduct.forEach(System.out::println);
				}
				break;
			
			case 7:
				{
					listOfProduct.sort((p1,p2) -> Double.compare(p1.projectCost, p2.projectCost));
				}
				break;
			case 8:
				{
					System.out.println(product.stream().max((p1,p2) -> p1.teamSize - p2.teamSize));
				}
				break;
			case 9:
				{
					System.out.println("Number of projects using java Technology :- "+product.stream().filter((e)-> e.technology.equals("Java")).count()); 
				}
			}	
		}
		
	}
	
	public static void saveProduct(Set<Product> product) {
		
		try(FileOutputStream fos = new FileOutputStream("product.db"))
		{
		try(BufferedOutputStream bos = new BufferedOutputStream(fos))
		{
		try(ObjectOutputStream oos = new ObjectOutputStream(bos))
		{
			oos.writeObject(product);
			
		}
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void loadProduct() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("product.db"))))
		{
			Set<Product> product = (Set<Product>) ois.readObject();
			product.forEach(System.out::println);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
