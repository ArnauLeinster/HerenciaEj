package ejercicio6;

/**
 * @author aitor arnau marc
 *
 */
public class mainApp6 {

	public static void main(String[] args) {

		System.out.println("Ejercicio 6 - Cine");
		Pelicula pelicula = new Pelicula("Spiderman", 2.38, 16, "Marvel");
		Cine cine = new Cine(pelicula, 10);

		cine.sentarEspectadores();

		for (int i = 0; i < cine.getSala().length; i++) {
			for (int j = 0; j < cine.getSala()[0].length; j++) {
				int fila = j + 1;
				char columna = (char) (i + 65);

				System.out.println(
						"En la posicion " + fila + columna + " el valor que tenemos es " + cine.getSala()[i][j]);
			}
		}

	}

}
