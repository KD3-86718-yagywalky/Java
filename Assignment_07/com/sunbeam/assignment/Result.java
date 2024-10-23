package com.sunbeam.assignment;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class StdCityCompatatorAsc implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
	
}

class StdMarksCompatatorDesc implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}

class StdNameComparatorAsc implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class Result {
	
	public static int menu(Scanner sc) {
		
		
		System.out.println("0. EXIT"); 
		System.out.println("1. sorted on their city (asc)"); 
		System.out.println("2. sorted on their on marks (desc)");	 
		System.out.println("3. sorted on their on name (asc) ");	
		System.out.println("4. sorted on the rollno");	
		System.out.print("Enter choice :- ");
		int choice = sc.nextInt();
		return choice;
		
	}
	
	public static void display(Student[] arr) 
	{
		System.out.println("*************************************************");
		for (Student student : arr) {
			System.out.println(student);
			System.out.println();
		}
		System.out.println("*************************************************");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[5];
		
		Comparator<Student> comparator;	
		
		arr[0]=new Student(100,"Rahul","Pune",214);
		arr[1]=new Student(101,"Rohan","Mumbai",248);
		arr[2]=new Student(102,"Mahesh","Karad",240);
		arr[3]=new Student(103,"Nish","Nashik",150);
		arr[4]=new Student(104,"Sameer","Bankok",250);
		
		int choice;
		
		while ((choice=menu(sc))!=0) {
			
		switch (choice) {
		case 1:
			{
				comparator = new StdCityCompatatorAsc();
				Arrays.sort(arr, comparator);
				display(arr);
				
			}
			break;
			
		case 2:
		{
			comparator = new StdMarksCompatatorDesc();
			Arrays.sort(arr,comparator);
			display(arr);
		}
		break;
		
		case 3:
		{
			comparator = new StdNameComparatorAsc();
			Arrays.sort(arr,comparator);
			display(arr);
		}
		break;
		
		case 4:
		{
			Arrays.sort(arr);
			display(arr);
		}
		break;
		default:
			System.out.println("*************************************************");
			System.out.println("Wrong input ....................");
			System.out.println("*************************************************");
			break;
		}
		}
		
		
		
		
	}
	
	

}
