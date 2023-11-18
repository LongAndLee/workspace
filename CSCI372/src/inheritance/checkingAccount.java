package inheritance;


public class checkingAccount extends bankAccount{
	
	double interestRate;
	int overdraftFee;
	
	checkingAccount(String firstName, String lastName, String accountID) {
		super(firstName, lastName, accountID);
		this.interestRate = -.15;
		this.overdraftFee = 30;
	}
	
	void processWithdraw(double amount ) {
		System.out.println("taking out $" + amount);
		if (super.withdraw(amount) < 0) {
			System.out.println("insufficent fund! $" + this.overdraftFee + " overdraft fee added!" + "\n");
			super.balance -= overdraftFee;
		}
	}
	
	void displayAccount(){
		super.accountSummary();
		System.out.println("15% overdraft fee implemented!");
		super.balance -= super.balance*interestRate;
		super.accountSummary();
	}

}
