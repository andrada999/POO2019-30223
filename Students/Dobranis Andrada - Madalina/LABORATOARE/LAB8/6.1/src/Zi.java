
public class Zi {
	private String nume;
	private boolean ziLucratoare;
	
	public Zi(String nume, boolean ziLucratoare) {
		this.nume = nume;
		this.ziLucratoare = ziLucratoare;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public boolean esteLucratoare() {
		return this.ziLucratoare;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setLucratoare(boolean ziLucratoare) {
		this.ziLucratoare = ziLucratoare;
	}
	
}
