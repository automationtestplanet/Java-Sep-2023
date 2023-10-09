package assignments.ravikumar;

import java.util.Scanner;

public class Assignment1 {
	// Write a method to check whether the number is Even / Odd

	public void display(int n) {

		int num = n;
		if (n % 2 == 0) {
			System.out.println(n + " is even.");
		} else {
			System.out.println(n + " is odd.");
		}
	}

	public static void main(String[] args) {
		Assignment1 evenoddnum = new Assignment1();
		evenoddnum.display(100);
	}
}
