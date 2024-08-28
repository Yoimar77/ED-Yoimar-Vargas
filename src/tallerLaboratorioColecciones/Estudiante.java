package tallerLaboratorioColecciones;

public class Estudiante extends Persona {
	private String tuition;

	public Estudiante(String name, int age, String gender, String tuition) {
		super(name, age, gender);
		this.tuition=tuition;
	}

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}
    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula='" + tuition + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                '}';
    }	
	

}
