package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	private boolean laysEggs;
	
	public Reptile(Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name);
		this.laysEggs = laysEggs;
	}
	
	public boolean getIsLayingEggs() {
		return this.laysEggs;
	}
	
	public void setLayedEggs(boolean eggs) {
		this.laysEggs = eggs;
	}
}
