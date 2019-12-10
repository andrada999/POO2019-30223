
public class CalendarLucru {
	private Zi[] zile = { new Zi("luni", true), new Zi("marti", true), new Zi("miercuri", true), new Zi("joi", true), new Zi("vineri", true),
						  new Zi("sambata", false), new Zi("duminica", false)};
	
	public Zi getZi(int z) {
		return zile[z];
	}
	
	public void setZi(Zi zi, int z) {
		this.zile[z] = zi;
	}
}
