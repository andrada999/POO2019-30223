package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptile{
	public Snake(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}
	
	public Snake() {
		super(0,"Snaky",4.5,1,true);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Snake);
	}
}