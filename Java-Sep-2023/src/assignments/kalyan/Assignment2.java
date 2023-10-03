package assignments.kalyan;

public class Assignment2 {

	// Write a program to check whether the number is Prime number or not

	void primenumber(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

	public static void main(String[] args) {

		Assignment2 as2 = new Assignment2();

		as2.primenumber(32);

	}
}
