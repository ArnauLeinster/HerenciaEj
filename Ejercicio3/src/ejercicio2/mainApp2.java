/**
 * 
 */
package ejercicio2;

import java.util.ArrayList;

/**
 * @author aitor
 *
 */
public class mainApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("EJERCICIO 2 - SERIES y VIDEOJUEGOS");
		Serie series[] = new Serie[5];
		Videojuego videojuegos[] = new Videojuego[5];
		
		// GENERAR SERIES - VIDEOJUEGOS
		generarSeriesVideojuegos(series, videojuegos);
		
		// ENTREGAR ALGUNOS VIDEOJUEGOS-SERIES
		for (int i = 0; i < series.length; i += 2) {
			series[i].entregar();
			videojuegos[i].entregar();
		}
		
		// CONTAR ENTREGADOS
		entregados(series, videojuegos);
		
		System.out.println("MAX HORAS VIDEOJUEGOS");
		maxHorasEstimadasVideojuegos(videojuegos);
		
		System.out.println("MAX TEMPORADAS SERIES");
		maxTemporadasSeries(series);

	}

	// GENERAR SERIES
	public static void generarSeriesVideojuegos(Serie serie[], Videojuego videojuegos[]) {
		for (int i = 0; i < serie.length; i++) {
			Serie s = new Serie("Titulo" + i, i, "Comedia" + i, "Creador" + i);
			Videojuego v = new Videojuego("Titulo" + i, i, "Battle" + i, "Compañia" + i);
			serie[i] = s;
			videojuegos[i] = v;
		}
	}

	
	//CONTADOR ENTREGADOS
	public static void entregados(Serie series[], Videojuego videojuegos[]) {
		int contador = 0;
		for (int i = 0; i < series.length; i++) {
			if(series[i].isEntregado()) {
				contador++;
				System.out.println("La serie: "+series[i].getTitulo()+" ha sido ENTREGADA");
			}
			if(videojuegos[i].isEntregado()) {
				contador++;
				System.out.println("El videojuego: "+videojuegos[i].getTitulo()+" ha sido ENTREGADO");
			}
		}
		System.out.println("En total se han entregado "+contador+" videojuegos y peliculas");
		
	}
	
	//VERIFICAR HORAS ESTIMADAS
	public static void maxHorasEstimadasVideojuegos(Videojuego videojuegos[]) {
		int pos = 0;
		for(int i = 0; i<videojuegos.length; i++) {
			if(videojuegos[pos].getHorasEstimadas() < videojuegos[i].getHorasEstimadas()) {
				pos = i;
			}
		}
		System.out.println(videojuegos[pos].toString());
			
	}
	
	//VERIFICAR HORAS ESTIMADAS
		public static void maxTemporadasSeries(Serie series[]) {
			int pos = 0;
			for(int i = 0; i<series.length; i++) {
				if(series[pos].getNumeroTemporadas() < series[i].getNumeroTemporadas()) {
					pos = i;
				}
			}
			System.out.println(series[pos].toString());
				
		}

}
