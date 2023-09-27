package data.access;

import abstraction.Calculations;
import abstraction.CalculationsAccess;

public class UsingAbstractClassFromJar {

	public static void main(String[] args) {
		
		Calculations calcAcc = new CalculationsAccess();
		
		System.out.println(calcAcc.addition(10, 20));
		
		System.out.println(calcAcc.substraction(30, 5));
		
		System.out.println(calcAcc.multiplication(30, 3));	
		
		System.out.println(calcAcc.division(13, 2));		
		
	}

}
