
@SuppressWarnings("rawtypes")
public class Iterator implements java.util.Iterator {
	private String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private int position =  0;
	
	public boolean hasNext() {
		if(position == cards.length) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public Object next() {
        return (Object)cards[position++];
    }
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
        Iterator iterator = new Iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
 