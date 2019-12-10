
public class ReferintaObiect {
	@SuppressWarnings("null")
	public static void main(String args[]) { 
		String s = null;
		try {
			s.toString();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
