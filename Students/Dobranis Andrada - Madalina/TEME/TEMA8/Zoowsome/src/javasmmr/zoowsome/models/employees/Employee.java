package javasmmr.zoowsome.models.employees;

import java.util.UUID;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;
import org.w3c.dom.Element;

public abstract class Employee implements XML_Parsable {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee(String name,BigDecimal salary, boolean isDead) {
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getUniqueId() {
		return this.id;
	}
	
	public void setUniqueId(long id) {
		this.id = id;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public boolean getDeadState() {
		return isDead;
	}
	
	public void setDeadState(boolean isDead) {
		this.isDead = isDead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}
	
	public void decodeFromXml(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setUniqueId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
		setDeadState(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
