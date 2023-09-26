package data.access;

import access.modifiers.Calculations;

public class ExtendCalculationsFromJar  extends Calculations{

	public static void main(String[] args) {
		ExtendCalculationsFromJar calC = new ExtendCalculationsFromJar();
		
//		System.out.println(exOp.addition(10, 20));  // private access in parent class
		
		System.out.println(calC.substraction(30, 5)); // public access in the parent lass
		
		System.out.println(calC.multiplication(5, 6));  // protected access in parent class
		
//		System.out.println(exOp.division(13, 2));  // default in parent class
		
//		System.out.println(Calculations.A); // private access in the parent class
		
		System.out.println(calC.B); // protected access in parent class
		
		System.out.println(Calculations.c); // public access in parent class
		
		System.out.println(calC.d); // public access in parent class

	}

}
