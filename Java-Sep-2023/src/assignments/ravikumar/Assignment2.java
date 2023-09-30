package assignments.ravikumar;

public class Assignment2 {

	// Write a program to print the Fibonacci series upto 7 numbers for the given
	// values

	// ex: 1, 2 -> o/p : 1, 2, 3, 5, 8, 13, 21
	// ex: 10, 15 -> o/p : 10, 15, 25, 40, 65, 105, 170

	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {

		if (count > 0) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
			printFibonacci(count - 1);
		}

	}

	public static void main(String[] args) {
		int count = 9;
//	 System.out.println(n1+" "+n2);
		printFibonacci(count - 2);

	}
}
