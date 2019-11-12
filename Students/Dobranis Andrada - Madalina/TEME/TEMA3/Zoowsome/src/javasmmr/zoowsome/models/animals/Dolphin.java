package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	private static waterType saltwater;
	
	public Dolphin(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name, avgSwimDepth, water);
	}
	
	public Dolphin() {
		super(0,"Dolphy",45,saltwater);
	}
}
