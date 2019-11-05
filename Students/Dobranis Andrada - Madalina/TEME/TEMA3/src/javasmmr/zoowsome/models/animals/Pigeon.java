package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird{
	public Pigeon(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	
	public Pigeon() {
		super(2,"Pigy",false,6000);
	}
}
