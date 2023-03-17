package ejercicio5;

public class Estudiante extends Persona {
	double nota;

	public Estudiante(String nombre, double edad, String sexo, double nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nota = nota;
		
		this.presente = novillo();
	}

	@Override
	protected boolean novillo() {
		// TODO Auto-generated method stub
		if (Math.random() < 0.5) {
			return false;
		} else {
			return true;
		}
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
