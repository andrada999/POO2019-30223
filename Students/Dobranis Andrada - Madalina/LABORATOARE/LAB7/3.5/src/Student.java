
public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina masina;
	
	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}
	
	public String getNume() {
		return nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public Masina getMasina() {
		return masina;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	@Override
	public Object clone() {
		Student student = null;
		try {
			student = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			student =  new Student(this.getNume(), this.getPrenume(), this.getMasina());
		}
		student.masina = (Masina) this.masina.clone();
		return student;
	}
}
