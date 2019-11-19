package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Turtle;

import java.util.Random;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		String[] reptileNames = new String[] { "Snaky", "Rony", "Joy", "Happy", "Sunny", "Joiana", "Molly", "Tim", "Rolly", "Max" };
		Random random = new Random();
		int name = random.nextInt(reptileNames.length);
		double maintenanceCost = 8.5;
		double dangerPerc = 0.9;
		boolean layedEggs = random.nextBoolean();

		if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(0, reptileNames[name], maintenanceCost,dangerPerc, layedEggs);
		} else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile(4, reptileNames[name], maintenanceCost,dangerPerc, layedEggs);
		} else if (Constants.Animals.Reptiles.Turtle.contentEquals(type)) {
			return new Turtle(4, reptileNames[name], maintenanceCost,dangerPerc, layedEggs);
		} else
			throw new Exception("Invalid animal exception!");
	}
}