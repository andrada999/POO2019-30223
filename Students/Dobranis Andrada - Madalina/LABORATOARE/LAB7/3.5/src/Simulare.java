import java.awt.Color;

public class Simulare {
	public static void main (String[] args) {
		Masina masina = new Masina("Logan", Color.BLACK);
		Student student = new Student("Pop", "Cristina", masina);
		Student studentClonat = (Student) student.clone();
		
		masina.repaintMasina(Color.YELLOW);
		System.out.println("Inainte de clonare: " + student.getNume() + " " + student.getPrenume() + " " + student.getMasina().getCuloare());
		System.out.println("Dupa clonare: " + studentClonat.getNume() + " " + studentClonat.getPrenume() + " " + studentClonat.getMasina().getCuloare());
	}
}
