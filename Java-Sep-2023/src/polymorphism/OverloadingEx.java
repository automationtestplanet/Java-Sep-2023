package polymorphism;

public class OverloadingEx {
	
	static int addition(int a, int b) {			
//		System.out.println(a+b);
		return a+b;
	}
	
//	static long addition(int a, int b) {			
//		return a+b;
//	}
	
	int addition(int a, int b, int c) {			
		return this.addition(a,b) + c;
	}
	
	String addition(String a, String b) {			
		return a + " " +b;
	}
	
	static double addition(float a, float b) {			
		return a+b;
	}
	
	static double addition(float a, int b) {			
		return a+b;
	}
	
	int substraction(int a, int b) {
//		System.out.println(a-b);
		return a-b;
	}

	int multiplication(int a, int b) {
		System.out.println(a*b);
		return a*b;
	}

	int division(int a, int b) {
		System.out.println(a/b);
		return a/b;
	}
	
	static void display() {
		
	}

	public static void main(String[] args) {
		
		OverloadingEx overloadingEx = new OverloadingEx();
		
		System.out.println(overloadingEx.addition(10, 20));
		
		System.out.println(overloadingEx.addition(10, 20,30));
		
		System.out.println(overloadingEx.addition("Hello","Java"));
		
		System.out.println(overloadingEx.addition(10.5F, 20.0F));
	
	}

}
