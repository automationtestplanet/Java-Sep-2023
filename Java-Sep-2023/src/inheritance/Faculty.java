package inheritance;

public class Faculty extends Student {

	String facultyName = "Siva";
	String subject = "Automation Testing";
	
	void displayFacultyDetails() {
		System.out.println("Faculty Name: "+ facultyName);
		System.out.println("Subject: "+ subject);
	}
	
	public static void main(String[] args) {
		Faculty faculty1 = new Faculty();
		faculty1.displayCollegeDetails();
		faculty1.displayStudentDeils();
		faculty1.displayFacultyDetails();
	}
}
