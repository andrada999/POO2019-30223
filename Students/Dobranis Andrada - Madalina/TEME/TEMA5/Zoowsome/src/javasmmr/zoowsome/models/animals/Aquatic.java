package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	public enum waterType{
		saltwater, freshwater
	};
	private waterType water;
	
	public Aquatic(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, int avgSwimDepth, waterType water) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.water = water;
	}
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public void setMigrates(int swimDepth) {
		this.avgSwimDepth = swimDepth;
	}
	
	public waterType getWaterType() {
		return this.water;
	}
	
	public void setWaterType(waterType newWaterType) {
		this.water = newWaterType;
	}
}