package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Octopus;

import java.util.Random;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		String[] aquaticNames = new String[] { "Snaky", "Rony", "Joy", "Happy", "Sunny", "Joiana", "Molly", "Tim", "Rolly", "Max" };
		Random random = new Random();
		int name = random.nextInt(aquaticNames.length);
		int swimDepth = random.nextInt(50000);
		Aquatic.waterType waterType[] = {Aquatic.waterType.saltwater, Aquatic.waterType.freshwater};
		int water = random.nextInt(2);

		if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(0, aquaticNames[name], swimDepth, waterType[water]);
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin(0, aquaticNames[name], swimDepth, waterType[water]);
		} else if (Constants.Animals.Aquatics.Octopus.contentEquals(type)) {
			return new Octopus(8, aquaticNames[name], swimDepth, waterType[water]);
		} else
			throw new Exception("Invalid animal exception!");
	}
}
