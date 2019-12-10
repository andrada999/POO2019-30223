package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Pigeon;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Colibri;

import java.util.Random;

public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		String[] birdNames = new String[] { "Snaky", "Rony", "Joy", "Happy", "Sunny", "Joiana", "Molly", "Tim", "Rolly", "Max" };
		Random random = new Random();
		int name = random.nextInt(birdNames.length);
		double maintenanceCost = 5.5;
		double dangerPerc = 0.3;
		boolean migrationState = random.nextBoolean();
		int altitude = random.nextInt(50000);

		if (Constants.Animals.Birds.Pigeon.equals(type)) {
			return new Pigeon(2, birdNames[name], maintenanceCost,dangerPerc, migrationState, altitude);
		} else if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot(2, birdNames[name],maintenanceCost,dangerPerc, migrationState, altitude);
		} else if (Constants.Animals.Birds.Colibri.contentEquals(type)) {
			return new Colibri(2, birdNames[name], maintenanceCost,dangerPerc, migrationState, altitude);
		} else
			throw new Exception("Invalid animal exception!");
	}
}