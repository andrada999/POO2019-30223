package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}
	
	public Cockroach() {
		super(6,"Rocky",0.5,0.1,false,false);
	}
}