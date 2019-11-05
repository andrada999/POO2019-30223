package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}
	
	public Cow() {
		super(4,"Joiana", 37.5f, 92.0f);
	}
}
