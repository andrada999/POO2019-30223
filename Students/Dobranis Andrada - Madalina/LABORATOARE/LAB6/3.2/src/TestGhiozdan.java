
public class TestGhiozdan {
	public static void main(String[] args) {
		Ghiozdan ghiozdan = new Ghiozdan();
		
		Manual m1 = new Manual("Romana");
		Manual m2 = new Manual("Matematica");
		Manual m3 = new Manual("Biologie");
		Manual m4 = new Manual("Fizica");
		Manual m5 = new Manual("Chimie");
		
		ghiozdan.add(m1);
		ghiozdan.add(m2);
		ghiozdan.add(m3);
		ghiozdan.add(m4);
		ghiozdan.add(m5);
		
		Caiet c1 = new Caiet("Romana");
		Caiet c2 = new Caiet("Matematica");
		Caiet c3 = new Caiet("Biologie");
		Caiet c4 = new Caiet("Fizica");
		
		ghiozdan.add(c1);
		ghiozdan.add(c2);
		ghiozdan.add(c3);
		ghiozdan.add(c4);
		
		ghiozdan.getNrRechizite();
		ghiozdan.getNrCaiete();
		ghiozdan.getNrManuale();
		
		System.out.println();
		System.out.println("Rechizitele din lista sunt: ");
		ghiozdan.listItems();
		System.out.println();
		System.out.println("Caietele din lista sunt: ");
		ghiozdan.listCaiet();
		System.out.println();
		System.out.println("Manualele din lista sunt: ");
		ghiozdan.listManual();	
	}
}
