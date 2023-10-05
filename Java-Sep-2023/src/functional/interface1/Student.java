package functional.interface1;

public class Student implements Comparable<Student>{
	int rollNo;
	String name;
	String className;
	
	public Student(int rollNo, String name, String className) {
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

	@Override
	public int compareTo(Student studentObj2) {
		if(this.getRollNo() > studentObj2.getRollNo()) {
			return 1;
		}else {
			return -1;
		}		
	}
}
