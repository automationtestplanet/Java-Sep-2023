package abstraction;


public class AccessPartialAbstractClass extends PartialAbstarctionClass{

	@Override
	void substraction() {
		
		System.out.println("Abstract Substractin method");
	}
	
	public static void main(String[] args) {
		
		PartialAbstarctionClass absCls = new AccessPartialAbstractClass();
		
		absCls.addition();
		absCls.substraction();
	}

}
