
@SuppressWarnings("serial")
public class ExceptiaMea extends Exception {
	String mesaj;
	public ExceptiaMea(String mesaj) {
		super(mesaj);
		this.mesaj = mesaj;
	}
	
	public void printMesaj() {
		System.out.println(mesaj);
	}
}
