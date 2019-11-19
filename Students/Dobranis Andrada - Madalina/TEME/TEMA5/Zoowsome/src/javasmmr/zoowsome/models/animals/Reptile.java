package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	private boolean laysEggs;
	
	public Reptile(int nrOfLegs, String name, double maintenanceCost, double dangerPerc,  boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}
	
	public boolean getIsLayingEggs() {
		return this.laysEggs;
	}
	
	public void setLayedEggs(boolean eggs) {
		this.laysEggs = eggs;
	}
}