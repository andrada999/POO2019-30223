
public class ThreeLevelsException {
	public static void main(String args[]) {
		A a = new C();
		try {
			a.f();
		} catch(Nivel1Exceptie e) {
			System.out.println(e);
		}
	}
}
