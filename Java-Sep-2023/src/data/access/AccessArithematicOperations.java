package data.access;

import access.modifiers.ArithematicOperations;

public class AccessArithematicOperations {
	
		
	public static void main(String[] args) {
		
		ArithematicOperations arOP = new ArithematicOperations();
		
//		System.out.println(arOP.addition(10, 20));  // private access in the created object
		
		System.out.println(arOP.substraction(30, 5)); // public access in the created object
		
//		System.out.println(arOP.multiplication(5, 6));  // protected access in the created object
		
//		System.out.println(arOP.division(13, 2)); // default access in the created object
		
//		System.out.println(ArithematicOperations.A);  // private access in the created object
		
//		System.out.println(arOP.B); //protected access in the created object
		
		System.out.println(ArithematicOperations.c); // public access in the created object
		
		System.out.println(arOP.d); // public access in the created object
	}

}
