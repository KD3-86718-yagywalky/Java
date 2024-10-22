package com.assignment.reverse;

import java.util.*;

public class StringReturn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		StringBuilder result = new StringBuilder();
		String result=null;
		
		System.out.print("Enter String :- ");
		
		String line = sc.next();
		
		for(int i = line.length()-1;i>0;i--)
		{
			
			result =  new StringBuilder(line).reverse().toString();
			
		}
		System.out.println(result);
	}

}
