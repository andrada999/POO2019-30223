package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours) {
		super(name,salary,isDead);
		this.workingHours = workingHours;
	}

	public double getWorkingHours() {
		return this.workingHours;
	}
	
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public String takeCareOf(Animal a) {
		if (a.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		 if (this.workingHours < a.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		else {
			a.setTakenCareOf(true);
			this.workingHours -= a.getMaintenanceCost();
			return Constants.Employees.Caretakers.TCO_SUCCESS;
		}
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.Caretakers.TCO_SUCCESS);
	}
	
	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
