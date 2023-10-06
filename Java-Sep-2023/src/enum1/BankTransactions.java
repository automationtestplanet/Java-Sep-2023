package enum1;


public class BankTransactions {
	static int balance = 100000;

	void deposit(int depositAmount, AccountType accountType) throws BankTrasactionError {

		switch (accountType) {
			case SAVINGS_ACCOUNT:
				if (depositAmount <= 200000) {
					BankTransactions.balance = BankTransactions.balance + depositAmount;
				} else {
					throw new BankTrasactionError("Deposit amount exceeds daily limit of Savings account, Please deposit less than 200000");
				}
				break;
			case CURRENT_ACCOUNT:
				if (depositAmount <= 500000) {
					BankTransactions.balance = BankTransactions.balance + depositAmount;
				} else {
					throw new BankTrasactionError("Deposit amount exceeds daily limit of Current account, Please deposit less than 500000");
				}
				
				break;
			case RETAIL_ACCOUNT:
				if (depositAmount <= 1000000) {
					BankTransactions.balance = BankTransactions.balance + depositAmount;
				} else {
					throw new BankTrasactionError("Deposit amount exceeds daily limit of Retailer account, Please deposit less than 1000000");
				}
				break;
			default:
				break;
		}
		
		
	}

	void withdrawl(int withdrawlAmount, AccountType accountType) throws BankTrasactionError {
		
		switch (accountType) {
			case SAVINGS_ACCOUNT:
				if (withdrawlAmount <= 50000) {
					if (BankTransactions.balance > withdrawlAmount) {
						BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
					} else {
						throw new BankTrasactionError("Insuffcient Balance");
					}
				}else {
					throw new BankTrasactionError("Withhdrawl amount exceeds daily limit of Savings account, Please Withhdrawl less than 50000");
				}
				break;
			case CURRENT_ACCOUNT:
				if (withdrawlAmount <= 200000) {
					if (BankTransactions.balance > withdrawlAmount) {
						BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
					} else {
						throw new BankTrasactionError("Insuffcient Balance");
					}
				}else {
					throw new BankTrasactionError("Withhdrawl amount exceeds daily limit of Current account, Please Withhdrawl less than 200000");
				}
				
				break;
			case RETAIL_ACCOUNT:
				if (withdrawlAmount <= 500000) {
					if (BankTransactions.balance > withdrawlAmount) {
						BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
					} else {
						throw new BankTrasactionError("Insuffcient Balance");
					}
				}else {
					throw new BankTrasactionError("Withhdrawl amount exceeds daily limit of Retailer account, Please Withhdrawl less than 500000");
				}
				break;
			default:
				break;
		}

		
	}

	void checkBalance() {
		System.out.println("Balance in your account : " + BankTransactions.balance);
	}
}
