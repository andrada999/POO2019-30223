package javasmmr.zoowsome.models.animals;

public class Colibri extends Bird {
	public Colibri(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	
	public Colibri() {
		super(2,"Coly",false,8000);
	}
}
