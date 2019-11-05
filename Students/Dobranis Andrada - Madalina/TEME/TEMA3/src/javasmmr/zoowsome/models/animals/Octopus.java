package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {
private static waterType saltwater;
	
	public Octopus(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name, avgSwimDepth, water);
	}
	
	public Octopus() {
		super(8,"Octy",2000,saltwater);
	}
}
