package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

import java.util.Random;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		String[] insectNames = new String[] { "Snaky", "Rony", "Joy", "Happy", "Sunny", "Joiana", "Molly", "Tim", "Rolly", "Max" };
		Random random = new Random();
		int name = random.nextInt(insectNames.length);
		double maintenanceCost = 2.5;
		double dangerPerc = 0.4;
		boolean flyingState = random.nextBoolean();
		boolean dangerousState = random.nextBoolean();

		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(6, insectNames[name], maintenanceCost,dangerPerc, flyingState, dangerousState);
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(6, insectNames[name], maintenanceCost,dangerPerc, flyingState, dangerousState);
		} else if (Constants.Animals.Insects.Spider.contentEquals(type)) {
			return new Spider(8, insectNames[name], maintenanceCost,dangerPerc, flyingState, dangerousState);
		} else
			throw new Exception("Invalid animal exception!");
	}

}
