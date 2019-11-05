package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	public Insect(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public boolean getCanFlyState() {
		return this.canFly;
	}
	
	public void setCanFlyState(boolean flyingState) {
		this.canFly = flyingState;
	}
	
	public boolean getIsDangerousState() {
		return this.isDangerous;
	}
	
	public void setIsDangerousState(boolean dangerousState) {
		this.isDangerous = dangerousState;
	}
}
