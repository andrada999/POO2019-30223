
public class ArraylndexOutOfBounds {
	public static void main(String args[]) {
		char[] array = new char[20];;
		try {
			array[20] = 'a';
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
