package inheritance;

public class College {

	static final String UNIVERSITY_NAME = "Osmania University";
	static String collegeName = "Mallareddy College";
	static String collegeCode = "12345";
	static String collegeLocation = "Hyderabad";

	void displayCollegeDetails() {
		System.out.println("University Name: " + College.UNIVERSITY_NAME);
		System.out.println("College Name: " + College.collegeName);
		System.out.println("College Code: " + College.collegeCode);
		System.out.println("College Location: " + College.collegeLocation);
	}

}
