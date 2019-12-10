
public class TestExceptiaMea {
	public static void main(String args[]) {
		try {
			throw new ExceptiaMea("Asta e exceptia mea");
		} catch(ExceptiaMea e) {
			e.printMesaj();
		}
	}
}
