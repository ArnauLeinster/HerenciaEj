package ejercicio5;

public class Profesor extends Persona{
	String asignatura;
	
	@Override
	protected boolean novillo() {
		// TODO Auto-generated method stub
		if (Math.random() < 0.2) {
			return false;
		} else {
			return true;
		}
	}
}
