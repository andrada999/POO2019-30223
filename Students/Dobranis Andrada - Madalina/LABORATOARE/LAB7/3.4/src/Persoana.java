public class Persoana implements Comparable<Persoana>{
	private String nume;
	private String prenume;
	private int varsta;
	
	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}
	
	public int compareTo(Persoana other) {
		return this.nume.compareTo(other.nume);
	}
	
	public String toString(){
        return "Nume: " + nume + ", prenume: " + prenume + ", varsta: " + varsta;
    }
}
