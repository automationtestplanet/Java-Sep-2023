package assignments.kalyan;

public class Assignment1 {

	// Write a program to display the sum of digits of a number 123456789
	// output should be -> 1+2+3+4+5+6+7+8+9 = 45
	static int sumOfDigits(int input) {
		String number = String.valueOf(input);
		int result = 0;
		for (int i = 0; i < number.length(); i++) {
//			result = result + Character.getNumericValue(number.charAt(i));
			result = result + number.charAt(i)-'0';
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print(sumOfDigits(123456789));
	}

}
