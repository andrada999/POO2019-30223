
public class Hotel {
	Employee[] employees = new Employee[100];
	Client[] clients = new Client[200];
	Room[] rooms = new Room[100];
	
	private int numberOfEmployees;
	private int numberOfClients;
	private int numberOfRooms;
	private String period;
	private int numberOfEmptyRooms;
	private int numberOfOccupiedRooms;
	
	public int getNrOfEmployees(){
		return this.numberOfEmployees;
	}
	
	public int getNrOfClients(){
		return this.numberOfClients;
	}
	
	public int getNrOfRooms(){
		return this.numberOfRooms;
	}
	
	public String getPeriod(){
		return this.period;
	}
	
	public int getNumberOfOccupiedRooms(){
		return this.numberOfOccupiedRooms;
	}
	
	public int getNumberOfEmptyRooms(){
		numberOfEmptyRooms = numberOfRooms - numberOfOccupiedRooms;
		return this.numberOfEmptyRooms;
	}
	
	public void addEmployees(Employee employee){
		employees[numberOfEmployees++] = employee;
	}
	
	public void addClients(Client client){
		clients[numberOfClients++] = client;
	}
	
	public void showSortedClientsList(int numberOfNights){
		for(int i=1; i<=numberOfNights; i++)
			System.out.println(clients[i].getName());
	}
	
	public void showSortedEmployeesList(int numberOfClients){
		for(int i=1; i<=numberOfClients; i++)
			System.out.println(employees[i].getName());
	}
	
	public void showEmptyRooms(){
		for(int i=1; i<=numberOfRooms; i++){
			if(this.period.equals(period))
				System.out.println(rooms[i].getNumebrId());
		}
	}
	
	public void showStatistics(){
		System.out.println("Number of empty rooms: " + numberOfEmptyRooms);
		System.out.println("Number of occupied rooms: " + numberOfOccupiedRooms);
	}

}
