package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	private static waterType saltwater;
	
	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name, avgSwimDepth, water);
	}
	
	public Shark() {
		super(0,"Sharky",2000,saltwater);
	}
}
