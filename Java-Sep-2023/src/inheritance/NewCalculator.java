package inheritance;

public class NewCalculator extends Calculator{

	@Override
	int addition(int a, int b) {		
		int c = super.addition(a, b)+1;
		System.out.println(c);
		return c;
	}
	
	@Override
	int substraction(int a, int b) {		
		System.out.println(a+b-100);
		return a-b-100;
	}
	
	void modDivision(int a, int b) {
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		
		NewCalculator newCalc = new NewCalculator();
		newCalc.division(13, 2);
		newCalc.modDivision(13, 2);
		newCalc.addition(10, 2);
		
		byte byte1 = (byte) 500;    
		System.out.println(byte1);
	}

}
