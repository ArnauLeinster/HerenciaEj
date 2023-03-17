package ejercicio4;
/**
 * @author aitor arnau marc
 *
 */
public class Raiz {
	int a;
	int b;
	int c;

	//Constructor with the data that we will be using in this java class
	public Raiz(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Positive second degree equation result
	public double ecuacionPos(Raiz r) {
		double result = 0;

		result = ((-r.b) + Math.sqrt(Math.pow(r.b, 2) - (4 * r.a * r.c))) / (2 * r.a);

		return result;
	}

	//Negative second degree equation result
	public double ecuacionNeg(Raiz r) {
		double result = 0;

		result = ((-r.b) - Math.sqrt(Math.pow(r.b, 2) - (4 * r.a * r.c))) / (2 * r.a);

		return result;
	}

	//Here we obtain the discriminate value
	public double getDiscriminate(Raiz r) {
		double result;

		result = (Math.pow(r.b, 2)) - (4 * r.a * r.c);

		return result;
	}

	//Here we calculate if there is are multiple roots
	public boolean tieneRaices(Raiz r) {
		boolean result;

		result = (getDiscriminate(r) >= 0);

		return result;
	}

	
	//Here we calculate if there is a singular root
	public boolean tieneRaiz(Raiz r) {
		boolean result;

		result = (getDiscriminate(r) == 0);

		return result;
	}

	//Here we use the methods above to calculate the solution to the equation
	public void calcular(Raiz r) {

		if (tieneRaiz(r)) {

			obtenerRaiz(r);

		} else if (tieneRaices(r)) {

			obtenerRaices(r);

		} else {

			System.out.println("No existen soluciones");

		}

	}

	//Here we obtain the multiple roots
	public void obtenerRaices(Raiz r) {

		System.out.println("Soluciones: " + ecuacionPos(r) + " y " + ecuacionNeg(r));

	}

	//Here we obtain a singular root
	public void obtenerRaiz(Raiz r) {

		System.out.println("Solucion: " + ecuacionPos(r));

	}

}