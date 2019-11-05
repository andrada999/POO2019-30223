package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{
	private boolean migrates;
	private Integer avgFlightAltitude;
	
	public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public boolean getIsMigrating() {
		return this.migrates;
	}
	
	public void setMigrates(boolean migration) {
		this.migrates = migration;
	}
	
	public Integer getAverageFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	public void setAverageFlightAltitude(Integer altitude) {
		this.avgFlightAltitude = altitude;
	}
}
