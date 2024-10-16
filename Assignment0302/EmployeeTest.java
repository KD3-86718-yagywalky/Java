package assignment03;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("Deependra", "Sharma",50000);
		e.displayDetails();
		System.out.println("************************************************************");
		System.out.println("Salary after promotion");
		e.setSalary(60000);
		e.displayDetails();
		System.out.println("************************************************************");
		e.displayUpdateSalary();
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		
		Employee e1 = new Employee("Ankush", "Kumar",70000);
		e1.displayDetails();
		System.out.println("************************************************************");
		System.out.println("Earning after Termination");
		e1.setSalary(-60000);
		e1.displayDetails();
		System.out.println("************************************************************");
		e1.setSalary(50000);
		e1.displayDetails();
		System.out.println("************************************************************");
		e1.displayUpdateSalary();
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		System.out.println("************************************************************");

	}

}
