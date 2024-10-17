package taster;

import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) {
		
		Print2D p1 = new Print2D();
		Print2D p2 = new Print2D();
		
		p1.acceptPoints();
		p2.acceptPoints();
		
		if(p1.isEqual(p2))
			System.out.println("Both pointers are same");
		else
			System.out.println( p1.calculateDistance(p2));
		
		
		Print2D p3 = new Print2D();
		Print2D p4 = new Print2D();
		
		p3.acceptPoints();
		p4.acceptPoints();
		
		if(p3.isEqual(p4))
			System.out.println("Both pointers are same");
		else
			System.out.println( p3.calculateDistance(p4));
		
		

	}

}
