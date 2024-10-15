import java.util.Scanner;

public class Assignment01 {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		double Num1;
		double Num2;
		double avg;
		
		System.out.println("Enter Num1 :- ");
		
		if(num.hasNextDouble() && !num.hasNextInt())
		{
			Num1 = num.nextDouble();
			
			System.out.println("Enter Num2:- ");
			
			if(num.hasNextDouble() && !num.hasNextInt())
			{
				Num2 = num.nextDouble();
				
				avg =(Num1+Num2)/2;
			
				System.out.println("Average of Two Numbers :- "+avg);			
			}
			
			else
			{
				System.out.println("Error");
			}
		}
		
		else
		{
			System.out.println("Error");
		}
	}
}
