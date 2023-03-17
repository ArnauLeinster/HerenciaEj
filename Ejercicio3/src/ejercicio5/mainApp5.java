package ejercicio5;

public class mainApp5 {

	public static void main(String[] args) {
		//Creating of the objects that we will be using
		Profesor p = new Profesor("Jose", 30, "Hombre", "Mates");
		Aula a = new Aula(123, 10, "Mates");
		Estudiante clase[] = new Estudiante[a.nEstu];

		//adding the Estudiantes to the array
		a.generarClase(clase);
		
		if (a.checkAula(clase, p)) {
			
			a.contarM(clase);
			
		} else {
			System.out.println("No se puede hacer clase");
		}
	}
	


}
