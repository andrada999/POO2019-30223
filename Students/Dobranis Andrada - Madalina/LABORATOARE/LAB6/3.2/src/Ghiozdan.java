
public class Ghiozdan {
	private Rechizita[] rechizite;
	private int nrRechizite;
	
	public Ghiozdan() {
		this.rechizite = new Rechizita[20];
	}
	
	public Rechizita[] getRechizite() {
		return this.rechizite;
	}
	
	public void add(Caiet caiet) {
		rechizite[nrRechizite] = caiet;
		nrRechizite++;
	}
	
	public void add(Manual manual) {
		rechizite[nrRechizite] = manual;
		nrRechizite++;
	}
	
	public void listItems() {
		for(int i=0; i<this.nrRechizite; i++)
			System.out.println(this.rechizite[i].getNume());	
	}
	
	public void listCaiet() {
		for(int i=0; i<this.nrRechizite; i++)
			if(rechizite[i] instanceof Caiet)
				System.out.println(this.rechizite[i].getNume());	
	}
	
	public void listManual() {
		for(int i=0; i<this.nrRechizite; i++)
			if(rechizite[i] instanceof Manual)
				System.out.println(this.rechizite[i].getNume());	
	}
	
	public void getNrRechizite() {
		System.out.println("Numarul de rechizite este: " + nrRechizite);
	}
	
	public void getNrCaiete() {
		int nrCaiete = 0;
		for(int i=0; i<=this.nrRechizite; i++)
			if(rechizite[i] instanceof Caiet)
				nrCaiete++;
		System.out.println("Numarul de caiete este: " + nrCaiete);
	}
	
	public void getNrManuale() {
		int nrManuale = 0;
		for(int i=0; i<=this.nrRechizite; i++)
			if(rechizite[i] instanceof Manual)
				nrManuale++;
		System.out.println("Numarul de manuale este: " + nrManuale);
	}
}

