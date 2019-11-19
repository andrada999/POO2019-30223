package javasmmr.zoowsome.models.employees;

import java.util.UUID;
import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee(String name, long id, BigDecimal salary, boolean isDead) {
		this.name = name;
		this.id = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
		this.salary = salary;
		this.isDead = isDead;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getUniqueId() {
		return this.id;
	}
	
	public void setUniqueId(long id) {
		this.id = id;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public boolean getDeadState() {
		return isDead;
	}
	
	public void setDeadState(boolean isDead) {
		this.isDead = isDead;
	}
}
