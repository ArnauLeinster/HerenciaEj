package ejercicio2;

/**
 * @author aitor
 *
 */
public class Videojuego implements Entregable {
	// CONSTANTES
	static final int estimatedHour = 10;
	static final boolean ent = false;
	// ATRIBUTOS
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	// COSTRUCTORES
	// 1-Por defecto
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = estimatedHour;
		this.entregado = ent;
		this.genero = "";
		this.compañia = "";
	}

	// 1-Con titulo y horas estimadas
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ent;
		this.genero = "";
		this.compañia = "";
	}

	// 3-Con todo excepto entregado
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ent;
		this.genero = genero;
		this.compañia = compañia;
	}

	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	// METODOS
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

	@Override
	public void entregar() {
		entregado = true;

	}

	@Override
	public void devolver() {
		entregado = false;

	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public void compareTo(Object a) {
		if (this.getClass() == a.getClass()) {

			Videojuego videojuego = (Videojuego) a;

			if (this.getHorasEstimadas() == videojuego.getHorasEstimadas()) {
				System.out.println("Las 2 series tienen el mismo numero de temporadas");
			} else {
				System.out.println("Las 2 series tienen temporadas diferentes");
			}

		} else {
			System.out.println("NO SE PUEDE COMPARAR");
		}
	}
}
