package abstraction;

public abstract class AbstractCalculations {

	String name;
	
	public AbstractCalculations(String name) {
		this.name = name;
	}

	public int addition(int a, int b) {
		return a + b;
	}

	abstract public int substraction(int a, int b);

	public int multiplication(int a, int b) {
		return a * b;
	}

	abstract public int division(int a, int b);
}
