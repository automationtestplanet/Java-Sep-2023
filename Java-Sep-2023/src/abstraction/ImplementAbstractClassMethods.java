package abstraction;

class ImplementAbstractClassMethods extends AbstractCalculations{

	public ImplementAbstractClassMethods(String name) {
		super(name);
		
	}

	@Override
	public int substraction(int a, int b) {
		return a-b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

}
