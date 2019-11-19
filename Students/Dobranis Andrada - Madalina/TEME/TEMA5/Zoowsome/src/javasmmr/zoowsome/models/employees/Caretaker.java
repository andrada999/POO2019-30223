package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker(String name, long id, BigDecimal salary, boolean isDead, double workingHours) {
		super(name,id,salary,isDead);
		this.workingHours = workingHours;
	}

	public double getWorkingHours() {
		return this.workingHours;
	}
	
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public String takeCareOf(Animal a) {
		if (a.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		 if (this.workingHours < a.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		else {
			a.setTakenCareOf(true);
			this.workingHours -= a.getMaintenanceCost();
			return Constants.Employees.Caretakers.TCO_SUCCESS;
		}

	}
}
