package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Cow;

import java.util.Random;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		String[] mammalNames = new String[] { "Tigy", "Rony", "Joy", "Happy", "Sunny", "Joiana", "Molly", "Tim", "Rolly", "Max" };
		Random random = new Random();
		int name = random.nextInt(mammalNames.length);
		float bodyTemperature = 100 * random.nextFloat();
		float bodyHairPercent = 100 * random.nextFloat();
		
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(4, mammalNames[name], bodyTemperature, bodyHairPercent);
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(2, mammalNames[name], bodyTemperature, bodyHairPercent);
		} else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(4, mammalNames[name], bodyTemperature, bodyHairPercent);
		} else
			throw new Exception("Invalid animal exception!");
	}
}
