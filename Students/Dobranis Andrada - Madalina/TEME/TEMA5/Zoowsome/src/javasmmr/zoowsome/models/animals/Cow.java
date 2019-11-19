package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}
	
	public Cow() {
		super(4,"Joiana",2.4,0.4, 37.5f, 92.0f);
	}
}