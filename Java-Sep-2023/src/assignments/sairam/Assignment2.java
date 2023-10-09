package assignments.sairam;

public class Assignment2 {

	// Write a program to print the last 5 numbers in a reverse order for a given
	// number
	// Ex: input 10, o/p -> 10, 9, 8, 7 , 6
	// Ex: input 20, o/p -> 20,19,18,17,16

	void printNumbersInReverseOrder(int number) {
		for (int i = number; i >= number - 5; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Assignment2 reverseorder = new Assignment2();
		reverseorder.printNumbersInReverseOrder(10);
		reverseorder.printNumbersInReverseOrder(20);
	}
}
