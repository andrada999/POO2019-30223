package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	public enum waterType{
		saltwater, freshwater
	};
	private waterType water;
	
	public Aquatic(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, int avgSwimDepth, waterType water) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.water = water;
	}
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public void setMigrates(int swimDepth) {
		this.avgSwimDepth = swimDepth;
	}
	
	public waterType getWaterType() {
		return this.water;
	}
	
	public void setWaterType(waterType newWaterType) {
		this.water = newWaterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}
	
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("getAvgSwimDepth").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}