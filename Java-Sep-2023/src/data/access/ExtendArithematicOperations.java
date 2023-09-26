package data.access;

import access.modifiers.ArithematicOperations;

public class ExtendArithematicOperations extends ArithematicOperations{
	
	public static void main(String[] args) {
		
		ExtendArithematicOperations exOp = new ExtendArithematicOperations();
		
//		System.out.println(exOp.addition(10, 20));  // private access in parent class
		
		System.out.println(exOp.substraction(30, 5)); // public access in the parent lass
		
		System.out.println(exOp.multiplication(5, 6));  // protected access in parent class
		
//		System.out.println(exOp.division(13, 2));  // default in parent class
		
//		System.out.println(ArithematicOperations.A); // private access in the parent class
		
		System.out.println(exOp.B); // protected access in parent class
		
		System.out.println(ArithematicOperations.c); // public access in parent class
		
		System.out.println(exOp.d); // public access in parent class
		

	}

}
