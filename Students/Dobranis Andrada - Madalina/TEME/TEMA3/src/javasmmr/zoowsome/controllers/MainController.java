package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import java.util.Random;

public class MainController {
	public static void main(String[] args) throws Exception{
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("We have an animal with %d legs, whose name is %s\n", a1.getNrOfLegs(), a1.getName());
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Crocodile);
		System.out.printf("We have an animal with %d legs, whose name is %s\n", a2.getNrOfLegs(), a2.getName());
		Animal a3 = speciesFactory3.getAnimal(Constants.Animals.Birds.Parrot);
		System.out.printf("We have an animal with %d legs, whose name is %s\n", a3.getNrOfLegs(), a3.getName());
		Animal a4 = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
		System.out.printf("We have an animal with %d legs, whose name is %s\n", a4.getNrOfLegs(), a4.getName());
		Animal a5 = speciesFactory5.getAnimal(Constants.Animals.Insects.Cockroach);
		System.out.printf("We have an animal with %d legs, whose name is %s\n", a5.getNrOfLegs(), a5.getName());
		
		int animalCounter = 50;
		Mammal[] mammals = new Mammal[50];
		Reptile[] reptiles = new Reptile[50];
		Bird[] birds = new Bird[50];
		Aquatic[] aquatics = new Aquatic[50];
		Insect[] insects = new Insect[50];

		int mammalCounter = 0;
		int birdCounter = 0;
		int aquaticCounter = 0;
		int reptileCounter = 0;
		int insectCounter = 0;

		for (int i = 0; i < animalCounter; i++) {
			Random randomSpecies = new Random();
			Random randomAnimal = new Random();
			
			int species = randomSpecies.nextInt(5);
			int animal = randomAnimal.nextInt(3);

			if (species == 0) {
				if (animal == 0) {
					mammals[mammalCounter++] = (Mammal) speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
				} else if (animal == 1) {
					mammals[mammalCounter++] = (Mammal) speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
				} else if (animal == 2) {
					mammals[mammalCounter++] = (Mammal) speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
				}
			} else if (species == 1) {
				if (animal == 0) {
					reptiles[reptileCounter++] = (Reptile) speciesFactory2.getAnimal(Constants.Animals.Reptiles.Crocodile);
				} else if (animal == 1) {
					reptiles[reptileCounter++] = (Reptile) speciesFactory2.getAnimal(Constants.Animals.Reptiles.Snake);
				} else if (animal == 2) {
					reptiles[reptileCounter++] = (Reptile) speciesFactory2.getAnimal(Constants.Animals.Reptiles.Turtle);
				}
			} else if (species == 2) {
				if (animal == 0) {
					birds[birdCounter++] = (Bird) speciesFactory3.getAnimal(Constants.Animals.Birds.Pigeon);
				} else if (animal == 1) {
					birds[birdCounter++] = (Bird) speciesFactory3.getAnimal(Constants.Animals.Birds.Parrot);
				} else if (animal == 2) {
					birds[birdCounter++] = (Bird) speciesFactory3.getAnimal(Constants.Animals.Birds.Colibri);
				}
			} else if (species == 3) {
				if (animal == 0) {
					aquatics[aquaticCounter++] = (Aquatic) speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
				} else if (animal == 1) {
					aquatics[aquaticCounter++] = (Aquatic) speciesFactory4.getAnimal(Constants.Animals.Aquatics.Dolphin);
				} else if (animal == 2) {
					aquatics[aquaticCounter++] = (Aquatic) speciesFactory4.getAnimal(Constants.Animals.Aquatics.Octopus);
				}
			} else if (species == 4) {
				if (animal == 0) {
					insects[insectCounter++] = (Insect) speciesFactory5.getAnimal(Constants.Animals.Insects.Butterfly);
				} else if (animal == 1) {
					insects[insectCounter++] = (Insect) speciesFactory5.getAnimal(Constants.Animals.Insects.Cockroach);
				} else if (animal == 2) {
					insects[insectCounter++] = (Insect) speciesFactory5.getAnimal(Constants.Animals.Insects.Spider);
				}
			}
		}
		
		for(int i=0; i < animalCounter; i++) {
			System.out.printf("We have an animal with %d legs, whose name is %s, normal body temperature is %f and percent of body hair is %f\n",
					mammals[i].getNrOfLegs(), mammals[i].getName(), mammals[i].getNormalBodyTemp(), mammals[i].getPercBodyHair());
			System.out.printf("We have an animal with %d legs, whose name is %s and his laying eggs' state is %s\n",
				reptiles[i].getNrOfLegs(), reptiles[i].getName(), reptiles[i].getIsLayingEggs());
		}
		
	}
}
