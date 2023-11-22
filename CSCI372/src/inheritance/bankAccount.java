package inheritance;

public class bankAccount {
	
	
	String firstName;
	String lastName;
	String accountID;
	double balance;
	
	
	
	bankAccount(String firstName, String lastName, String accountID){
		this.balance = 0;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
	}
	
	public void deposit(double amount) {
		System.out.println("adding $" + amount + "\n");
		balance += amount; 
	}
	
	public double withdraw(double amount){
			return this.balance -= amount;
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getBalance() {
		System.out.println("Balance: " + this.balance + "\n");
		
		return balance;
	}
	
	public String getname() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName + "\n");
		
		return firstName + " " + lastName;
	}
	
	void getiD(){
		System.out.println("AccountID: " + this.accountID + "\n");
	}
	
	void accountSummary() {
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("AccountID: " + this.accountID);
		System.out.println("Balance: " + this.balance + "\n");
	}
	
		
	
}

	
