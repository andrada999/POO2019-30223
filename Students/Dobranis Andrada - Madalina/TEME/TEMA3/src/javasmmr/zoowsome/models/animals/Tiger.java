package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}
	
	public Tiger() {
		super(4,"Tigey", 37.5f, 98.0f);
	}
}
