package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{
	public Parrot(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	
	public Parrot() {
		super(2,"Parry",false,2000);
	}
}
