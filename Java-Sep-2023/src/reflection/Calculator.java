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

	private int division() {
		System.out.println("Division Private method: "+10/3);
		return 10/3;
	}
}
