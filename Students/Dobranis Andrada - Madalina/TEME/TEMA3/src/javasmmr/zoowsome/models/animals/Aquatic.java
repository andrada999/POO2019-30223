package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	public enum waterType{
		saltwater, freshwater
	};
	private waterType water;
	
	public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name);
		this.avgSwimDepth = avgSwimDepth;
		this.water = water;
	}
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public void setMigrates(Integer swimDepth) {
		this.avgSwimDepth = swimDepth;
	}
	
	public waterType getWaterType() {
		return this.water;
	}
	
	public void setWaterType(waterType newWaterType) {
		this.water = newWaterType;
	}
}
