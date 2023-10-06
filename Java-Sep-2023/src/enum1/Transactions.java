package enum1;


public class Transactions {

	public static void main(String[] args) throws BankTrasactionError {
		BankTransactions ameerpetBranch = new BankTransactions();
		
		BankTransactions lbNagarBranch = new BankTransactions();
		
		try {
			lbNagarBranch.withdrawl(5000,AccountType.SAVINGS_ACCOUNT);
		}catch(BankTrasactionError bakTransObj) {
			bakTransObj.printStackTrace();
		}
		
		lbNagarBranch.checkBalance();
		
		
		try {
			ameerpetBranch.deposit(50000,AccountType.SAVINGS_ACCOUNT);
		}catch(Exception bakTransObj) {
			bakTransObj.printStackTrace();
		}
		
		ameerpetBranch.checkBalance();


	}

}
