package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal{
	private boolean migrates;
	private int avgFlightAltitude;
	
	public Bird(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean migrates, int avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public boolean getIsMigrating() {
		return this.migrates;
	}
	
	public void setMigrates(boolean migration) {
		this.migrates = migration;
	}
	
	public Integer getAverageFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	public void setAverageFlightAltitude(Integer altitude) {
		this.avgFlightAltitude = altitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "isMigrating", String.valueOf(getIsMigrating()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAverageFlightAltitude()));
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isMigrating").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}