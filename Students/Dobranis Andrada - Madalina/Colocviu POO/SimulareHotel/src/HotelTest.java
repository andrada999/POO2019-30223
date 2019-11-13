
public class HotelTest {

	public static void main(String[] args) {

		Room room1 = new Room(12,4,100);
		Room room2 = new Room(13,1,50);
		room1.getPrice(5);
		room2.getSpecialPrice();
		Employee employee1 = new Employee(1,"Dan Petrescu", "0751234567", "23-12-2008", 10);
		Employee employee2 = new Employee(2,"Dana Petre", "0759876542", "12-01-2009", 14);
		Employee employee3 = new Employee(3,"Diana Iancu", "0758425653", "27-06-2009", 10);
		Client client1 = new Client(1, "Ion Pop", "0741234567", 12, "12-11-2019", "13-11-2019");
		Client client2 = new Client(2, "Andra Georgescu", "0748488345", 13, "10-11-2019", "11-11-2019");
		Client client3 = new Client(3, "Andrei Leonte", "0749832645", 14, "09-11-2019", "10-11-2019");
		
		Hotel hotel = new Hotel();
		hotel.addEmployees(employee1);
		hotel.addEmployees(employee2);
		hotel.addEmployees(employee3);
		hotel.addClients(client1);
		hotel.addClients(client2);
		hotel.addClients(client3);
		
		hotel.showSortedClientsList(2);
		hotel.showSortedEmployeesList(10);
		hotel.showEmptyRooms();
		hotel.showStatistics();
		
		
	}

}
