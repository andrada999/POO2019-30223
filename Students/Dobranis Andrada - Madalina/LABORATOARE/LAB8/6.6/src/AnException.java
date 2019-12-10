
@SuppressWarnings("serial")
public class AnException extends Exception{
	String msg1;
	public AnException(String msg) {
		super("O exceptie");
		this.msg1 = msg;
	}
}
