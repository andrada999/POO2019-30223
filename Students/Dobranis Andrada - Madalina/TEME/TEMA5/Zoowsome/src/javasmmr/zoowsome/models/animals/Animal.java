package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf;
	
	public Animal(int nrOfLegs, String name, double maintenanceCost, double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		this.takenCareOf = false;
	}
	
	public int getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(Integer nr) {
		this.nrOfLegs = nr;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String nume) {
		this.name = nume;
	}
	
	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	
	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = false;
	}
	
	public boolean kill() {
		double randomNumber = Math.random();
		if(randomNumber < dangerPerc) {
			return true;
		}
		else {
			return false;
		}
	}
}
