package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal{
	private boolean laysEggs;
	
	public Reptile(int nrOfLegs, String name, double maintenanceCost, double dangerPerc,  boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}
	
	public boolean getIsLayingEggs() {
		return this.laysEggs;
	}
	
	public void setLayedEggs(boolean eggs) {
		this.laysEggs = eggs;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "isLayingEggs", String.valueOf(getIsLayingEggs()));
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isLayingEggs").item(0).getTextContent()));
	}
}