package exceptions;


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
