package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}
	
	public Spider() {
		super(8,"Spidy", 3.7, 0.9,false,true);
	}
}
