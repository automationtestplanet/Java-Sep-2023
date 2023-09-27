package assignments.kalyan;

public class Assignment2 {

	// Write a program to check whether the number is Prime number or not

	int primenumber(int n) {
		
		for (int i = 2; i <= n / 2; i++) {
			 
	        
	        if (n % i == 0) {
	        	System.out.println("given number is prime number");
	        }


		else {
			System.out.println("given number is not a prime number");
		}
		
	}
		return n;
	}
	public static void main(String[] args) {

		Assignment2 as2 = new Assignment2();

		as2.primenumber(10);

	}
}