package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Tiger extends Mammal {
	public Tiger(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}
	
	public Tiger() {
		super(4,"Tigey", 5.7, 0.9, 37.5f, 98.0f);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}
}