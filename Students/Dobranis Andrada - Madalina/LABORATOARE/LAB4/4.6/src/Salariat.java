
public class Salariat {
	private String nume;
	private String prenume;
	private String functie;
	private int varsta;
	private double salariuBrut;
	private final double impozit = 0.4;
	
	Salariat(){
		
	}
	
	public Salariat(String n, String p, String f, int v, double s) {
		this.nume = n;
		this.prenume = p;
		this.functie = f;
		this.varsta = v;
		this.salariuBrut = s;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void setSalariu(double salariuBrut) {
		this.salariuBrut = salariuBrut;
	}
	public String getNume() {
		return nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public String getFunctie() {
		return functie;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public double getSalariu() {
		return salariuBrut;
	}
	
	
	public double salariuNet() {
		return salariuBrut * (1-impozit);
	}
	public static void main(String[] args) {
		Salariat sal = new Salariat();
		System.out.println("Nume salariat: " + sal.getNume() + " " + sal.getPrenume() + " in functia de " + sal.getFunctie() + " are salariul " + sal.getSalariu());

	}

}
