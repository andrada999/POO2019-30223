
public class Lucrator {
	private String nume;
	private CalendarLucru calendar;
	
	Lucrator(String nume, CalendarLucru calendar) {
		this.nume = nume;
		this.calendar = calendar;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		Zi day = null;
		for(int i=0; i<7; i++) {
			if(this.calendar.getZi(i).getNume().equals(zi)) {
				day = this.calendar.getZi(i);
			}
		}
		if(day.esteLucratoare() == true) {
			System.out.println("Lucratorul " + getNume() + " lucreaza " + day.getNume());
		}else
			throw new ExceptieZiNelucratoare("lucru in zi nelucratoare");
	
	}
}
