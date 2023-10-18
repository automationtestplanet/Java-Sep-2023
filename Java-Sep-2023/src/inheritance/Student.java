package inheritance;

public class Student extends College {

	String studentName = "RAM KUMAR";
	int rollNo = 123;
	String qualification = "B.Tech";
	
	void display() {
		System.out.println("This is Student Class");
	}
	
	void displayStudentDeils() {
		System.out.println("Student Name: "+ this.studentName);
		System.out.println("Student Roll No: "+ this.rollNo);
		System.out.println("Student Qualification: "+ this.qualification);
	}
	
    public static void main(String[] args) {
    	Student student1 = new Student();
    	student1.displayStudentDeils();
    	
//    	College college1 = new College();
//    	college1.displayCollegeDetails();
//    	
////    	student1.displayCollegeDetails();
	}	
}
