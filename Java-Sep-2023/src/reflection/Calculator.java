package reflection;

public class Calculator {
	
	public int addition(int a, int b) {			
		System.out.println(a+b);
		return a+b;
	}

	public int substraction(int a, int b) {
		System.out.println(a-b);
		return a-b;
	}

	public int multiplication(int a, int b) {
		System.out.println(a*b);
		return a*b;
	}

	private int division(int a, int b) {
		System.out.println("Division Private method: "+a/b);
		return a/b;
	}
}
