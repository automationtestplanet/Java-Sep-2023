package data.access;

import abstraction.ProvideAccessToAsbtractClass;

//import abstraction.ImplementAbstractClassMethods;  // default class can not be imported

import abstraction.AbstractCalculations;

 class AccessAbstractClass extends  ProvideAccessToAsbtractClass{

	AccessAbstractClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		AccessAbstractClass accAbsCls = new AccessAbstractClass("JAVA");
		
		ProvideAccessToAsbtractClass provAccABsCls = accAbsCls;  // upcasting
		
//		ImplementAbstractClassMethods implAbsCls = accAbsCls;  // cannot decalare default class of other package 
		
		AbstractCalculations absCls = accAbsCls;
		
		AbstractCalculations absCls1 = new AccessAbstractClass("JAVA");
		
		System.out.println(absCls1.addition(10, 20));
		
		System.out.println(absCls1.substraction(20, 5));
		
		System.out.println(absCls1.multiplication(10, 10));
		
		System.out.println(absCls1.division(13, 2));
	}

}
