package polymorphism;

public class OverridingOfArithematicOperatios extends ArithematicOperations{

	static int addition(int a, int b) {
		return a+b+10;
	}
	
	static void display() {
		System.out.println("Overriding of Arithematic Operations Static Display method");
	}
	
	int addition(int a, int b, int c, int d) {			
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		
		OverridingOfArithematicOperatios overridingEx = new OverridingOfArithematicOperatios();
		
		System.out.println(overridingEx.addition(10, 20));
		
		display();
		
		System.out.println(overridingEx.addition(10, 20, 30, 40));
		
		ArithematicOperations arOp;
		int int1;
		OverridingOfArithematicOperatios overridingEx1 = new OverridingOfArithematicOperatios();
		byte byte1 = 100;
		
		int1 = byte1; // Implicit Type Conversion -> no data loss
		 
		byte1 = (byte)int1;  // Explicit Type Conversion  -> data loss
		
		arOp = overridingEx1; // Up-casting   -> data loss
		
//		arOp.addition(10, 20, 30, 40);
		
		overridingEx1 = (OverridingOfArithematicOperatios)arOp;  // Down-casting - no data loss
		
		overridingEx1.addition(10, 20, 30, 40);
		
		arOp = overridingEx1; // Up-casting   -> data loss
		
		System.out.println("Additon of numbers with parent reference: "+arOp.addition(10, 20));
		
		System.out.println("Additon of numbers with child reference: "+overridingEx1.addition(10, 20));
		
		ArithematicOperations arOp2 = new OverridingOfArithematicOperatios();
		
		System.out.println("Additon of numbers with parent reference: "+arOp2.addition(10, 20));
		OverridingOfArithematicOperatios overridingEx2 = (OverridingOfArithematicOperatios)arOp2;
		System.out.println("Additon of numbers with child reference: "+overridingEx2.addition(10, 20));
		
	}

}
