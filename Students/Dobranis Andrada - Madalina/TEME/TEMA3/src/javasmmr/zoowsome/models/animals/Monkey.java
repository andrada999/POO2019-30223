package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}
	
	public Monkey() {
		super(2,"Monky", 37.5f, 98.0f);
	}
}
