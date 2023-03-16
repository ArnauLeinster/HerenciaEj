package ejercicio4;

public class Raiz {
	int a;
	int b;
	int c;

	public Raiz(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double ecuacionPos(Raiz r) {
		double result = 0;

		result = ((-r.b) + Math.sqrt(Math.pow(r.b, 2) - (4 * r.a * r.c))) / (2 * r.a);

		return result;
	}

	public double ecuacionNeg(Raiz r) {
		double result = 0;

		result = ((-r.b) - Math.sqrt(Math.pow(r.b, 2) - (4 * r.a * r.c))) / (2 * r.a);

		return result;
	}

	public double getDiscriminate(Raiz r) {
		double result;

		result = (Math.pow(r.b, 2)) - (4 * r.a * r.c);

		return result;
	}

	public boolean tieneRaices(Raiz r) {
		boolean result;

		result = (getDiscriminate(r) >= 0);

		return result;
	}

	public boolean tieneRaiz(Raiz r) {
		boolean result;

		result = (getDiscriminate(r) == 0);

		return result;
	}

	public void calcular(Raiz r) {

		if (tieneRaiz(r)) {

			obtenerRaiz(r);

		} else if (tieneRaices(r)) {

			obtenerRaices(r);

		} else {

			System.out.println("No existen soluciones");

		}

	}

	public void obtenerRaices(Raiz r) {

		System.out.println("Soluciones: " + ecuacionPos(r) + " y " + ecuacionNeg(r));

	}

	public void obtenerRaiz(Raiz r) {

		System.out.println("Solucion: " + ecuacionPos(r));

	}

}