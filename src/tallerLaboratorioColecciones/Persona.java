package tallerLaboratorioColecciones;

public class Persona implements Comparable<Persona>{
	private String name;
	private int age;
	private String gender;
	public Persona(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Persona () {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int compareTo(Persona o) {
	
		return Integer.compare(this.age, o.getAge());
	}
	public String toString() {
	     return "Persona{" +
	                "nombre='" + name + '\'' +
	                ", edad='" + age + '\'' +
	                ", género=" + gender +
	                '}';
	    }
}
