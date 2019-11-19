
public class Person {
	private int ID;
	private String name;
	private String phoneNumber;
	
	public Person(int ID, String name, String phoneNumber){
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public int getID(){
		return this.ID;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String toString(){
		return "ID: " +  ID + "\n" +
				"Name: " + name + "\n" + 
				"Phone number: " + phoneNumber;
	}
}
