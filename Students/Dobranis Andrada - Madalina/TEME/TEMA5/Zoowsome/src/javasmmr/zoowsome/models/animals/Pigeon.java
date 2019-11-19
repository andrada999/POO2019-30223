package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird{
	public Pigeon(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean migrates, int avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}
	
	public Pigeon() {
		super(2,"Pigy", 4.6, 0.2, false, 6000);
	}
}