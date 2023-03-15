
public class mainApp {
	public static void main(String[] args) {
		 Libro l1=new Libro("1234567890");
		 Libro l2=new Libro("Pedro","No hay Mundo",10);
		 System.out.println(l1.toString());
		 System.out.println(l2.toString());
		 morePages(l1.getNumPag(),l2.getNumPag());
		 
	}
	public static void morePages(int numPage1,int numPage2) 
	{
		if(numPage1>numPage2)
		{
			System.out.println("El libro numero 1 tiene más paginas que el segundo");
		}
		else if(numPage1<numPage2)
		{
			System.out.println("El libro numero 2 tiene más paginas que el primero");
		}
		else
			System.out.println("Tienen la misma cantidad de paginas los 2 libros");
	}
}
