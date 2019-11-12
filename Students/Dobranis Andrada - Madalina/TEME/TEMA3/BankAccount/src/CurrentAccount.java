
public class CurrentAccount extends Account {
	private double overdraftLimit;
	
	public CurrentAccount(int number, double overdraftLimit) {
		super(number);
		this.overdraftLimit = 5000;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(int limit) {
		this.overdraftLimit = limit;
	}
	
    public void withdraw(double limit) {
		if(limit <= this.overdraftLimit) {
			withdraw(limit);
		}else
			System.out.println("Withdraw is not allowed.Overdraft limit excedeed");
		
	}
    
    public String toString() {
		return super.toString() + "Overdraft limit: " + overdraftLimit;
	}
}
