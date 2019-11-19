package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}
	
	public Turtle() {
		super(4,"Cutie",4.7, 0.1,true);
	}
}