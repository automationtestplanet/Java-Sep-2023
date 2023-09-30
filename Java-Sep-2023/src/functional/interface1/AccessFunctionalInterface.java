package functional.interface1;

public class AccessFunctionalInterface{

	
	void method1() {
		System.out.println("Instance Method1");
	}
	
	static void method2() {
		System.out.println("Static Method2");
	}
	public static void main(String[] args) {
		
//		FunctionalInterfaceEx funInf = new FunctionalInterfaceEx() {
//			@Override
//			public void sumOfTwoNumber() {
//				System.out.println("Sum of Two Numbers");
//			}
//		};
//		
//		funInf.sumOfTwoNumber();
		
//		FunctionalInterfaceEx funInf = () -> {System.out.println("Sum of Two Numbers");};  // Lambda expression -> method without name
//		
//		funInf.sumOfTwoNumber();
		
		FunctionalInterfaceEx funInf2 = new AccessFunctionalInterface()::method1;
		
		funInf2.sumOfTwoNumber();
		
		FunctionalInterfaceEx funInf3 = AccessFunctionalInterface::method2;
		
		funInf3.sumOfTwoNumber();
		
		FunctionalInterface2 funInf5 = (a,b)->{return a+b;};
		
		System.out.println(funInf5.addition(10, 30));
		
//		FunctionalInterface3 funInf6 = (a) ->{return a+5;};
		
		FunctionalInterface3 funInf6 = a->{return a+5;};
		
		System.out.println(funInf6.addition(10));
	}

}
