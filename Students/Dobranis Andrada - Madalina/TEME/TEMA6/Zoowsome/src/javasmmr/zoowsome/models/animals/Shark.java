package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {
	private static waterType saltwater;
	
	public Shark(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, int avgSwimDepth, waterType water) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, water);
	}
	
	public Shark() {
		super(0,"Sharky",6.7, 1,2000,saltwater);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}
}
