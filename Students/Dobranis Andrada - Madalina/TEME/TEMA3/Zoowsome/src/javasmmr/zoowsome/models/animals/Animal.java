package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private Integer nrOfLegs;
	private String name;
	
	public Animal(Integer nrOfLegs, String name) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
	}
	
	public Integer getNrOfLegs() {
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
}
