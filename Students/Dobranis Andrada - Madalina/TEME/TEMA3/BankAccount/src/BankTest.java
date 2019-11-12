
public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank(10);
		bank.openAccount(new SavingsAccount(1,10));
		bank.openAccount(new SavingsAccount(2,20));
		bank.openAccount(new CurrentAccount(3,30));
		bank.openAccount(new CurrentAccount(4,40));
		
		bank.getAccounts()[0].deposit(10);
		bank.getAccounts()[1].withdraw(20);
		
		bank.closeAccount(1);
		
		bank.updateAccount();
	}
}
