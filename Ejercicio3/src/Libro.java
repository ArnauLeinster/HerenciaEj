/**
 * @author aitor arnau marc
 *
 */
public class Libro {
	// ATRIBUTOS
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPag;

	//CONSTRUCTORES
	public Libro() {
		this.ISBN = "1340901217";
		this.titulo = null;
		this.autor = null;
		this.numPag = 30;
	}
	public Libro(String ISBN_new) {
		this.ISBN = ISBN_new;
	}
	public Libro(String title, String author, int nuPag) {
		this.titulo = title;
		this.autor = author;
		this.numPag = nuPag;
	}


	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	

	// toString to show the message
	public String toString() {
		return ("El libro " + this.titulo + " con autor " + this.autor + " que tiene " + this.numPag
				+ " paginas, tiene el ISBN de " + this.ISBN);
	}
	
	//GETTERS Y SETTERS
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}
}
