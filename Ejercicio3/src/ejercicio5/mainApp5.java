package ejercicio5;

public class mainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p = new Profesor("Jose", 30, "Hombre", "Mates");
		Aula a = new Aula(123, 10, "Mates");

		Estudiante clase[] = new Estudiante[a.nEstu];

		generarClase(clase);

		if (a.checkAula(clase, p)) {
			
			a.contarM(clase);
			
		} else {
			System.out.println("No se puede hacer clase");
		}
	}
	
	public static void generarClase(Estudiante[] clase) {
		Estudiante e0 = new Estudiante("Sandra", 9, "Mujer", 3);
		Estudiante e1 = new Estudiante("Juan", 10, "Hombre", 7);
		Estudiante e2 = new Estudiante("Sara", 10, "Mujer", 4);
		Estudiante e3 = new Estudiante("Eloi", 10, "Hombre", 5);
		Estudiante e4 = new Estudiante("Andrea", 10, "Mujer", 8);
		Estudiante e5 = new Estudiante("Javier", 9, "Hombre", 3);
		Estudiante e6 = new Estudiante("Marina", 9, "Mujer", 10);
		Estudiante e7 = new Estudiante("Raul", 9, "Hombre", 4);
		Estudiante e8 = new Estudiante("Marta", 9, "Mujer", 9);
		Estudiante e9 = new Estudiante("Filipo", 9, "Hombre", 6);
		
		clase[0] = e0;
		clase[1] = e1;
		clase[2] = e2;
		clase[3] = e3;
		clase[4] = e4;
		clase[5] = e5;
		clase[6] = e6;
		clase[7] = e7;
		clase[8] = e8;
		clase[9] = e9;
	}

}
