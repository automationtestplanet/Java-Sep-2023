package data.access;

import access.modifiers.Calculations;

public class AccessCalculationsFromJar {

	public static void main(String[] args) {
		
		Calculations calC = new Calculations();
		
//		System.out.println(calC.addition(10, 20));  // private access in the created object
		
		System.out.println(calC.substraction(30, 5)); // public access in the created object
		
//		System.out.println(calC.multiplication(5, 6));  // protected access in the created object
		
//		System.out.println(calC.division(13, 2)); // default access in the created object
		
//		System.out.println(Calculations.A);  // private access in the created object
		
//		System.out.println(calC.B); //protected access in the created object
		
		System.out.println(Calculations.c); // public access in the created object
		
		System.out.println(calC.d); // public access in the created object
		
	}

}
