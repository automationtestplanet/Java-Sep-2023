package polymorphism;

public class OverloadingOfArithematicOperations extends ArithematicOperations{
	
	int addition(int a, int b, int c, int d) {			
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		OverloadingOfArithematicOperations chldCls = new OverloadingOfArithematicOperations();
		
	System.out.println(	chldCls.addition(10, 20, 30));;
	System.out.println(	chldCls.addition(10, 20, 30,40));	
	}
	
}
