package javasmmr.zoowsome.models.animals;

public class Colibri extends Bird {
	public Colibri(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean migrates, int avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}
	
	public Colibri() {
		super(2,"Coly",0.9,0.1,false,8000);
	}
}
