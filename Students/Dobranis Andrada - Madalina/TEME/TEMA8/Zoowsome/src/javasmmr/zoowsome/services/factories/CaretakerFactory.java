package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Caretaker;

import java.math.BigDecimal;
import java.util.Random;

public class CaretakerFactory extends EmployeeFactory {
	public Employee getEmployeeFactory(String type) throws Exception {
		String[] caretakerNames = new String[] {"Andrei", "Bogdan", "Cristian", "Denis", "Edi", "Florin", "George", "Horatiu","Ionel", "Jean"};
		Random randomizer = new Random();
		int name = randomizer.nextInt(caretakerNames.length);
		BigDecimal[] salaries = new BigDecimal[] { new BigDecimal("1000"), new BigDecimal("1500"), new BigDecimal("2000"), new BigDecimal("2500"), new BigDecimal("3000"), new BigDecimal("3500"), new BigDecimal("4000"), new BigDecimal("4500"), new BigDecimal("5000"), new BigDecimal("5500")};
		int salary = randomizer.nextInt(salaries.length);
		double workingHours = 10 * randomizer.nextDouble();

		return new Caretaker(caretakerNames[name], salaries[salary], false, workingHours);
	}
}
