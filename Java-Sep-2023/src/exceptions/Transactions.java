package exceptions;


public class Transactions {

	public static void main(String[] args) throws BankTrasactionError {
		BankTransactions ameerpetBranch = new BankTransactions();
		
		ameerpetBranch.checkBalance();
		try {
			ameerpetBranch.deposit(500000);
		}catch(Exception bakTransObj) {
			bakTransObj.printStackTrace();
		}
		
//		ameerpetBranch.deposit(500000);
//		ameerpetBranch.checkBalance();
		
		BankTransactions lbNagarBranch = new BankTransactions();
		
		try {
			lbNagarBranch.withdrawl(125000);
		}catch(BankTrasactionError bakTransObj) {
			bakTransObj.printStackTrace();
		}
		
		lbNagarBranch.checkBalance();

	}

}
