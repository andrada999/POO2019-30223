package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	private static waterType saltwater;
	
	public Dolphin(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, int avgSwimDepth, waterType water) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, water);
	}
	
	public Dolphin() {
		super(0,"Dolphy",0.9,0.4,45,saltwater);
	}
}
