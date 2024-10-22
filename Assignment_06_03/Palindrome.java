package com.assignment.palindrome;

import java.util.*;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter String :- ");
		
		String line = scan.next();
		
		String result = new StringBuilder(line).reverse().toString();
		
		if(line.equalsIgnoreCase(result))
		{
			System.out.println("This is a Palindrome ");
		}
		else 
			System.out.println("This is not a Palindrome");
	}
}
