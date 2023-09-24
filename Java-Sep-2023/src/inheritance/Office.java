package inheritance;

public class Office extends Faculty {
	String officeStaffName = "RAVI";
	
	void displayOfficeDetails() {
		System.out.println("Office Staff Name: "+ officeStaffName);
	}
	
	public static void main(String[] args) {
		Office offie1 = new Office();
		
	}

}
