package ejercicio2;

/**
 * @author aitor arnau marc
 *
 */
public class Serie implements Entregable {
	// CONSTANTES
	static final int temp = 3;
	static final boolean ent = false;
	// ATRIBUTOS
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// CONSTRUCTORES
	// 1-Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = temp;
		this.entregado = ent;
		this.genero = "";
		this.creador = "";
	}

	// 2- Constructor con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = temp;
		this.entregado = ent;
		this.genero = "";
		this.creador = creador;
	}

	// 3- Constructor con todo excepto entregado
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = temporadas;
		this.entregado = ent;
		this.genero = genero;
		this.creador = creador;
	}

	// GETTERS y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	// METODOS
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
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
			Serie serie = (Serie) a;
			if (this.getNumeroTemporadas() == serie.getNumeroTemporadas()) {
				System.out.println("Las 2 series tienen el mismo numero de temporadas");
			} else {
				System.out.println("Las 2 series tienen temporadas diferentes");
			}
		} else {
			System.out.println("NO SE PUEDE COMPARAR");
		}
	}

	@Override
	public Object generador() {
		Serie serie[] = new Serie[5];
		for (int i = 0; i < serie.length; i++) {
			Serie s = new Serie("Titulo" + i, i, "Comedia" + i, "Creador" + i);
			serie[i] = s;
		}
		return serie;
	}

	// CONTADOR ENTREGADOS
	public void entregados(Object a) {
		int contador = 0;
		if (a.getClass() == Serie[].class) {
			Serie serie[] = (Serie[]) a;
			for (int i = 0; i < serie.length; i++) {
				if (serie[i].isEntregado()) {
					contador++;
					System.out.println("La serie: " + serie[i].getTitulo() + " ha sido ENTREGADA");
				}
			}
			System.out.println("En total se han entregado " + contador + " peliculas");
		}
	}

	// VERIFICAR TEMPORADAS ESTIMADA
	public void maxTemporadasSeries(Serie series[]) {
		int pos = 0;
		for (int i = 0; i < series.length; i++) {
			if (series[pos].getNumeroTemporadas() < series[i].getNumeroTemporadas()) {
				pos = i;
			}
		}
		System.out.println(series[pos].toString());
	}
}
