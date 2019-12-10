package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import java.util.ArrayList;
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
		Animal a5 = speciesFactory5.getAnimal(Constants.Animals.Insects.Butterfly);
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
		Animal animals[] = new Animal[50];
		Caretaker caretakers[] = new Caretaker[50];

		for (int c = 0; c < caretakers.length; c++) {
			for (int a = 0; a < animals.length; a++) {
				if ((caretakers[c].getDeadState() == false) && animals[a].getTakenCareOf() == false) {
					String result = caretakers[c].takeCareOf(animals[a]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretakers[c].setDeadState(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						a++;
					} else {
						animals[a].setTakenCareOf(true);
					}
				}
			}
	    }
		
		AnimalRepository animalRepository = new AnimalRepository();

		ArrayList<Animal> savedAnimals = new ArrayList<Animal>();
		ArrayList<Animal> loadedAnimals = new ArrayList<Animal>();

		savedAnimals.add(animals[0]);
		savedAnimals.add(animals[1]);
		savedAnimals.add(animals[2]);
		savedAnimals.add(animals[3]);

		animalRepository.save(savedAnimals);
		loadedAnimals = animalRepository.load();

		EmployeeRepository employeeRepository = new EmployeeRepository();

		ArrayList<Employee> savedEmployees = new ArrayList<Employee>();
		ArrayList<Employee> loadedEmplyees = new ArrayList<Employee>();

		savedEmployees.add(caretakers[0]);
		savedEmployees.add(caretakers[1]);
		savedEmployees.add(caretakers[2]);
		savedEmployees.add(caretakers[3]);

		employeeRepository.save(savedEmployees);
		loadedEmplyees = employeeRepository.load();
    }			
}
