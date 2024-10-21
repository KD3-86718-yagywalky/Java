package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		
		int choice = sc.nextInt();
		return choice;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Basket Capacity - ");
		int n = sc.nextInt();
		
		Fruit[] f = new Fruit[n];
		
		int choice;
		
		int index = 0;
		
		while((choice = menu(sc))!=0)
		{
			switch (choice) {
			case 1:
			{
				if(index<n)
				{
					f[index]= new Mango("Yellow","Mango",1.5);
					System.out.println("Fruit in the basket");
					f[index].setFresh(true);
					index++;
				}
				else {
					System.out.println("Basket is Full");
				}
			}
				break;
				
			case 2:
			{
				if(index<n)
				{
					f[index]= new Orange("Orange","Orange",1);
					System.out.println("Fruit in the basket");
					f[index].setFresh(true);
					index++;
				}
				else {
					System.out.println("Basket is Full");
				}
				
			}
				break;
			case 3:
			{
				if(index<n)
				{
					f[index]= new Apple("Red","Apple",0.5);
					System.out.println("Fruit in the basket");
					f[index].setFresh(true);
					index++;
				}
				else {
					System.out.println("Basket is Full");
				}
				
			}
				break;
			case 4:
			{
				for(Fruit g : f)
				{
					System.out.println(g.getName()); 
				}
			}
				break;
			case 5:
			{
				for(Fruit g : f)
				{
					System.out.println(g.toString());	
					System.out.println(g.taste());
				}
			}
				break;	
			case 6:
			{
				for(Fruit g : f)
				{
					if(!g.isFresh)
						System.out.println(g.taste());
				}
			}
				break;	
			case 7:
			{
				int ch = sc.nextInt();
				if(ch<f.length && ch>=0 && f[ch]!=null)
				{
				f[ch].setFresh(false);
				}
				else
				{
					System.out.println("Wrong Index ");
				}
			}
				break;	
			case 8:
			{
				for(Fruit g : f)
				{
					g.setFresh(false);
				}
			}
				break;	

			default:
				System.out.println("Wrong Input....");
				break;
			}
		}
		
	}

}
