package interface1;

class ImplementFullAbstraction extends Class1 implements FullAbstraction, Interface2, Interface3 {

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int modDivision(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}
	
	
	public int sum(int ...a) {
		return 10;
	}
	
	public static void main(String[] args) {
		ImplementFullAbstraction fullAbs = new ImplementFullAbstraction();
		
		fullAbs.addition(10, 20);
		
		fullAbs.modDivision(20, 30);
		
		fullAbs.sum(10);
		fullAbs.sum(10,20);
		fullAbs.sum(10,20,30);
		fullAbs.sum(10,20,30,40);
	}

	@Override
	public int factorial(int a) {
		int factVal = 0;
		for(int i=0;i<=a; i++) {
			factVal = factVal*i;
		}
		return factVal;
	}
}
