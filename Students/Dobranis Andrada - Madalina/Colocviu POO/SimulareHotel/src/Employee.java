
public class Employee extends Person {
	private String employmentDate;
	private int clientsNumber;
	
	public Employee(int ID, String name, String phoneNumber, String employmentDate, int clientsNumber){
		super(ID, name, phoneNumber);
		this.employmentDate = employmentDate;
		this.clientsNumber = clientsNumber;
	}
	
	public String getEmploymentDate(){
		return this.employmentDate;
	}
	
	public void setEmploymentDate(String date){
		this.employmentDate = date;
	}
	
	public int getClientsNumber(){
		return this.clientsNumber;
	}
	
	public void setClientsNumber(int nr){
		this.clientsNumber = nr;
	}
	
	
	public void  cazeazaClient(){
		System.out.println("Clientul a fost cazat.\n");
	}
	
	public void decazeazaClient(){
		System.out.println("Clientul a fost decazat.\n");
	}
	
	public String toString(){
		return super.toString() + "Emplyment date: " +  employmentDate + "\n" +
				"Number of clients: " + clientsNumber;
	}
}
