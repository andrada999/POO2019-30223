
public class MainClass {
	public static void main(String[] args) {
		Lucrator lucratori[] = new Lucrator[5];
		CalendarLucru calendar1 = new CalendarLucru();
		CalendarLucru calendar2 = new CalendarLucru();
		CalendarLucru calendar3 = new CalendarLucru();
		CalendarLucru calendar4 = new CalendarLucru();
		CalendarLucru calendar5 = new CalendarLucru();
		
		calendar2.setZi(new Zi("luni", false), 0);
		calendar3.setZi(new Zi("marti", false), 0);
		calendar4.setZi(new Zi("miercuri", false), 0);
		calendar5.setZi(new Zi("joi", false), 0);
		lucratori[0] = new Lucrator("Andrei", calendar1);
		lucratori[1] = new Lucrator("Bogdan", calendar2);
		lucratori[2] = new Lucrator("Cristi", calendar3);
		lucratori[3] = new Lucrator("Dorian", calendar4);
		lucratori[4] = new Lucrator("Eusebiu", calendar5);
		
		try {
			lucratori[0].lucreaza("luni");
			lucratori[1].lucreaza("joi");
			lucratori[0].lucreaza("duminica");
			
			lucratori[1].lucreaza("luni");
			lucratori[1].lucreaza("marti");
			lucratori[1].lucreaza("sambata");
			
			lucratori[2].lucreaza("luni");
			lucratori[2].lucreaza("marti");
			lucratori[2].lucreaza("sambata");
			
		} catch (ExceptieZiNelucratoare e) {
			e.printStackTrace();
		}		
	}
}
