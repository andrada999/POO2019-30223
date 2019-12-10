
@SuppressWarnings("serial")
public class ExceptieZiNelucratoare extends Exception {
	public ExceptieZiNelucratoare() {
		super("Ziua nu este lucratoare!");
	}
	
	public ExceptieZiNelucratoare(String msg) {
		super(msg);
	}
}
