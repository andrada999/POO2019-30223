import java.awt.Color;

public class Masina implements Cloneable {
	private String marca;
	private Color culoare;
	
	public Masina(String marca, Color culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public Color getCuloare() {
		return culoare;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void repaintMasina(Color newColor) {
		this.culoare = newColor;
	}
	
	@Override
	public Object clone() {
		try {
			return (Masina) super.clone();
		} catch (CloneNotSupportedException e) {
			return new Masina(this.getMarca(), this.getCuloare());
		}
	}
}
