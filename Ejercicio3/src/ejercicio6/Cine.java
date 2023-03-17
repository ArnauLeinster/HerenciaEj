/**
 * 
 */
package ejercicio6;

import java.util.ArrayList;

/**
 * @author aitor arnau marc
 *
 */
public class Cine {
	// CONSTANTES
	static final int FILAS = 8;
	static final int COLUMNAS = 9;

	// ATRIBUTOS
	private boolean sala[][] = new boolean[FILAS][COLUMNAS];
	private Pelicula pelicula;
	private ArrayList<Espectador> listaEspectadores;
	private double precioEntrada;

	// CONSTRUCTOR
	public Cine(Pelicula pelicula, double precioEntrada) {
		this.sala = generarSalaInicial();
		this.pelicula = pelicula;
		this.listaEspectadores = generarEspectadores();
		this.precioEntrada = precioEntrada;
	}

	// GETTERS y SETTERS
	public boolean[][] getSala() {
		return sala;
	}

	public void setSala(boolean[][] sala) {
		this.sala = sala;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public ArrayList<Espectador> getListaEspectadores() {
		return listaEspectadores;
	}

	public void setListaEspectadores(ArrayList<Espectador> listaEspectadores) {
		this.listaEspectadores = listaEspectadores;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	// METODOS
	// FUNCION QUE ME GENERA LA SALA INICIAL CON TODAS LAS POSICIONES A TRUE
	// (VACIAS)
	private boolean[][] generarSalaInicial() {
		boolean salaInicial[][] = new boolean[FILAS][COLUMNAS];
		for (int i = 0; i < COLUMNAS; i++) {
			for (int j = 0; j < FILAS; j++) {
				salaInicial[j][i] = true;
			}
		}
		return salaInicial;
	}

	// FUNCION PARA GENERAR ESPECTADORES ALEATORIAMENTE
	private ArrayList<Espectador> generarEspectadores() {

		ArrayList<Espectador> listaEspectadoresGenerado = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			Espectador espectador = new Espectador("Espectador" + i, i + 10, i + 20.0);
			listaEspectadoresGenerado.add(espectador);
		}
		return listaEspectadoresGenerado;

	}

	// FUNCION PARA SENTAR ESPECTADORES ALEATORIAMENTE
	public void sentarEspectadores() {

		int edadMinima = pelicula.getEdadMinima();

		for (int i = 0; i < listaEspectadores.size(); i++) {
			double dineroEspectador = listaEspectadores.get(i).getDinero();
			int edadEspectador = listaEspectadores.get(i).getEdad();

			if (dineroEspectador >= precioEntrada && edadEspectador >= edadMinima) {
				boolean sentado = false;
				do {
					int fila = (int) (Math.random() * (FILAS - 1) + 1);
					int columna = (int) (Math.random() * (COLUMNAS - 1) + 1);
					if (sala[fila][columna] == true) {
						sala[fila][columna] = false;
						sentado = true;
					}

				} while (!sentado);
			}
		}
	}

}
