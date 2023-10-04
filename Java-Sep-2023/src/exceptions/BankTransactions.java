package exceptions;

<<<<<<< Updated upstream


public class BankTransactions {
	static int balance = 100000;

	void deposit(int depositAmount) throws BankTrasactionError {

		if (depositAmount <= 200000) {
			BankTransactions.balance = BankTransactions.balance + depositAmount;
		} else {
			throw new BankTrasactionError("Deposit amount exceeds daily limit, Please deposit less than 200000");
		}
	}

	void withdrawl(int withdrawlAmount) throws BankTrasactionError {

		if (BankTransactions.balance > withdrawlAmount) {
			BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
		} else {
			throw new BankTrasactionError("Insuffcient Balance");
		}
	}

	void checkBalance() {
		System.out.println("Balance in your account : " + BankTransactions.balance);
	}
}
=======
public class BankTransactions {
	
	static int balance = 100000;
	
	void deposit(int depositAmount){
		
		if(depositAmount <= 200000) {
			BankTransactions.balance = BankTransactions.balance + depositAmount;
		}else{
			System.out.println("Deposit amount exceeds daily limit, Please deposit less than 200000");
		}
	}
	
	void withdrawl(int withdrawlAmount){
		
		if(BankTransactions.balance > withdrawlAmount) {
			BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
		}else {
//			throw new BankTransactionError("Insufficient balance");
//			System.out.println("Insufficent Balance");
		}
	}
	
	void checkBalance() {
		System.out.println("Balance in your account : "+ BankTransactions.balance);
	}
}



>>>>>>> Stashed changes
