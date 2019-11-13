
public class Client extends Person {
	private int roomNumber;
	private String checkInDate;
	private String checkOutDate;
	
	public Client(int ID, String name, String phoneNumber, int roomNumber, String checkInDate, String checkOutDate){
		super(ID, name, phoneNumber);
		this.roomNumber = roomNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}
	
	public int getRoomNumber(){
		return this.roomNumber;
	}
	
	public void setRoomNumber(int nr){
		this.roomNumber = nr;
	}
	
	public String getCheckInDate(){
		return this.checkInDate;
	}
	
	public void setCheckInDate(String date){
		this.checkInDate = date;
	}
	
	public String getCheckOutDate(){
		return this.checkOutDate;
	}
	
	public void setCheckOutDate(String date){
		this.checkOutDate = date;
	}
	
	public String toString(){
		return super.toString() + "Room number: " +  roomNumber + "\n" +
				"Check-in date: " + checkInDate + "\n" + 
				"Check-out date: " + checkOutDate;
	}
}
