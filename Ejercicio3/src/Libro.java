
public class Libro {
	private String ISBN="1340901217";
	private String titulo=null;
	private String autor=null;
	private int numPag=30;
	
	//getters y setters 
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
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	//default constructor
	public Libro()
	{
		this.ISBN="1340901217";
		this.titulo=null;
		this.autor=null;
		this.numPag=30;
	}
	//constructor that ask for ISBN 
	public Libro(String ISBN_new)
	{
		this.ISBN=ISBN_new;
	}
	//constructor that have almost everything
	public Libro(String title,String author,int nuPag)
	{
		this.titulo=title;
		this.autor=author;
		this.numPag=nuPag;
	}
	//toString to show the message
	public String toString()
	{
		return ("El libro "+this.titulo+" con autor "+this.autor+" que tiene "+this.numPag+" paginas, tiene el ISBN de "+ this.ISBN);
	}
}

