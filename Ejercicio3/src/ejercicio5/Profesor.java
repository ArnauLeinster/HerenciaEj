package ejercicio5;
/**
 * @author aitor arnau marc
 *
 */
public class Profesor extends Persona {
	String asignatura;

	//Constructor with the data that we will be using in this java class
	public Profesor(String nombre, double edad, String sexo, String asignatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asignatura = asignatura;

		this.presente = novillo();
	}

	//Sets whether the teacher is present or not
	@Override
	protected boolean novillo() {
		// TODO Auto-generated method stub
		if (Math.random() < 0.2) {
			return false;
		} else {
			return true;
		}
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
}
