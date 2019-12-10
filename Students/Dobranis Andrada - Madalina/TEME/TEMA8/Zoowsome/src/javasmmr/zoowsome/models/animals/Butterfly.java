package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}
	
	public Butterfly() {
		super(6,"Sunny", 0.1, 0.1,true,false);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Butterfly);
	}
}