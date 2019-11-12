
public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(int number, double interestRate) {
		super(number);
		this.interestRate = 2.5;
	}
	
	public double getInterest() {
		return this.interestRate;
	}
	
	public void setInterest(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interest = getBalance() * interestRate / 100.0;
		deposit(interest);
	}
	
	public String toString() {
		return super.toString() + "Interest rate : " + interestRate;
	}
}
