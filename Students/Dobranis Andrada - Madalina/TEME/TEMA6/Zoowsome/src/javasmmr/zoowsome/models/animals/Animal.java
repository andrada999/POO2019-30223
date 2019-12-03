package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Animal implements Killer, XML_Parsable {
	private int nrOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean takenCareOf;
	
	public Animal(int nrOfLegs, String name, double maintenanceCost, double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		this.takenCareOf = false;
	}
	
	public int getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(Integer nr) {
		this.nrOfLegs = nr;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String nume) {
		this.name = nume;
	}
	
	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	
	public void setMaintenanceCost(double cost) {
		this.maintenanceCost = cost;
	}
	
	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = false;
	}
	
	private void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}
	
	public boolean kill() {
		double randomNumber = Math.random();
		if(randomNumber < dangerPerc) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	
	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
