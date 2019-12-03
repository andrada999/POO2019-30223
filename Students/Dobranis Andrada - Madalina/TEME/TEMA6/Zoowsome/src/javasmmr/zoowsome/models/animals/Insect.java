package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	public Insect(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public boolean getCanFlyState() {
		return this.canFly;
	}
	
	public void setCanFlyState(boolean flyingState) {
		this.canFly = flyingState;
	}
	
	public boolean getIsDangerousState() {
		return this.isDangerous;
	}
	
	public void setIsDangerousState(boolean dangerousState) {
		this.isDangerous = dangerousState;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFlyState()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerousState()));
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
