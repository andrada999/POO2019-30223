
public class Card implements Comparable<Card> {
	private String suit;
	private int value;
	
	public Card(String s, int v) {
		this.suit = s;
		this.value = v;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public int compareTo(Card x) {
		return Integer.compare(value,x.value);
	}
}
