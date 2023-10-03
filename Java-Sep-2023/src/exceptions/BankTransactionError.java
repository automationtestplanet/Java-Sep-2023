package exceptions;

public class BankTransactionError {
	String errorMessge;
	
	public BankTransactionError(String errorMessge) {
		this.errorMessge= errorMessge;
		
	}

	public void printStackTrace() {
	System.out.println(errorMessge);
}

	public String getMessage() {
		return this.errorMessge;
	}
}
