package ejercicio6;

/**
 * @author aitor arnau marc
 *
 */
public class Pelicula {

	// ATRIBUTOS
	private String titulo;
	private double duracion;
	private int edadMinima;
	private String director;

	// CONSTRUCTOR
	public Pelicula() {
		this.titulo = "";
		this.duracion = 0.0;
		this.edadMinima = 0;
		this.director = "";
	}

	public Pelicula(String titulo, double duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
