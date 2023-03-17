/**
 * 
 */
package ejercicio2;

import java.util.ArrayList;

/**
 * @author aitor arnau marc
 *
 */
public class mainApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("EJERCICIO 2 - SERIES y VIDEOJUEGOS");
		Serie s = new Serie();
		Videojuego v = new Videojuego();

		// GENERAR SERIES - VIDEOJUEGOS
		Serie series[] = (Serie[]) s.generador();
		Videojuego videojuegos[] = (Videojuego[]) v.generador();

		// ENTREGAR ALGUNOS VIDEOJUEGOS-SERIES
		for (int i = 0; i < series.length; i += 2) {
			series[i].entregar();
			videojuegos[i].entregar();
		}

		// CONTAR ENTREGADOS
		System.out.println("Contador de entregados");
		s.entregados(series);
		v.entregados(videojuegos);

		// IMPRIMIR MAX DE CADA OBJETO
		System.out.println("MAX HORAS VIDEOJUEGOS");
		v.maxHorasEstimadasVideojuegos(videojuegos);

		System.out.println("MAX TEMPORADAS SERIES");
		s.maxTemporadasSeries(series);

	}
}
