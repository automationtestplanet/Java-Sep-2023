package inheritance;

public class Office extends Faculty {
	String officeStaffName = "RAVI";
	
	void display() {
		System.out.println("This is Office Class");
	}
	
	void displayOfficeDetails() {
		super.display();
		System.out.println("Office Staff Name: "+ officeStaffName);
	}
	
	public static void main(String[] args) {
		Office offie1 = new Office();
		offie1.displayOfficeDetails();
		
//		offie1.
	}

}
