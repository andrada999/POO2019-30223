package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{
	public Parrot(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean migrates, int avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}
	
	public Parrot() {
		super(2,"Parry", 4.5,0.2,false,2000);
	}
}