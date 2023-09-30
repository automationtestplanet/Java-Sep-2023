package inner.classes;

public class ImplementCalculator {	
	
	
	
	public int modDivision(int a, int b) {
		return a%b;
	}
	
	static Calculator calc = new Calculator() {
		
		public int addition(int a, int b) {
			return a+b;
		}

		
		public int substraction(int a, int b) {
			return a-b;
		}

		
		public int multiplication(int a, int b) {
			return a*b;
		}

		
		public int division(int a, int b) {
			return a/b;
		}
	};
	
	public static void main(String[] args) {
		System.out.println(calc.addition(30, 40));
	}

}
