package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}
	
	public Tiger() {
		super(4,"Tigey", 5.7, 0.9, 37.5f, 98.0f);
	}
}