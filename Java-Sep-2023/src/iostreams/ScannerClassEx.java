package iostreams;

import java.util.Scanner;

public class ScannerClassEx {

	public static void main(String[] args) {		
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter Student Details");
		
		System.out.println("Enter Name: ");
		String studentName = scanner1.nextLine();
		
		System.out.println("Enter Roll No: ");
		int rollNo = scanner1.nextInt();
		
		System.out.println("Enter Phone Number: ");		
		long phoneNo = scanner1.nextLong();
		
		System.out.println("Enter Average Marks: ");		
		float avgMarks = scanner1.nextFloat();
		
		System.out.println("Enter Presence: ");		
		boolean presence = scanner1.nextBoolean();
		
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student RollNo: "+ rollNo);
		System.out.println("Student Phone Number: "+ phoneNo);
		System.out.println("Student Average Marks: "+ avgMarks);
		System.out.println("Student Presence: "+ presence);
		
	}

}
