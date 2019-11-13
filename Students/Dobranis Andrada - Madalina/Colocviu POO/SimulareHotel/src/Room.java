
public class Room {
	private int numberId;
	private int capacity;
	private float pricePerNight;
	private int numberOfNights;
	private int numberOfClients;
	private int specialPrice;
	
	Client[] clients = new Client[10];
	
	public Room(int nr, int c, int p){
		this.numberId = nr;
		this.capacity = c;
		this.pricePerNight = p;
		
	}
	public int getNumebrId(){
		return this.numberId;
	}
	
	public int getCapacity(){
		return this.capacity;
	}
	
	public float getPricePerNight(){
		return this.pricePerNight;
	}
	
	public int getSpecialPrice(){
		if(capacity == 1)
			pricePerNight = specialPrice;
		return this.specialPrice;
	}
	public int getNumberOfNights(){
		return this.numberOfNights;
	}
	
	public int getNumberOfClients(){
		return this.numberOfClients;
	}
	
	public float getPrice(int discount){
		float price = pricePerNight * numberOfNights + discount;
		return price;
	}
	
	public boolean isCompletelyOccupied(){
		if(numberOfClients == capacity)
			return true;
		else
			return false;
	}
}
