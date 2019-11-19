  
package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	public Crocodile(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}
	
	public Crocodile() {
		super(4,"Pigy",5.4,1,true);
	}
}
