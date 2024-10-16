package assignment03;

public class Employee {
	
	String first_name;
	String last_name;
	double salary;
	
	public Employee()
	{
		this("","",0.0);
	}

	public Employee(String first_name, String last_name, double salary) {
		
		this.first_name=first_name;
		this.last_name=last_name;
		this.salary=salary;
	}
	
	public void setSalary(double s)
	{
			salary = s;	
	}
	
	public void setFirstName(String s)
	{
		first_name=s;
	}
	
	public void setLastName(String l)
	{
		last_name=l;
	}
	
	public String getFirstName()
	{
		return first_name;
	}
	
	public String getLastName()
	{
		return last_name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void displayDetails()
	{
		System.out.println("First Name :- "+first_name);
		System.out.println("Last Name :- "+last_name);
		
		if(salary<0)
		{
			System.out.println(" Monthly Salary :- "+0);
			System.out.println(" Year Salary :- "+0);
		}
		else 
		{
			System.out.println("Monthly Salary :- "+salary);
			System.out.println("Yearly Salary :- "+(salary*12));
		}
	}
	
	public void displayUpdateSalary()
	{
		System.out.println("Congratulation !");
		System.out.println("Your salary get increase by 10% :) :)");
		System.out.println("Updated monthly salary "+(salary*1.1));
		System.out.println("Updated yearly salary "+(salary*1.1*12));
	}
	

}
