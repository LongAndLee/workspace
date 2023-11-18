package inheritance;


public class InheritanceTest {

	public static void main(String[] args) {
		
		checkingAccount Long = new checkingAccount("Long", "Chang", "1234");
		
		Long.accountSummary();
		Long.deposit(50);
		Long.getBalance();
		Long.processWithdraw(60);
		Long.getBalance();
		Long.displayAccount();
		
	}

}
