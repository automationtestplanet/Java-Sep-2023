package functional.interface1;

public class Students{
	int rollNo;
	String name;
	String className;
	
	public Students(int rollNo, String name, String className) {
		this.rollNo = rollNo;
		this.name = name;
		this.className = className;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
}
