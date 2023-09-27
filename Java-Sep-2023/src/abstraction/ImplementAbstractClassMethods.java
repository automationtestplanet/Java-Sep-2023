package abstraction;

class ImplementAbstractClassMethods extends AbstractCalculations{

	@Override
	public int substraction(int a, int b) {
		return a-b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

}
