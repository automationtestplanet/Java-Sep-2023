package interface1;

public interface FullAbstraction {
	
//	public static final int a = 100; 
	int a = 100;
	
	public static void main(String[] args) {
//		a = 200;
		System.out.println(a);
	}

	
	/**
	 * This method performs addition operation on the input data
	 * @param a
	 * @param b
	 * @return
	 */
	int addition(int a, int b);

	/**
	 * This method performs subtraction operation on the input data
	 * @param a
	 * @param b
	 * @return
	 */
	int substraction(int a, int b);

	/**
	 * This method performs Multiplication operation on the input data
	 * @param a
	 * @param b
	 * @return
	 */
	int multiplication(int a, int b);

	/**
	 * This method performs division operation on the input data
	 * @param a
	 * @param b
	 * @return
	 */
	int division(int a, int b);

//	default void method1() {
//		System.out.println("This is default method1 in interface");
//	}
//	
//	static void method2() {
//		System.out.println("This is STatic method2 in Interface");
//	}
//
//	public static void main(String[] args) {
//		FullAbstraction.method2();
//		
////		FullAbstraction.method1();
//	}
}
