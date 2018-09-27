public class BankAccount {

	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(String str, int accountNumber) {
		name = str;
		accNum = accountNumber;
		balance = 0;
	}
	
	public BankAccount(String str, int accountNumber, double amount) {
		name = str;
		accNum = accountNumber;
		balance = amount;
	}
	
	public void deposit(double input) {
		balance+=input;
	}
	
	public void withdraw(double input) {
		balance-=input;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return name + ", with account number " + accNum + ", has $" + balance + ".";
	}
}
