package access.modifiers;

public class ArithematicOperations {
	
	private static final int A =10;
	protected final int B = 20;
	
	public static int c = 30;
	public int d = 40;
	
	
	private int addition(int a, int b) {			
		return a+b;
	}

	public int substraction(int a, int b) {
		return a-b;
	}

	protected int multiplication(int a, int b) {
		return a*b;
	}

	int division(int a, int b) {
		return a/b;
	}
	
	
	public class InnerClass1{
		
	}
	
	protected class InnerClass2{
		
	}
	
	class InnerClass3{
		
	}
	
	private class InnerClass4{
		
	}
	
	public static void main(String[] args) {
		ArithematicOperations arOP = new ArithematicOperations();
		
		System.out.println(arOP.addition(10, 20));  // private access with in the class
		
		System.out.println(arOP.substraction(30, 5)); // public access with in the class
		
		System.out.println(arOP.multiplication(5, 6));  // protected access with in the class
		
		System.out.println(arOP.division(13, 2)); // default access with in the class
		
		System.out.println(ArithematicOperations.A);  // private access with in the class
		
		System.out.println(arOP.B); //protected access with in the class
		
		System.out.println(ArithematicOperations.c); // public access with in the class
		
		System.out.println(arOP.d); // public access with in the class
	}
}
