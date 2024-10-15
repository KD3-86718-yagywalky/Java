import java.util.Scanner;

public class Assignment02_02 {

	public static void main(String[] args) {
		
	
	int choice;
	int count=0;
	double TotalAmount=0;
	
	do
	{
		
		System.out.println("0.Exit");
		System.out.println("1.Dosa");
		System.out.println("2.Samosa");
		System.out.println("3.Idli");
		System.out.println("4.chart");
		System.out.println("5.Petis");
		System.out.println("6.Masala Milk");
		System.out.println("7.Noodles");
		System.out.println("8.fried Rice");
		System.out.println("9.Pizza");
		System.out.println("10.Total Amount");
		
		Scanner sc = new Scanner(System.in);
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 0: 
		{	System.out.println("ThankYou!..... For having meal with us");
			break;
		}
		case 1:
		{
			System.out.println("Dosa");
			double price = 50;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 2:
		{
			System.out.println("Samosa");
			double price = 40;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 3:
		{
			System.out.println("idli");
			double price = 45;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 4:
		{
			System.out.println("Chart");
			double price = 65.50;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 5:
		{
			System.out.println("Petis");
			double price = 35;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 6:
		{
			System.out.println("Masala Milk");
			double price = 40;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 7:
		{
			System.out.println("Noodles");
			double price = 85.5;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 8:
		{
			System.out.println("Fried Rice");
			double price = 80.25;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 9:
		{
			System.out.println("Pizza");
			double price = 625.45;
			count++;
			TotalAmount=TotalAmount + price;
		}	break;
		case 10:
		{
			System.out.println("TotalAmount :- "+TotalAmount);
		}	break;
		
		default :
		{
			System.out.println("Input Wrong Number!.......\n" + "Please enter right number");
		}	break;
		
		}
		
	}while(choice !=0 );
}
}
