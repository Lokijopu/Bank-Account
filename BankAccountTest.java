
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankaccount1 = new BankAccount("Kevin's start bank account", 140);
		BankAccount bankaccount2 = new BankAccount("Kevin's own bank account", 140, 899.99);
		System.out.println(bankaccount1.toString());
		System.out.println(bankaccount2.toString());
		bankaccount1.deposit(165.78);
		System.out.println(bankaccount1.getBalance());
		bankaccount2.withdraw(198.40);
		System.out.println(bankaccount2.getBalance());
	}

}
