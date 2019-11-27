import java.util.Arrays;

public class OrdonareNume {

	public static void main(String[] args) {
	    Persoana[] persoane = new Persoana[5];
	    
	    try {
            adaugaPersoane(persoane);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println("Sortare persoane in functie de nume: ");
	    Arrays.sort(persoane);
		afiseazaPersoane(persoane);
		
	}
	
	public static void adaugaPersoane(Persoana[] persoane) {
		persoane[0] = new Persoana("Tom", "Rommy", 23);
		persoane[1] = new Persoana("Kom", "Kimmy", 24);
		persoane[2] = new Persoana("Bom", "Tommy", 25);
		persoane[3] = new Persoana("Nom", "Bommy", 26);
		persoane[4] = new Persoana("Rom", "Nommy", 27);
	}
	
	public static void afiseazaPersoane(Persoana[] persoane) {
		for(Persoana persoana : persoane) {
			System.out.println(persoana);
		}
	}
}
