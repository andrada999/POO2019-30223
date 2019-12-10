
public class MyException {
	public void g() throws AnException{
		throw new AnException(null);
	}
	
	public void f() throws AnotherException{
		try {
			g();
		} catch(AnException e) {
			throw new AnotherException(null);
		}
	}
	
	public static void main(String args[]) { 
		MyException exception = new MyException();
		try {
			exception.f();
		} catch(AnotherException e) {
			System.out.println(e);
		}
	}

}
