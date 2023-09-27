package assignments.sairam;

public class Assignment1 {

//Write a program to covert a string "100" to Integer and convert the integer value to byte and convert the byte number to String 

	String covertNumber(String number) {
		int int1 = Integer.parseInt(number);
		byte byte1 = (byte) int1;
		String string2 = String.valueOf(byte1);
		return string2;
	}

	public static void main(String[] args) {
		Assignment1 assgn1 = new Assignment1();
		System.out.println(assgn1.covertNumber("1000"));
	}
}