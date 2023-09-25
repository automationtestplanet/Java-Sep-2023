package assignments.sairam;

public class Assignment3 {

	// write a reusable method which should accept input as number and prints factorial value
	// Ex: 5 -> 5*4*3*2*1 -> 120
	// Ex: 4 -> 4*3*2*1  -> 25
	
	public void factorial(int n) {
		int num = n;
		int i;
		int fact = 1;
		for(i = 1; i<=n;i++) {
			
			fact =fact*i;
			
		}
		System.out.println("Factorial value is: "+ fact);
	}
	
	public static void main(String[] args) {
		Assignment3 multi = new Assignment3();
		
		multi.factorial(5);
   }
}
