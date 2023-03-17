package ejercicio5;

public class Profesor extends Persona {
	String asignatura;

	public Profesor(String nombre, double edad, String sexo, String asignatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asignatura = asignatura;

		this.presente = novillo();
	}

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
