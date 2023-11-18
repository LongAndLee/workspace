class BankAccount {
	
	String firstName;
	String lastName;
	String accountID;
	double balance;
	
	
	
	BankAccount(String firstName, String lastName, String accountID){
		this.balance = 0;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
	}
	
	void deposit(double amount) {
		balance += amount; 
	}
	
	double withdraw(double amount){
		if( amount < this.balance ) {
			return this.balance += amount;
		}
		return -1;
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	double getBalance() {
		return balance;
	}
	
	void getname() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
	}
	
	void getiD(){
		System.out.println("AccountID: " + this.accountID);
	}
	
	void accountSummary() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("AccountID: " + this.accountID);
		System.out.println("Balance: " + this.firstName);
	}
	

	
}
