package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	public Snake(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}
	
	public Snake() {
		super(0,"Snaky",4.5,1,true);
	}
}