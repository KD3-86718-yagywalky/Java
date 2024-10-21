package com.sunbeam.try1;

import java.util.Scanner;

public class Try02 {
	
	public static void division(int a, int b) {
		
		int result = a/b;
		
		System.out.println("Result :- "+result);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		try {
			division(n,m);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Cannot divide by zero");			
	}

}
