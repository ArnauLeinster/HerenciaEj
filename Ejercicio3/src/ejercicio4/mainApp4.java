package ejercicio4;
/**
 * @author aitor arnau marc
 *
 */
public class mainApp4 {

	public static void main(String[] args) {
		//We assign our values in the root
		Raiz r1 = new Raiz(1,5,3);
		//We print the Discriminate
		System.out.println(r1.getDiscriminate(r1));
		//We calculate the solutions to the math problem if there are any
		r1.calcular(r1);
	}

}
