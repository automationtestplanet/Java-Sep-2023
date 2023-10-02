package exceptions;

public class ExceptionsExamples {
	
	void method1() {
		System.out.println("This is Method1");
	}

	static String globalVariale;
	public static void main(String[] args) {
		
		int a =10;
		int b = 2;
		
		String string1 = "Hello";
		
		ExceptionsExamples exceptionExamples = new ExceptionsExamples();
		
//		ExceptionsExamples exceptionExamples = null;
		
//		try {
//			System.out.println("Division: "+ a/b);
//			
//			System.out.println(string1);
//			System.out.println(string1.length());			
//			exceptionExamples.method1();
//						
//		}catch(ArithmeticException | NullPointerException  e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			System.out.println("Division: "+ a/b);
//			
//			System.out.println(string1);
//			System.out.println(string1.length());			
//			exceptionExamples.method1();
//						
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			System.out.println("Opened Database Connection");
			System.out.println("Division: "+ a/b);
			
			System.out.println(string1);
			System.out.println(string1.length());			
			exceptionExamples.method1();
		}catch(ArithmeticException | NullPointerException  e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Close Database Connection");
		}	
	}

}
