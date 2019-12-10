
@SuppressWarnings("serial")
public class AnotherException extends Exception {
	String msg2;
	public AnotherException(String msg) {
		super("Alta exceptie");
		this.msg2 = msg;
	}
}
