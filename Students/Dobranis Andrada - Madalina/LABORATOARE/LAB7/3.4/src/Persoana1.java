
public class Persoana1 implements Comparable<Persoana1> {
	private String nume;
	private String prenume;
	private int varsta;
	
	public Persoana1(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}
	
	public int compareTo(Persoana1 other) {
		if(this.varsta > other.varsta) {
			return 1;
		}
		if(this.varsta < other.varsta) {
			return -1;
		}
		return 0;
	}
	
	public String toString(){
        return "Nume: " + nume + ", prenume: " + prenume + ", varsta: " + varsta;
    }
}
