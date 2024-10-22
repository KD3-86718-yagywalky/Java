package com.assignment.string;

import java.util.Scanner;

public class Package01 {
	
	public static void main(String[] args) {
		
	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your line form here :- ");
		
		String line = sc.nextLine();
		
		try
		{
			if(line.length()>80)
				throw new ExceptionLineTooLong("The strings is too long");
		}catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}

}
}
