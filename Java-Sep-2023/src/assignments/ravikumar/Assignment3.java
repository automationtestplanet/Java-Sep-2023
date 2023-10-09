package assignments.ravikumar;

import java.util.Scanner;

public class Assignment3 {

//	Write a method which should accept and number as inut and check whether the number is Palindrome or not

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = obj.nextInt();
		int revNum = 0;
		int Onum = num;

		while (num != 0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
		}
		if (Onum == revNum) {
			System.out.println(Onum + "is a palindrome ");
		} else {
			System.out.println(Onum + "is not a palindrome ");
		}
	}
}
