import java.util.Scanner;

public class Assignment02_01 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number :- ");
	
	int Number = sc.nextInt();
	
	System.out.println("Number :- "+Number);
	System.out.println("Binary value of " + Number +"is :- " +Integer.toBinaryString(Number) );
	System.out.println("Octal value of " + Number +"is :- " +Integer.toOctalString(Number) );
	System.out.println("Hex value of " + Number +"is :- " +Integer.toHexString(Number) );

	}
	
}

