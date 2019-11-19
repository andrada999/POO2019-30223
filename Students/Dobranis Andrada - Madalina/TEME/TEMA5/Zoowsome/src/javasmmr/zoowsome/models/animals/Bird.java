package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{
	private boolean migrates;
	private int avgFlightAltitude;
	
	public Bird(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean migrates, int avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
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