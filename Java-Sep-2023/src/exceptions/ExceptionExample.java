package exceptions;

public class ExceptionExample {

	
	static int division(int a, int b) {
		try {
			return a/b;
		}
		catch(Exception obj) {
			System.out.println("Exception Name:  "+ obj.getClass().getName());
			System.out.println(a+ " "+ obj.getMessage()+ " is not possible");
			System.out.println("Changing the value 0 to 1");
			return a/1;
		}
		
	}

	public static void main(String[] args) {
	
		System.out.println("Starting Division method execution");
//		try {
//			System.out.println(division(10,0));
//			
////			new ArithmeticException();
//		}catch(ArithmeticException obj) {
////			obj.printStackTrace();
//			System.out.println(obj.getMessage());
//			System.out.println("Cannot devide the value wth 0, Changing the value 0 to 1");
//			System.out.println(division(10,1));
//			
//			
//		}
		
		System.out.println("Result: "+ division(10,0));
		
		System.out.println("Ending Division method execution");
//		System.out.println("Ending Division method execution");
//		System.out.println("Ending Division method execution");
//		System.out.println("Ending Division method execution");
		
		//Checked Exception
		
//		int = 100;
		
//		itn a = 100;
		
//		int b = "100";
		
//		ExceptionExample exceptionEx = new Calculator();
		
		// Un-checked Exception
		
//		System.out.println(division(10,0));  // Execution time / Run time
		
		
		
		

	}

}