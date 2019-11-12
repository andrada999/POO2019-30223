
public class Bank {
	
	private Account[] accounts;
	private int nrAccounts;

	public Bank(int nrAccount) {
		this.accounts = new Account[nrAccount];
		this.nrAccounts = 0;
	}
	
	public int getNrAccounts() {
		return this.nrAccounts;
	}
	
	public Account[] getAccounts() {
		return this.accounts;
	}
	
	public Account testsAccount(int typeAccount, int nrAccount) {
		if (typeAccount == 1) {
			Account account = new Account(nrAccount);
			return account;
		} else if (typeAccount == 2) {
			SavingsAccount account = new SavingsAccount(nrAccount, 2.5);
			return account;
		} else if (typeAccount == 3) {
			CurrentAccount account = new CurrentAccount(nrAccount, 5000);
			return account;
		} else
			return null;
	}
	
	public double openAccount(Account account) {
		accounts[nrAccounts] = account;
		nrAccounts++;
		return account.getAccountNumber();
	}
	
	public void closeAccount(int nrAccount) {
		accounts[nrAccount - 1] = null;
		System.out.println("Closed account");
	}
	
	public void payDivident(int divident) {
		for(int i=0; i < nrAccounts; i++) {
			accounts[i].deposit(divident);
		}
	}
	
	public void updateAccount() {
		for(int i=0; i <= nrAccounts; i++) {
			if(accounts[i] instanceof SavingsAccount) {
				((SavingsAccount)accounts[i]).addInterest();
			}else if(accounts[i] instanceof CurrentAccount) {
				if(((CurrentAccount)accounts[i]).getOverdraftLimit() < accounts[i].getBalance());
				System.out.println("Overdraft account");
			}
		}
	}
}
