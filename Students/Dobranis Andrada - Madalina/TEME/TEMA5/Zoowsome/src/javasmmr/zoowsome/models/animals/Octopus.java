package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {
private static waterType saltwater;
	
	public Octopus(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, int avgSwimDepth, waterType water) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, water);
	}
	
	public Octopus() {
		super(8,"Octy", 0.8, 0.6,2000,saltwater);
	}
}