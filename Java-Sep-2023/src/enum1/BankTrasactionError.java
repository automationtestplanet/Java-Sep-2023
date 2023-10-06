package enum1;

public class BankTrasactionError extends Exception {

	String errorMessage;
	
	public BankTrasactionError(String errorMessage){
		this.errorMessage= errorMessage;
	}
	
	public void printStackTrace() {	
		System.out.println(errorMessage);
	}
	
	public String getMessge() {	
		return this.errorMessage;
	}	
	
}
