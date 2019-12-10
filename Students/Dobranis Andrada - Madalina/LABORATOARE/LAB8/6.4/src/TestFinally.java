
public class TestFinally {
	public static void main(String[] args) {
		try{
			Exception e = new Exception("asta este exceptia");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("s-a ajuns aici");
		}

	}
}
