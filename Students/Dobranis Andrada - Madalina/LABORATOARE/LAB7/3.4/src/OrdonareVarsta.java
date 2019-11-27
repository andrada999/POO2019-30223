import java.util.Arrays;

public class OrdonareVarsta {

	public static void main(String[] args) {
	    Persoana1[] persoane = new Persoana1[5];
	    
	    try {
            adaugaPersoane(persoane);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println("Sortare persoane in functie de varsta: ");
	    Arrays.sort(persoane);
		afiseazaPersoane(persoane);	
	}
	
	public static void adaugaPersoane(Persoana1[] persoane) {
		persoane[0] = new Persoana1("Tom", "Bommy", 25);
		persoane[1] = new Persoana1("Kom", "NOmmy", 23);
		persoane[2] = new Persoana1("Bom", "Tommy", 21);
		persoane[3] = new Persoana1("Nom", "Kimmy", 29);
		persoane[4] = new Persoana1("Rom", "Rommy", 27);
	}
	
	public static void afiseazaPersoane(Persoana1[] persoane) {
		for(Persoana1 persoana : persoane) {
			System.out.println(persoana);
		}
	}
}