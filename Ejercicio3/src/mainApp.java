
public class mainApp {
	public static void main(String[] args) {
		 Libro l1=new Libro("1234567890");
		 Libro l2=new Libro("Pedro","No hay Mundo",10);
		 System.out.println(l1.toString());
		 System.out.println(l2.toString());
		 morePages(l1,l2);
		 
	}
	public static void morePages(Libro l1,Libro l2) 
	{
		if(l1.getNumPag()>l2.getNumPag())
		{
			System.out.println("El libro"+l1.getTitulo()+" tiene más paginas que "+l2.getTitulo());
		}
		else if(l1.getNumPag()<l2.getNumPag())
		{
			System.out.println("El libro"+l2.getTitulo()+"tiene más paginas que "+l1.getTitulo());
		}
		else
			System.out.println("Tienen la misma cantidad de paginas los 2 libros");
	}
}
