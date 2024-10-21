package com.app.fruits;

public class Apple extends Fruit{


		
		public Apple(String color, String name, double weight) {
			super(color, name, weight);
			
		}

		
//		@Override
//		public void display() {
//			super.display();
//			taste();
//		}
		
		@Override
		public String toString() {
		return super.toString();
		}

		@Override
		String taste() {
			
			return "sweet n sour";
		}
		
	}


