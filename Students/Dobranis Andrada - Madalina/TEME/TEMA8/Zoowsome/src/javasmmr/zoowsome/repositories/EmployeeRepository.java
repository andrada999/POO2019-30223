package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

import java.math.BigDecimal;
import org.w3c.dom.Element;

public class EmployeeRepository extends EntityRepository<Employee> {
	private static final String XML_FILENAME = "Employees.xml";
	
	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	@Override
	protected Employee getEntityFromXmlElement(Element element) {

		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

		switch (discriminant) {
		case Constants.Employees.Caretakers.TCO_SUCCESS:
			BigDecimal salary =new BigDecimal(1000.0);
			Employee newCaretaker = new Caretaker("Pop",salary,false,260.5);
			newCaretaker.decodeFromXml(element);
			return newCaretaker;
		default:
			break;
		}
		return null;
	}
}

