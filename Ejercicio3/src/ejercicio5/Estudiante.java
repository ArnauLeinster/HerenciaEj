package ejercicio5;

public class Estudiante extends Persona {
	double nota;

	@Override
	protected boolean novillo() {
		// TODO Auto-generated method stub
		if (Math.random() < 0.5) {
			return false;
		} else {
			return true;
		}
	}
}
