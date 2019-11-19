package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc,normalBodyTemp, percBodyHair);
	}
	
	public Monkey() {
		super(2,"Monky", 0.7, 0.7, 37.5f, 98.0f);
	}
}